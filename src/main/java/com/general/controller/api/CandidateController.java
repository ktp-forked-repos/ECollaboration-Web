package com.general.controller.api;

import java.util.List;

import com.general.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.general.dto.User;

@Controller
@RequestMapping("/api")
public class CandidateController {
	@Autowired
	private CandidateService candidateService;
	//getCandidateList
	@RequestMapping(value="/candidates",method=RequestMethod.GET)
	public List<User> getCandidateList(@RequestBody String json){

		return candidateService.getCandidateList(json);
	}
}
