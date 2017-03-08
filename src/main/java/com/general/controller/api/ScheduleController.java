package com.general.controller.api;

import java.util.List;

import com.general.service.ScheduleService;
import com.general.dto.DetailedScheduleDTO;
import com.general.dto.ScheduleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.general.dto.ErrorDTO;
import com.general.dto.TokenDTO;

@Controller
@RequestMapping(value="/api/schedules")
public class ScheduleController {
	@Autowired
	private ScheduleService scheduleService;


	//deleteSchedule
	@RequestMapping(value="/{schedule_token}",method=RequestMethod.DELETE)
	public ErrorDTO deleteSchedule(@RequestBody String json,@PathVariable("schedule_token") String scheduleToken){
		
		return scheduleService.deleteSchedule(json, scheduleToken);
	}
	//getScheduleDetail
	@RequestMapping(value="/{schedule_token}",method=RequestMethod.GET)
	public DetailedScheduleDTO getScheduleDetail(@RequestBody String json, @PathVariable("schedule_token") String scheduleToken){
		return scheduleService.getScheduleDetail(json, scheduleToken);
	}
	//getScheduleList
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<ScheduleDTO> getScheduleList(@RequestBody String json){
		return scheduleService.getScheduleList(json);
	}
	//getScheduleList
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.GET)
	public List<ScheduleDTO> getScheduleList(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return scheduleService.getScheduleList(json, projectToken);
	}
	//getTokenForCreatingSchedule
	@RequestMapping(value="",method=RequestMethod.POST)
	public TokenDTO postSchedule(@RequestBody String json){
		return scheduleService.getTokenForCreatingSchedule(json);
	}
	//createSchedule
	@RequestMapping(value="/transactions/{transaction_token}",method=RequestMethod.PUT)
	public ErrorDTO putSchedule(@RequestBody String json){
		return scheduleService.createSchedule(json);
	}
}
