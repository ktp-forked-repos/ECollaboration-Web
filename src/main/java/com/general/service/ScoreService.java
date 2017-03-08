package com.general.service;

import com.general.dto.*;
import com.general.param.tutor.ScoreAdviceParam;
import com.general.param.tutor.ScoreForStudentParam;

public interface ScoreService {
	//putScoreAdvice
	public ErrorDTO createScoreAdvice(String json, String projectToken);
	//postScoreForTeam	
	public TokenDTO getTokenForTutorCreatingTeamScore(String json, String teamToken);
	//putScoreForTeam
	public ErrorDTO tutorCreateTeamScore(String json,String transactionToken);
	//putScoreForStudent
	public ErrorDTO evaluateIndividual(String json,String teamToken);
	//getScoreAdvice
	public ScoreAdviceDTO getLeaderAdvicedScore(ScoreAdviceParam scoreAdviceParam, String teamToken);
	//getScore
	public ScoreDTO getScore(String json, String projectToken);
	//getTeamScore
	public TeamScoreDTO getTeamScore(String json, String projectToken);
    //getScoreForStudent
    public ScoreForStudentDTO getScoreForStudent(ScoreForStudentParam scoreForStudentParam, String teamToken);

}
