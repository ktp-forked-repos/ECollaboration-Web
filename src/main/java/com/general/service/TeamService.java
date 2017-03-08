package com.general.service;

import java.util.List;

import com.general.dto.ApplicationDTO;
import com.general.dto.ProjectTeamDTO;
import com.general.dto.TeamDTO;
import com.general.param.tutor.ApplicationListParam;
import com.general.param.tutor.TeamListOverviewParam;
import com.general.param.tutor.TeamListParam;

public interface TeamService {
	//getTeamListOverview
	public List<TeamDTO> getTeamProgressList(TeamListOverviewParam teamListOverviewParam);
	//getTeamList
	public List<ProjectTeamDTO> getAcceptedTeamList(TeamListParam teamListParam, String projectToken);
	//from ProjectApplicationService
	//getApplicationList
	public List<ApplicationDTO> getApplyingTeamList(ApplicationListParam applicationListParam, String projectToken);
	
}
