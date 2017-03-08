package com.general.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.general.dao.EntityDAO;
import com.general.dao.entity.*;
import com.general.dto.ApplicantDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.Team;
import com.general.param.student.ApplicationStudentListParam;
import com.general.param.student.TeamMemberToAddParam;
import com.general.param.student.TeamMemberToRemoveParam;
import com.general.service.projectApplicationService.PullApplicantIntoTeam;
import com.general.util.EntityUtil;
import org.hibernate.engine.query.spi.HQLQueryPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectApplicationServiceImpl implements ProjectApplicationService {
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
    @Autowired
    EntityUtil entityUtil;
	//getApplicationStudentList
	public List<ApplicantDTO> getApplicantList(ApplicationStudentListParam applicationStudentListParam, String projectToken){
		return null;
	}
	//putApplicationStudent
	public ErrorDTO pullApplicantIntoTeam(TeamMemberToAddParam teamMemberToAddParam,
                                          String projectToken,
                                          String studentToken){
        //studentToken belongs to pullee
        String userId="2";
        return new PullApplicantIntoTeam().invoke(teamMemberToAddParam,
                projectToken, studentToken, userId, entityDAO, entityUtil);

    }


    //deleteApplicationStudent
	public ErrorDTO kickMemberOutOfTeam(TeamMemberToRemoveParam teamMemberToRemoveParam,
                                        String projectToken,
                                        String studentToken){
        String userId;//needed for leader validation
        //TODO kicker must be leader of kickee's team
        TeamStudentEntity kickeeTeamStudentEntity =
                entityUtil.getTeamStudentByUserAndProject(projectToken, Integer.parseInt(studentToken));
        kickeeTeamStudentEntity.setFailAt(new Timestamp(new Date().getTime()));
        entityDAO.updateEntity(kickeeTeamStudentEntity);
        ErrorDTO errorDTO=new ErrorDTO();
        errorDTO.setError("success");
        return errorDTO;
	}
	//解散组队
	//deleteApplication
	public ErrorDTO disbandTeam(String json,String projectToken){
		return null;
	}
	//确认建立队伍
	//putApplication
	public ErrorDTO finishFormingTeam(String json,String projectToken){
		return null;
	}
	//getApplicationList
	//To TeamService
	
	
}
