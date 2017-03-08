package com.general.controller.api;

import com.general.service.WeekService;
import com.general.dto.WeekDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class WeekController {
	@Autowired
	private WeekService weekService;

	//getWeekList
	@RequestMapping("/weeks")
	@ResponseBody public List<WeekDTO> getWeekList(@RequestBody String json, @RequestHeader("access-token") String accessToken){
/*		System.out.println("weeks here.");
		System.out.println(json);
		try {
			JsonNode jsonNode=new ObjectMapper().readTree(json);
			System.out.println(jsonNode.get("number").get("token"));
		} catch (IOException e) {
			e.printStackTrace();
		}*/
        System.out.println("weeks here.");
		return weekService.getWeekList(json,accessToken);
	}
}
