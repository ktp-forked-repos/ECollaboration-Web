package com.general.service;

import java.util.*;

import com.general.IdsGetter;
import com.general.dao.EntityDAO;
import com.general.dto.*;
import com.general.param.student.TaskListParam;
import com.general.service.taskService.StudentGetTaskList;
import com.general.util.EntityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
    @Autowired
    EntityUtil entityUtil;
	//getTaskDetail
	public DetailedTaskDTO getTaskDetail(String json, String taskToken){
		return null;
	}
	//deleteTask
	public ErrorDTO deleteTask(String json, String taskToken){
		return null;
	}
	//putTask
	public ErrorDTO submitTask(String json,String taskToken){
		return null;
	}
	//getTaskList
	public List<StudentTaskDTO> studentGetTaskList(TaskListParam taskListParam, String projectToken){
        String userId = new IdsGetter().getUserId();
        projectToken=new IdsGetter().getProjectId();
        return new StudentGetTaskList().invoke(entityDAO, entityUtil, taskListParam, projectToken, userId);
	}


    //getTaskList
	public List<TutorTaskDTO> tutorGetTaskList(String json, String planToken, String teamToken){
		return null;
	}

	//putNewTask
	public ErrorDTO createTask(String json, String projectToken, String transactionToken) {
		return null;
	}

	//postNewTask
	public TokenDTO getTokenForCreatingTask(String json, String projectToken) {
		return null;
	}


}
