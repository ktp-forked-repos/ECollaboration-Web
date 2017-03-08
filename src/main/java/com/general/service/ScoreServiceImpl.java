package com.general.service;

import com.general.dao.EntityDAO;
import com.general.dao.entity.*;
import com.general.dto.*;
import com.general.param.tutor.ScoreAdviceParam;
import com.general.param.tutor.ScoreForStudentParam;
import com.general.service.scoreService.GetLeaderAdvicedScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class ScoreServiceImpl implements ScoreService {
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
	//putScoreAdvice
	public ErrorDTO createScoreAdvice(String json, String projectToken){
		return null;
	}
	//postScoreForTeam	
	public TokenDTO getTokenForTutorCreatingTeamScore(String json, String teamToken){
		return null;
	}
	//putScoreForTeam
	public ErrorDTO tutorCreateTeamScore(String json,String transactionToken){
		return null;
	}
	//putScoreForStudent
	public ErrorDTO evaluateIndividual(String json,String teamToken){
		return null;
	}
	//getScoreAdvice
	public ScoreAdviceDTO getLeaderAdvicedScore(ScoreAdviceParam scoreAdviceParam, String teamToken){
        teamToken="1";
        ScoreAdviceDTO scoreAdviceDTO = new GetLeaderAdvicedScore().invoke(teamToken, entityDAO);
        return scoreAdviceDTO;
	}
    //getScore
	public ScoreDTO getScore(String json, String projectToken){
		return null;
	}	
	//getTeamScore
	public TeamScoreDTO getTeamScore(String json, String projectToken){
		return null;
	}

	//getScoreForStudent
    @Override
    public ScoreForStudentDTO getScoreForStudent(ScoreForStudentParam scoreForStudentParam, String teamToken) {
        teamToken="1";
        TeamEntity teamEntity = entityDAO.getEntity(Integer.parseInt(teamToken), TeamEntity.class);
        UserEntity leaderUserEntity = teamEntity.getStudentByLeader().getUserByUser();
        ScoreForStudentDTO scoreForStudentDTO=new ScoreForStudentDTO();
        ScoreForStudentDTO.LeaderBean leaderBean=new ScoreForStudentDTO.LeaderBean();
        leaderBean.setName(leaderUserEntity.getName());
        leaderBean.setToken(String.valueOf(leaderUserEntity.getId()));
        List<ScoreForStudentDTO.MemberBean> memberBeans=new LinkedList<>();
        for(Iterator<TeamStudentEntity> i=teamEntity.getTeamStudentsById().iterator(); i.hasNext(); ){
            TeamStudentEntity teamStudentEntity = i.next();
            if(teamStudentEntity.getMember().equals(Integer.valueOf(leaderBean.getToken()))){
                //this is the leader
                leaderBean.setScore(teamStudentEntity.getScore());
            }else{
                //this is not the leader
                ScoreForStudentDTO.MemberBean memberBean=new ScoreForStudentDTO.MemberBean();
                memberBean.setScore(teamStudentEntity.getScore());
                memberBean.setToken(String.valueOf(teamStudentEntity.getMember()));
                memberBean.setName(teamStudentEntity.getStudentByMember().getUserByUser().getName());
                memberBeans.add(memberBean);
            }
        }
        scoreForStudentDTO.setLeader(leaderBean);
        scoreForStudentDTO.setMembers(memberBeans);

        return scoreForStudentDTO;
    }
}
