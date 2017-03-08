package com.general.controller.api;

import com.general.dto.*;
import com.general.param.tutor.ScoreAdviceParam;
import com.general.param.tutor.ScoreForStudentParam;
import com.general.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/scores")
public class ScoreController {
	@Autowired
	private ScoreService scoreService;


	//createScoreAdvice
	@RequestMapping(value="/advice/projects/{project_token}",method=RequestMethod.PUT)
	public ErrorDTO putScoreAdvice(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return scoreService.createScoreAdvice(json, projectToken);
	}
	//getTokenForTutorCreatingTeamScore
	@RequestMapping(value="/teams/{team_token}",method=RequestMethod.POST)
	public TokenDTO postScoreForTeam(@RequestBody String json,@PathVariable("team_token") String teamToken){
		return scoreService.getTokenForTutorCreatingTeamScore(json, teamToken);
	}
	//tutorCreateTeamScore
	@RequestMapping(value="/transaction/{transaction_token}")
	public ErrorDTO putScoreForTeam(@RequestBody String json,@PathVariable("transaction_token") String transactionToken){
		return scoreService.tutorCreateTeamScore(json, transactionToken);
	}
	//evaluateIndividual
	@RequestMapping(value="/students/teams/{team_token}")
	public ErrorDTO putScoreForStudent(@RequestBody String json,@PathVariable("team_token") String teamToken){
		return scoreService.evaluateIndividual(json, teamToken);
	}
	//getLeaderAdvicedScore
	@RequestMapping(value="/advice/teams/{team_token}")
	public ScoreAdviceDTO getScoreAdvice(ScoreAdviceParam scoreAdviceParam, @PathVariable("team_token") String teamToken){
		return scoreService.getLeaderAdvicedScore(scoreAdviceParam, teamToken);
	}
	//getScore
	@RequestMapping(value="/projects/{project_token}")
	public ScoreDTO getScore(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return scoreService.getScore(json, projectToken);
	}
	//getTeamScore
	@RequestMapping(value="/projects/{project_token}/teams")
	public TeamScoreDTO getTeamScore(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return scoreService.getTeamScore(json, projectToken);
	}
    //getScoreForStudent
	@RequestMapping(value = "/teams/{team_token}")
    public ScoreForStudentDTO getScoreForStudent(@RequestBody ScoreForStudentParam scoreForStudentParam,
                                                 @PathVariable("team_token") String teamToken){
        return scoreService.getScoreForStudent(scoreForStudentParam, teamToken);
    }
	
}
