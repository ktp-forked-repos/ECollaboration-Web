package com.general.service.projectApplicationService;

import com.general.dao.EntityDAO;
import com.general.dao.entity.*;
import com.general.dto.ErrorDTO;
import com.general.param.student.TeamMemberToAddParam;
import com.general.util.EntityUtil;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by joanna on 2/28/17.
 */
public class PullApplicantIntoTeam {
    public ErrorDTO invoke(TeamMemberToAddParam teamMemberToAddParam,
                            String projectToken,
                            String studentToken,
                            String userId,
                            EntityDAO entityDAO,
                            EntityUtil entityUtil) {
        //one can be pulled to a team
        // 1. when user is a team leader for this project
        // 2. when this team hasn't apply, which means no apply_at
        // 3. when this team doesn't reach the upper bound required by its project
        // 4. confirm code belongs to pulee in this project
        // 5. pullee hasn't joined any team in this project
        //puller pulls pullee into team
        UserEntity pullerUserEntity = entityDAO.getEntity(Integer.parseInt(userId), UserEntity.class);
        StudentEntity pulleeStudentEntity = entityDAO.getEntity(Integer.parseInt(studentToken), StudentEntity.class);
        TeamEntity teamEntity = entityUtil.getTeambyUserAndProject(projectToken, Integer.parseInt(userId));
        //leader
        if(!teamEntity.getLeader().equals(pullerUserEntity.getId())){
            //this puller isn't leader of his team in this project
            ErrorDTO errorDTO=new ErrorDTO();
            errorDTO.setError("Puller isn't leader of his team in this project");
            return errorDTO;
        }
        //apply_at
        if(teamEntity.getApplyAt()!=null){
            //shows puller's team for this project has already apply
            ErrorDTO errorDTO=new ErrorDTO();
            errorDTO.setError("Team has already applied");
            return errorDTO;
        }
        //max_member
        //TODO calculate team size correctly
        // team's current member number can't be calculated like that.
        // no fail_at means current member of the team
        if(teamEntity.getTeamStudentsById().size()>=
                entityDAO.getEntity(Integer.parseInt(projectToken), ProjectEntity.class).getMemberMax()){
            //team's size is equal to or bigger than max size required
            ErrorDTO errorDTO=new ErrorDTO();
            errorDTO.setError("team's size is equal to or bigger than max size");
            return errorDTO;
        }
        //confirmCode validation
        if(!teamMemberToAddParam.getConfirmCode().equals(
                entityDAO.getAllEntities("from ProjectStudentEntity p " +
                        "where p.project="+projectToken+" and p.student="+studentToken, ProjectStudentEntity.class).
                        get(0).getConfirmCode())){
            //the confirm code doesn't belong to pullee in this project
            ErrorDTO errorDTO=new ErrorDTO();
            errorDTO.setError("Confirm code doesn't belong to pullee in this project");
            return errorDTO;
        }
        //hasn't join any team in this project
        //do business login
        TeamStudentEntity teamStudentEntity=new TeamStudentEntity();
        teamStudentEntity.setTeam(teamEntity.getId());
        teamStudentEntity.setMember(pulleeStudentEntity.getUser());
        teamStudentEntity.setPassAt(new Timestamp(new Date().getTime()));
        entityDAO.createEntity(teamStudentEntity);
        ErrorDTO errorDTO=new ErrorDTO();
        errorDTO.setError("success");
        return errorDTO;
    }

}
