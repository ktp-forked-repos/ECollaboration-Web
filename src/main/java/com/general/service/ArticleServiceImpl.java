package com.general.service;

import java.util.*;

import com.general.dao.EntityDAO;
import com.general.dao.ProjectEntityDAOImpl;
import com.general.dao.entity.ProjectEntity;
import com.general.dao.entity.TeamEntity;
import com.general.dto.StudentArticleDTO;
import com.general.dto.TutorArticleDTO;
import com.general.param.tutor.ArticleListParam;
import com.general.service.articleService.StudentGetTopicList;
import com.general.service.articleService.TutorGetTopicList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ProjectEntityDAOImpl projectEntityDAO;
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
	//studentGetArticleList
	public List<StudentArticleDTO> studentGetTopicList(com.general.param.student.ArticleListParam articleListParam){
        List<StudentArticleDTO> studentArticleDTOs = new StudentGetTopicList().
                invoke(articleListParam, projectEntityDAO);
        return studentArticleDTOs;
	}



    //tutorGetArticleList
	public List<TutorArticleDTO> tutorGetTopicList(ArticleListParam articleListParam){
        List<TutorArticleDTO> tutorArticleDTOs = new TutorGetTopicList().invoke(articleListParam, projectEntityDAO);
		return tutorArticleDTOs;
	}

}
