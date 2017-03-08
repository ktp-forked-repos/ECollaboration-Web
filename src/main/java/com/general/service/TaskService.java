package com.general.service;

import java.util.List;

import com.general.dto.*;
import com.general.param.student.TaskListParam;

public interface TaskService {
	//getTaskDetail
	public DetailedTaskDTO getTaskDetail(String json, String taskToken);
	//deleteTask
	public ErrorDTO deleteTask(String json, String taskToken);
	//putTask
	public ErrorDTO submitTask(String json,String taskToken);
	//getTaskList
	public List<StudentTaskDTO> studentGetTaskList(TaskListParam taskListParam, String projectToken);
	//getTaskList
	public List<TutorTaskDTO> tutorGetTaskList(String json, String planToken, String teamToken);
	//putNewTask
	public ErrorDTO createTask(String json, String projectToken, String transactionToken);
	//postNewTask
	public TokenDTO getTokenForCreatingTask(String json, String projectToken);
}
