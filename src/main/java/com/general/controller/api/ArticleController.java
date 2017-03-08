package com.general.controller.api;

import java.util.List;

import com.general.param.student.ArticleListParam;
import com.general.service.ArticleService;
import com.general.dto.StudentArticleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.general.dto.TutorArticleDTO;

@Controller
@RequestMapping("/api/articles")
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	//studentGetTopicList
	public List<StudentArticleDTO> studentGetArticleList(ArticleListParam articleListParam){


		return articleService.studentGetTopicList(articleListParam);
	}
	//tutorGetTopicList
	public List<TutorArticleDTO> tutorGetArticleList(com.general.param.tutor.ArticleListParam articleListParam){

		return articleService.tutorGetTopicList(articleListParam);
	}
}
