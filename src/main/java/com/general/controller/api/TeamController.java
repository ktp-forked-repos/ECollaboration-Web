package com.general.controller.api;

import java.util.List;

import com.general.param.tutor.TeamListOverviewParam;
import com.general.param.tutor.TeamListParam;
import com.general.dto.ProjectTeamDTO;
import com.general.dto.TeamDTO;
import com.general.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/teams")
public class TeamController {
	@Autowired
	private TeamService teamService;


	//getTeamProgressList
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<TeamDTO> getTeamListOverview(TeamListOverviewParam teamListOverviewParam){
		
		return teamService.getTeamProgressList(teamListOverviewParam);
	}
	//getAcceptedTeamList
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.GET)
	public List<ProjectTeamDTO> getTeamList(TeamListParam teamListParam, @PathVariable String projectToken){
		return teamService.getAcceptedTeamList(teamListParam, projectToken);
	}
	
}
