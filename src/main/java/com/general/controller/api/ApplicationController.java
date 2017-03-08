package com.general.controller.api;

import com.general.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.general.dto.ErrorDTO;

@Controller
@RequestMapping("/api/applications")
public class ApplicationController {
	@Autowired
	private ApplicationService applicationService;
	//submitTopicApplication
	@RequestMapping(value="",method=RequestMethod.POST)
	public ErrorDTO postApplication(@RequestBody String json){

		return applicationService.submitTopicApplication(json);
	}
	//reviewApplication
	@RequestMapping(value="/{application_token}",method=RequestMethod.PUT)
	@ResponseBody public ErrorDTO putApplication(@RequestBody String json, @PathVariable("application_token") String applicationToken){
		return applicationService.reviewApplication(json, applicationToken);
	}
	
}
