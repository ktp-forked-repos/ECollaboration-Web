package com.general.controller.api;

import java.util.List;

import com.general.param.student.PlanListParam;
import com.general.service.PlanService;
import com.general.dto.TutorPlanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.general.dto.DetailedPlanDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.PlanDTO;
import com.general.dto.TokenDTO;
import com.general.dto.TutorPlanSimpleDTO;

@Controller
@RequestMapping("/api/plans")
public class PlanController {
	@Autowired
	private PlanService planService;
	//getPlanDetail
	@RequestMapping(value="/{plan_token}",method=RequestMethod.GET)
	public DetailedPlanDTO getPlanDetail(@RequestBody String json,@PathVariable String planToken){

		return planService.getPlanDetail(json, planToken);
	}
	//submitPlan
	@RequestMapping(value="/{plan_token}",method=RequestMethod.PUT)
	public ErrorDTO studentPutPlan(@RequestBody String json,@PathVariable String planToken){

		return planService.submitPlan(json, planToken);
	}
	//deletePlan
	@RequestMapping(value="/{plan_token}",method=RequestMethod.DELETE)
	public ErrorDTO deletePlan(@RequestBody String json,@PathVariable String planToken){

		return planService.deletePlan(json, planToken);
	}
	//getTokenForCreatingPlan
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.POST)
	public TokenDTO postPlan(@RequestBody String json,@PathVariable String projectToken){
		return planService.getTokenForCreatingPlan(json, projectToken);
	}
	//studentGetPlanList
	@RequestMapping(value="/projects/{project_token}",method=RequestMethod.GET)
	public List<PlanDTO> studentGetPlanList(PlanListParam planListParam, @PathVariable String projectToken){
		return planService.studentGetPlanList(planListParam, projectToken);
	}
	//createPlan
	@RequestMapping(value="/transaction/{transaction_token}",method=RequestMethod.PUT)
	public ErrorDTO tutorPutPlan(@RequestBody String json,@PathVariable String transactionToken){
		return planService.createPlan(json, transactionToken);
	}
	//getPlanProgressList
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<TutorPlanSimpleDTO> tutorGetPlanList(@RequestBody String json){

		return planService.getPlanProgressList(json);
	}
	//getPlanProgressList
	@RequestMapping(value="/teams/{team_token}",method=RequestMethod.GET)
	public List<TutorPlanDTO> tutorGetPlanList(@RequestBody String json, @PathVariable String teamToken){
		return planService.getPlanProgressList(json, teamToken);
	} 
	//getPlanDetail
	@RequestMapping(value="/{plan_token}/teams/{team_token}",method=RequestMethod.GET)
	public DetailedPlanDTO getPlanDetail(@RequestBody String json,@PathVariable("plan_token") String planToken,
										 @PathVariable("team_token") String teamToken){
		return planService.getPlanDetail(json, planToken, teamToken);
	}
	
}
