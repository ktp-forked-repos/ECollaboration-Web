package com.general.controller.api;

import com.general.param.GlobalParam;
import com.general.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.general.dto.DetailedStudentProfileDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.ProfileDTO;

@Controller
@RequestMapping("/api/profiles")
public class ProfileController {
	@Autowired
	private ProfileService profileService;


	//getProfile
	@RequestMapping(value="",method=RequestMethod.GET)
	public ProfileDTO getProfile(GlobalParam globalParam){
		return profileService.getProfile(globalParam);
	}
	//TODO huhang
	//updateProfile
	@RequestMapping(value="",method=RequestMethod.PUT)
	public ErrorDTO putProfile(@RequestBody String json){
		return profileService.updateProfile(json);
	}

	//getStudentDetailedProfile
	@RequestMapping(value="/students/{student_token}",method=RequestMethod.GET)
	public DetailedStudentProfileDTO getProfileOfStudent(@RequestBody String json,@PathVariable("student_token") String studentToken){
		return profileService.getStudentDetailedProfile(json, studentToken);
	}
}
