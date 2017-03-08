package com.general.service;

import java.util.List;

import com.general.dto.*;
import com.general.param.student.ConfirmCodeParam;
import com.general.param.student.ProjectListParam;
import com.general.param.student.ProjectMemberParam;

public interface ProjectService {
	//getProjectList
	public List<ProjectDTO> getProjectList(ProjectListParam projectListParam);
	//postProject
	public TokenDTO getTokenForCreatingTopic(String json);
	//getConfirmCode
	public ConfirmCodeDTO getConfirmCode(ConfirmCodeParam confirmCodeParam, String projectToken);
	//putProject
	public ErrorDTO switchProject(String json,String projectToken);
	//putProject
	public ErrorDTO editTopic(String json,String projectToken,String transactionToken);
	//getProjectStudent
	public List<ProjectStudentDTO> getMemberList(String json, String projectToken);
    //getProjectMember
    public ProjectMemberDTO getProjectMember(ProjectMemberParam projectMemberParam, String projectToken);



    }
