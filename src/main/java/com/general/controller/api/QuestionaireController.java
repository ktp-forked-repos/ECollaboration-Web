package com.general.controller.api;

import java.util.List;

import com.general.service.QuestionaireService;
import com.general.dto.QuestionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.general.dto.ErrorDTO;

@Controller
@RequestMapping("/api/questionaires")
public class QuestionaireController {
	@Autowired
	private QuestionaireService questionaireService;


	//getQuestionaire
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.GET)
	public List<QuestionDTO> getQuestionaire(@RequestBody String json, @PathVariable("project_token") String projectToken){
		return questionaireService.getQuestionaire(json, projectToken);
	}
	//submitQuestionaire
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.PUT)
	public ErrorDTO studentPutQuestionaire(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return questionaireService.submitQuestionaire(json, projectToken);
	}
	//saveQuestionaire
	@RequestMapping(value="/{questionaire_token}",method=RequestMethod.PUT)
	public ErrorDTO tutorPutQuestionaire(@RequestBody String json,@PathVariable("questionaire_token") String questionaireToken){
		return questionaireService.saveQuestionaire(json, questionaireToken);
	}

}
