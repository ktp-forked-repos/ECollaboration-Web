package com.general.controller.api;

import java.util.List;

import com.general.dto.*;
import com.general.param.student.ConfirmCodeParam;
import com.general.param.student.ProjectListParam;
import com.general.param.student.ProjectMemberParam;
import com.general.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/projects")
public class ProjectController {
	@Autowired
	private ProjectService projectService;


	//getProjectList
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<ProjectDTO> getProjectList(ProjectListParam projectListParam){
		return projectService.getProjectList(projectListParam);
	}
	//getTokenForCreatingTopic
	@RequestMapping(value="",method=RequestMethod.POST)
	public TokenDTO postProject(@RequestBody String json){
		return projectService.getTokenForCreatingTopic(json);
	}
	//getConfirmCode
	@RequestMapping(value="/{project_token}/confirm_code",method=RequestMethod.GET)
	public ConfirmCodeDTO getConfirmCode(ConfirmCodeParam confirmCodeParam, @PathVariable("project_token") String projectToken){
		return projectService.getConfirmCode(confirmCodeParam, projectToken);
	}
	//switchProject
	@RequestMapping(value="/{project_token}",method=RequestMethod.PUT)
	public ErrorDTO putProject(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return projectService.switchProject(json, projectToken);
	}
	//getMemberList
	@RequestMapping(value="/{project_token}/students")
	public List<ProjectStudentDTO> getProjectStudent(@RequestBody String json, @PathVariable("project_token") String projectToken){
		return projectService.getMemberList(json, projectToken);
	}
	//editTopic
	@RequestMapping(value="/{project_token}/transactions/{transaction_token}")
	public ErrorDTO putProject(@RequestBody String json,
                               @PathVariable("project_token") String projectToken,
                               @PathVariable("transaction_token") String transactionToken){
		return projectService.editTopic(json, projectToken, transactionToken);
	}
	//getProjectMember
	@RequestMapping(value="/{project_token}/members", method = RequestMethod.GET)
    public ProjectMemberDTO getProjectMember(@RequestBody ProjectMemberParam projectMemberParam,
                                             @PathVariable("project_token") String projectToken){
        return projectService.getProjectMember(projectMemberParam, projectToken);
    }


/*	@RequestMapping(value="/{project_token}/members",method=RequestMethod.GET)
	public ErrorDTO getProjectMember(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return null;
	}*/
	
}
