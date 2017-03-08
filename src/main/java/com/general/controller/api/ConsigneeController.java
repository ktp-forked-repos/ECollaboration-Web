package com.general.controller.api;

import java.util.List;

import com.general.service.ConsigneeService;
import com.general.dto.ConsigneeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/consignees")
public class ConsigneeController {
	@Autowired
	private ConsigneeService consigneeService;
	//getConsigneeList
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<ConsigneeDTO> getMailToList(@RequestBody String json){


		return consigneeService.getConsigneeList(json);
	}
	//getConsigneeListWithProjToken
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.GET)
	public List<ConsigneeDTO> getMailToListWithProjToken(@RequestBody String json,@PathVariable("project_token") String projectToken){
		return consigneeService.getConsigneeListWithProjToken(json,projectToken);
	}
}
