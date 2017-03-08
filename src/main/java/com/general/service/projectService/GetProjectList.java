package com.general.service.projectService;

import com.general.dao.EntityDAO;
import com.general.dao.entity.ProjectEntity;
import com.general.dao.entity.TeamEntity;
import com.general.dao.entity.UserEntity;
import com.general.dto.ProjectDTO;
import com.general.param.student.ProjectListParam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by joanna on 2/20/17.
 */

/**
 * 1. In Team table, apply_at being there but no pass_at and no fail_at means checking status
   2. In Team table, pass_at has value means passed
 */
public class GetProjectList {
    public List<ProjectDTO> invoke(ProjectListParam projectListParam, int userId, EntityDAO entityDAO) {
        List<TeamEntity> demandingTeamEntities = getDemandingTeamEntities(projectListParam, userId, entityDAO);
        //fill dtos to be returned
        List<ProjectDTO> projectDTOs = fillProjectDTOs(demandingTeamEntities);
        return projectDTOs;
    }

    private List<TeamEntity> getDemandingTeamEntities(ProjectListParam projectListParam, int userId, EntityDAO entityDAO) {
        UserEntity userEntity=entityDAO.getEntity(userId, UserEntity.class);
        Set<TeamEntity> teamEntities = userEntity.getStudentById().getTeamsByUser();
        String status=projectListParam.getStatus();
        List<TeamEntity> demandingTeamEntities=new LinkedList<>();
        for(Iterator<TeamEntity> iterator = teamEntities.iterator(); iterator.hasNext();){
            TeamEntity teamEntity = iterator.next();
            if("checking".equals(status)){//return project list waiting to be checked
                if((teamEntity.getApplyAt()!=null)&&(teamEntity.getPassAt()==null)&&(teamEntity.getFailAt()!=null))
                    demandingTeamEntities.add(teamEntity);
            }else{//otherwise return list of passed projects
                if(teamEntity.getPassAt()!=null)
                    demandingTeamEntities.add(teamEntity);
            }
        }
        return demandingTeamEntities;
    }

    private List<ProjectDTO> fillProjectDTOs(List<TeamEntity> demandingTeamEntities) {
        List<ProjectDTO> projectDTOs=new LinkedList<>();
        for(Iterator<TeamEntity> i = demandingTeamEntities.iterator(); i.hasNext();){
            TeamEntity demandingTeamEntity = i.next();
            ProjectEntity projectEntity = demandingTeamEntity.getProjectByProject();
            ProjectDTO projectDTO=new ProjectDTO();
            projectDTO.setTitle(projectEntity.getTitle());
            projectDTO.setToken(projectEntity.getId()+"");
            projectDTOs.add(projectDTO);
        }
        return projectDTOs;
    }

}
