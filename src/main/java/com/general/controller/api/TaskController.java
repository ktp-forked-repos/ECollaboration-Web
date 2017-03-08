package com.general.controller.api;

import java.util.List;

import com.general.dto.*;
import com.general.param.student.TaskListParam;
import com.general.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/tasks")
public class TaskController {
	@Autowired
	private TaskService taskService;


	//getTaskDetail
	@RequestMapping(value="/{task_token}",method=RequestMethod.GET)
	public DetailedTaskDTO getTaskDetail(@RequestBody String json,
                                         @PathVariable("task_token") String taskToken){
		System.out.println("taskService");
		return taskService.getTaskDetail(json, taskToken);
	}
	//deleteTask
	@RequestMapping(value="/{task_token}",method=RequestMethod.DELETE)
	public ErrorDTO deleteTask(@RequestBody String json,
                               @PathVariable("task_token") String taskToken){
		return taskService.deleteTask(json, taskToken);
	}
	//submitTask
	@RequestMapping(value="/{task_token}",method=RequestMethod.PUT)
	public ErrorDTO putTask(@RequestBody String json,
							@PathVariable("task_token") String taskToken){
		return taskService.submitTask(json, taskToken);
	}
	//studentGetTaskList
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.GET)
	public List<StudentTaskDTO> getTaskList(TaskListParam taskListParam,
                                            @PathVariable("project_token") String projectToken){
		return taskService.studentGetTaskList(taskListParam, projectToken);
	}
	//getTokenForCreatingTask
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.POST)
	public TokenDTO postNewTask(@RequestBody String json,
                                @PathVariable("project_token") String projectToken){
		return taskService.getTokenForCreatingTask(json, projectToken);
	}
	//createTask
	@RequestMapping(value="/projects/{project_token}/{transaction_token}",method=RequestMethod.PUT)
	public ErrorDTO putNewTask(@RequestBody String json,
							   @PathVariable("project_token") String projectToken,
							   @PathVariable("transaction_token") String transactionToken){
		return taskService.createTask(json, projectToken, transactionToken);
	}
	//tutorGetTaskList
	@RequestMapping(value="/plans/{plan_token}/teams/{team_token}")
	public List<TutorTaskDTO> getTaskList(@RequestBody String json,
                                          @PathVariable("plan_token") String planToken,
                                          @PathVariable("team_token") String teamToken){
		return taskService.tutorGetTaskList(json, planToken, teamToken);
	}
	
	
}
