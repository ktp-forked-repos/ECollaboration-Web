package com.general.service;

import java.util.List;

import com.general.dto.StudentArticleDTO;
import com.general.dto.TutorArticleDTO;
import com.general.param.tutor.ArticleListParam;

public interface ArticleService {
	//studentGetArticleList
	public List<StudentArticleDTO> studentGetTopicList(com.general.param.student.ArticleListParam articleListParam);
	//tutorGetArticleList
	public List<TutorArticleDTO> tutorGetTopicList(ArticleListParam articleListParam);
}
