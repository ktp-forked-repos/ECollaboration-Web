package com.general.dao;


import com.general.dao.entity.ProjectEntity;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by joanna on 2/13/17.
 */
@Repository
public class ProjectEntityDAOImpl extends EntityDAOImpl{
    public List<ProjectEntity> getProjectEntities(int year){
        String HQL="from ProjectEntity p where p.year="+"'"+year+"-01-01"+"'";
        List<ProjectEntity> projectEntities=getAllEntities(HQL, ProjectEntity.class);
        return projectEntities;
    }
}
