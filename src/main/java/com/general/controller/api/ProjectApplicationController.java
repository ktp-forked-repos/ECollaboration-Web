package com.general.controller.api;

import java.util.List;

import com.general.param.student.ApplicationStudentListParam;
import com.general.param.student.TeamMemberToAddParam;
import com.general.param.student.TeamMemberToRemoveParam;
import com.general.param.tutor.ApplicationListParam;
import com.general.service.ProjectApplicationService;
import com.general.service.TeamService;
import com.general.service.TeamServiceImpl;
import com.general.dto.ApplicantDTO;
import com.general.dto.ApplicationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.general.dto.ErrorDTO;

@Controller
@RequestMapping("/api/projects")
public class ProjectApplicationController {
	@Autowired
	private ProjectApplicationService projectApplicationService;


	//getApplicantList
	@RequestMapping(value="/{project_token}/applications/students",method=RequestMethod.GET)
	public List<ApplicantDTO> getApplicationStudentList(ApplicationStudentListParam applicationStudentListParam,
                                                        @PathVariable("project_token") String projectToken){
		return projectApplicationService.getApplicantList(applicationStudentListParam, projectToken);
	}
	//TODO huhuang ok
	//pullApplicantIntoTeam
    @ResponseBody
	@RequestMapping(value="/{project_token}/applications/students/{student_token}",method=RequestMethod.PUT)
	public ErrorDTO putApplicationStudent(@RequestBody TeamMemberToAddParam teamMemberToAddParam,
                                          @PathVariable("project_token") String projectToken,
                                          @PathVariable("student_token") String studentToken){
		return projectApplicationService.pullApplicantIntoTeam(teamMemberToAddParam, projectToken, studentToken);
	}
	//TODO huhang ok
	//kickMemberOutOfTeam
    @ResponseBody
	@RequestMapping(value="/{project_token}/applications/students/{student_token}",method=RequestMethod.DELETE)
	public ErrorDTO deleteApplicationStudent(@RequestBody TeamMemberToRemoveParam teamMemberToRemoveParam,
                                             @PathVariable("project_token") String projectToken,
                                             @PathVariable("student_token") String studentToken){
		return projectApplicationService.kickMemberOutOfTeam(teamMemberToRemoveParam, projectToken, studentToken);
	}
	//disbandTeam
	@RequestMapping(value="/{project_token}/applications",method=RequestMethod.DELETE)
	public ErrorDTO deleteApplication(@RequestBody String json,
									  @PathVariable("project_token") String projectToken){
		return projectApplicationService.disbandTeam(json, projectToken);
	}
	//finishFormingTeam
	@RequestMapping(value="/{project_token}/applications",method=RequestMethod.PUT)
	public ErrorDTO putApplication(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return projectApplicationService.finishFormingTeam(json, projectToken);
	}
	//getApplyingTeamList
	//In service TeamService
	@RequestMapping(value="/{project_token}/applications",method=RequestMethod.GET)
	public List<ApplicationDTO> getApplicationList(ApplicationListParam applicationListParam, @PathVariable("project_token") String projectToken){
		TeamService teamService =new TeamServiceImpl();
		return teamService.getApplyingTeamList(applicationListParam, projectToken);
	}
	
	
}
