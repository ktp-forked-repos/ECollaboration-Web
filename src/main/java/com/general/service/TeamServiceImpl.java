package com.general.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.general.dao.EntityDAO;
import com.general.dao.entity.*;
import com.general.dto.ApplicationDTO;
import com.general.dto.ProjectTeamDTO;
import com.general.dto.TeamDTO;
import com.general.dto.User;
import com.general.param.tutor.ApplicationListParam;
import com.general.param.tutor.TeamListOverviewParam;
import com.general.param.tutor.TeamListParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
    //getTeamListOverview
	public List<TeamDTO> getTeamProgressList(TeamListOverviewParam teamListOverviewParam){
        int tutorId = 1;
        List<TeamDTO> teamDTOList = new ArrayList<TeamDTO>();

        String HQL = "from ProjectEntity p where p.tutor="+tutorId;
        List<ProjectEntity> projectList = entityDAO.getAllEntities(HQL, ProjectEntity.class);
        System.out.println("projectList="+projectList.size());

        for(ProjectEntity projectEntity : projectList){
            String HQL2 = "from TeamEntity t where t.project="+projectEntity.getId()+" and t.passAt!=NULL";
            List<TeamEntity> teamEntityList = entityDAO.getAllEntities(HQL2, TeamEntity.class);
            System.out.println("teamEntityList="+teamEntityList.size());
            for(TeamEntity teamEntity : teamEntityList){
                TeamDTO teamDTO = new TeamDTO();
                teamDTO.setTitle(teamEntity.getName());

                UserEntity leader = entityDAO.getEntity(teamEntity.getLeader(), UserEntity.class);
                com.general.dto.Team team = new com.general.dto.Team();
                team.setLeaderName(leader.getName());

                List<String> members = new ArrayList<String>();
                List<TeamStudentEntity> membersDAO = entityDAO.getAllEntities("from TeamStudentEntity t where t.team="+teamEntity.getId(), TeamStudentEntity.class);
                for(TeamStudentEntity member : membersDAO){
                    UserEntity user = entityDAO.getEntity(member.getMember(), UserEntity.class);
                    members.add(user.getName());
                }
                System.out.println("members="+members.size());
                team.setMember(members);

                team.setTeamToken(teamEntity.getId().toString());

                team.setProgress(this.forProgress(entityDAO, teamEntity.getId()));

                teamDTO.setTeam(team);
                teamDTOList.add(teamDTO);
            }
        }
        return teamDTOList;

    }
	//getTeamList
	public List<ProjectTeamDTO> getAcceptedTeamList(TeamListParam teamListParam, String projectToken){
        int projectId = 1;
        String applytoken = "token";
        List<ProjectTeamDTO> acceptedList = new ArrayList<ProjectTeamDTO>();
        ProjectTeamDTO projectTeamDTO = null;

        String HQL = "from TeamEntity t where t.project="+projectId+" and t.passAt!=NULL";
        List<TeamEntity> teamEntityList = entityDAO.getAllEntities(HQL, TeamEntity.class);

        if(teamEntityList.size()==0){
            return null;
        }
        for(TeamEntity te : teamEntityList){
            projectTeamDTO = new ProjectTeamDTO();
            projectTeamDTO.setTeamToken(applytoken);//???

            User leader = new User();
            UserEntity leaderEntity = entityDAO.getEntity(te.getLeader(), UserEntity.class);
            leader.setName(leaderEntity.getName());
            leader.setToken("");//???
            projectTeamDTO.setLeader(leader);

            List<User> userList = new ArrayList<User>();
            Set<TeamStudentEntity> teamStudentEntitySet = te.getTeamStudentsById();
            setMembers(teamStudentEntitySet, userList, entityDAO);
            projectTeamDTO.setMembers(userList);

            projectTeamDTO.setApplyTime(te.getApplyAt());

            projectTeamDTO.setPassTime(te.getPassAt());

            acceptedList.add(projectTeamDTO);
        }
        return acceptedList;
	}
	//from ProjectApplicationService
	//getApplicationList
	public List<ApplicationDTO> getApplyingTeamList(ApplicationListParam applicationListParam, String projectToken){
        int projectId = 1;
        String apptoken = "token";
        List<ApplicationDTO> applist = new ArrayList<ApplicationDTO>();
        ApplicationDTO applicationDTO = null;

        String HQL = "from TeamEntity t where t.project="+projectId+" and t.passAt=NULL and t.failAt=NULL";
        List<TeamEntity> teamEntityList = entityDAO.getAllEntities(HQL, TeamEntity.class);

        if(teamEntityList.size()==0){
            return null;
        }
        for(TeamEntity te : teamEntityList){
            applicationDTO = new ApplicationDTO();
            applicationDTO.setToken(apptoken);//???

            User leader = new User();
            UserEntity leaderEntity = entityDAO.getEntity(te.getLeader(), UserEntity.class);
            leader.setName(leaderEntity.getName());
            leader.setToken("");//???
            applicationDTO.setLeader(leader);

            List<User> userList = new ArrayList<User>();
            Set<TeamStudentEntity> teamStudentEntitySet = te.getTeamStudentsById();
            setMembers(teamStudentEntitySet, userList, entityDAO);
            applicationDTO.setMembers(userList);

            applicationDTO.setApplyTime(te.getApplyAt());

            applist.add(applicationDTO);
        }
        return applist;	}

    private void setMembers(Set<TeamStudentEntity> teamStudentEntitySet, List<User> userList, EntityDAO entityDAO){
        for(TeamStudentEntity tse : teamStudentEntitySet){
            User user = new User();
            UserEntity userEntity = entityDAO.getEntity(tse.getMember(), UserEntity.class);
            user.setName(userEntity.getName());
            String token = "";//???
            user.setToken(token);
            userList.add(user);
        }
    }

    public String forProgress(EntityDAO entityDAO, int teamId){//存在未提交计划
        List<PlanTeamEntity> planTeamList = entityDAO.getAllEntities("from PlanTeamEntity p where p.team="+teamId+" and p.submitAt=NULL", PlanTeamEntity.class);
        if(planTeamList.size()==1){
            PlanEntity plan = entityDAO.getEntity(planTeamList.get(0).getPlan(), PlanEntity.class);
            return plan.getTitle();
        }else if(planTeamList.size()>1){
            StringBuffer s = new StringBuffer();
            for(PlanTeamEntity pt : planTeamList){
                PlanEntity planEntity = entityDAO.getEntity(pt.getPlan(), PlanEntity.class);
                s.append(planEntity.getTitle()+"；");
            }
            return s.toString();
        }else{
            return this.forLastProgress(entityDAO, teamId);
        }
    }

    public String forLastProgress(EntityDAO entityDAO, int teamId){//不存在未提交计划，在已提交计划中查找最后提交计划
        List<PlanTeamEntity> planList = entityDAO.getAllEntities("from PlanTeamEntity p where p.team="+teamId+" and p.submitAt!=NULL", PlanTeamEntity.class);
        Timestamp tOld = null;
        int recorder=-1;
        for(int i=0; i<planList.size();i++){
            if(i<=0){
                tOld = planList.get(i).getSubmitAt();
                recorder = 0;
            }else {
                if(tOld.before(planList.get(i).getSubmitAt())){
                    recorder = i;
                    tOld = planList.get(i).getSubmitAt();
                }
            }
        }
        if(recorder<=-1){
            return "还未定制任何计划";
        }
        PlanEntity plan = entityDAO.getEntity(planList.get(recorder).getPlan(), PlanEntity.class);
        return "已完成："+plan.getTitle();
    }
}
