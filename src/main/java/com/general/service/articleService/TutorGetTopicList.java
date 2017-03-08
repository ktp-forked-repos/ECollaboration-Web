package com.general.service.articleService;

import com.general.dao.ProjectEntityDAOImpl;
import com.general.dao.entity.ProjectEntity;
import com.general.dto.TutorArticleDTO;
import com.general.param.tutor.ArticleListParam;

import java.util.*;

/**
 * Created by joanna on 2/20/17.
 */
public class TutorGetTopicList {
    public List<TutorArticleDTO> invoke(ArticleListParam articleListParam, ProjectEntityDAOImpl projectEntityDAO) {
        int year=articleListParam.getYear();
        List<ProjectEntity> projectEntities;
        if(year==0){//get all topics
            projectEntities= projectEntityDAO.getAllEntities(ProjectEntity.class);
        }else{//get topics according to year
            projectEntities=projectEntityDAO.getProjectEntities(year);
        }
        List<TutorArticleDTO> tutorArticleDTOs = fillTutorArticleDTOs(projectEntities);
        return tutorArticleDTOs;
    }

    private List<TutorArticleDTO> fillTutorArticleDTOs(List<ProjectEntity> projectEntities) {
        List<TutorArticleDTO> tutorArticleDTOs=new LinkedList<>();
        for(Iterator<ProjectEntity> i = projectEntities.iterator(); i.hasNext(); ){
            ProjectEntity projectEntity = i.next();
            TutorArticleDTO tutorArticleDTO=new TutorArticleDTO();
            tutorArticleDTO.setToken(String.valueOf(projectEntity.getId()));
            tutorArticleDTO.setTitle(projectEntity.getTitle());
            tutorArticleDTO.setMaxTeamNum(projectEntity.getTeamMax());
            tutorArticleDTO.setMinMember(projectEntity.getMemberMin());
            tutorArticleDTO.setMaxMember(projectEntity.getMemberMax());
            tutorArticleDTO.setDeadline(projectEntity.getDeadline());
            //fill can_edit
            Calendar projectCalendar = Calendar.getInstance();
            projectCalendar.setTime(projectEntity.getYear());
            Calendar todayCalendar=Calendar.getInstance();
            todayCalendar.setTime(new Date());
            if(projectCalendar.get(Calendar.YEAR)==todayCalendar.get(Calendar.YEAR)){
                //this topic is of current year, so it's editable
                tutorArticleDTO.setCanEdit(true);
            }else{
                tutorArticleDTO.setCanEdit(false);
            }
            tutorArticleDTOs.add(tutorArticleDTO);
        }
        return tutorArticleDTOs;
    }

}
