package com.general.service;

import java.util.List;

import com.general.dto.ErrorDTO;
import com.general.dto.QuestionDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuestionaireServiceImpl implements QuestionaireService {
	//teacher, student share it
	//getQuestionaire
	public List<QuestionDTO> getQuestionaire(String json,String projectToken){
		return null;
	}
	//for student
	//studentPutQuestionaire
	public ErrorDTO submitQuestionaire(String json,String projectToken){
		return null;
	}
	//for tutor
	//tutorPutQuestionaire
	public ErrorDTO saveQuestionaire(String json,String questionaireToken){
		return null;
	}

}
