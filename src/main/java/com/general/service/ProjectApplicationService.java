package com.general.service;

import java.util.List;

import com.general.dto.ApplicantDTO;
import com.general.dto.ErrorDTO;
import com.general.param.student.ApplicationStudentListParam;
import com.general.param.student.TeamMemberToAddParam;
import com.general.param.student.TeamMemberToRemoveParam;

public interface ProjectApplicationService {
	//getApplicationStudentList
	public List<ApplicantDTO> getApplicantList(ApplicationStudentListParam applicationStudentListParam, String projectToken);
	//putApplicationStudent
	public ErrorDTO pullApplicantIntoTeam(TeamMemberToAddParam teamMemberToAddParam, String projectToken, String studentToken);
	//deleteApplicationStudent
	public ErrorDTO kickMemberOutOfTeam(TeamMemberToRemoveParam teamMemberToRemoveParam, String projectToken, String studentToken);
	//解散组队
	//deleteApplication
	public ErrorDTO disbandTeam(String json,String projectToken);
	//确认建立队伍
	//putApplication
	public ErrorDTO finishFormingTeam(String json,String projectToken);
	//getApplicationList
	//To TeamService
	
	
}
