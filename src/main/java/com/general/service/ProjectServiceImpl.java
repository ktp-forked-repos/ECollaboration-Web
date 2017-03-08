package com.general.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.general.IdsGetter;
import com.general.dao.EntityDAO;
import com.general.dao.entity.ProjectEntity;
import com.general.dao.entity.TeamEntity;
import com.general.dao.entity.UserEntity;
import com.general.dto.*;
import com.general.param.student.ConfirmCodeParam;
import com.general.param.student.ProjectListParam;
import com.general.param.student.ProjectMemberParam;
import com.general.service.projectService.GetProjectList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
    //getProjectList
    /**
     *
     * @param projectListParam if status is "checking" then return project list waiting to be checked,
     *                         otherwise return list of passed projects.
     * @return
     */
    public List<ProjectDTO> getProjectList(ProjectListParam projectListParam){
        //user id is needed to get UserEntity
        int userId= Integer.parseInt(new IdsGetter().getUserId());
        List<ProjectDTO> projectDTOs = new GetProjectList().invoke(projectListParam, userId, entityDAO);
        return projectDTOs;
	}


    //postProject
	public TokenDTO getTokenForCreatingTopic(String json){
		return null;
	}
	//getConfirmCode
	public ConfirmCodeDTO getConfirmCode(ConfirmCodeParam confirmCodeParam, String projectToken){
		return null;
	}
	//putProject
	public ErrorDTO switchProject(String json,String projectToken){
		return null;
	}
	//putProject
	public ErrorDTO editTopic(String json,String projectToken,String transactionToken){
		return null;
	}
	//getProjectStudent
	public List<ProjectStudentDTO> getMemberList(String json,String projectToken){
		return null;
	}
    //getProjectMember
    public ProjectMemberDTO getProjectMember(ProjectMemberParam projectMemberParam, String projectToken){
        return null;
    }

	
}
