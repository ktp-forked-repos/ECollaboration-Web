package com.general.service;

import java.util.List;

import com.general.dto.ErrorDTO;
import com.general.dto.QuestionDTO;

public interface QuestionaireService {
	//teacher, student share it
	//getQuestionaire
	public List<QuestionDTO> getQuestionaire(String json,String projectToken);
	//for student
	//studentPutQuestionaire
	public ErrorDTO submitQuestionaire(String json,String projectToken);
	//for tutor
	//tutorPutQuestionaire
	public ErrorDTO saveQuestionaire(String json,String questionaireToken);

}
