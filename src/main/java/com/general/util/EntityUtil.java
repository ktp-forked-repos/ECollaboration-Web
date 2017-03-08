package com.general.util;

import com.general.dao.EntityDAO;
import com.general.dao.EntityDAOImpl;
import com.general.dao.entity.TeamEntity;
import com.general.dao.entity.TeamStudentEntity;
import com.general.dao.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;

/**
 * Created by joanna on 2/18/17.
 */
@Service
@Transactional
public class EntityUtil {
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
    public TeamEntity getTeambyUserAndProject(String projectId, int userId) {
        for(Iterator<TeamEntity> i = entityDAO.
                getEntity(userId, UserEntity.class).
                getStudentById().
                getTeamsByUser().
                iterator(); i.hasNext();){
            TeamEntity teamEntity = i.next();
            if(teamEntity.getProject().equals(Integer.valueOf(projectId))){
                return teamEntity;
            }
        }
        return null;
    }
    public TeamStudentEntity getTeamStudentByUserAndProject(String projectId, int userId){

        for(Iterator<TeamStudentEntity> i=entityDAO.getEntity(userId, UserEntity.class).
                getStudentById().getTeamStudentsByUser().iterator(); i.hasNext(); ){
            TeamStudentEntity teamStudentEntity = i.next();
            if(teamStudentEntity.getTeamByTeam().getProject().equals(Integer.valueOf(projectId))){
                return teamStudentEntity;
            }
        }
        return null;
    }
}
