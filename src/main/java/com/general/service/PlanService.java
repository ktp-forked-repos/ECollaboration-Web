package com.general.service;

import java.util.List;

import com.general.dto.DetailedPlanDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.PlanDTO;
import com.general.dto.TokenDTO;
import com.general.dto.TutorPlanDTO;
import com.general.dto.TutorPlanSimpleDTO;
import com.general.param.student.PlanListParam;

public interface PlanService {
	//getPlanDetail
	public DetailedPlanDTO getPlanDetail(String json, String planToken);
	//getPlanDetail
	public DetailedPlanDTO getPlanDetail(String json,String planToken, String teamToken);
	//studentPutPlan
	public ErrorDTO submitPlan(String json, String planToken);
	//tutorPutPlan
	public ErrorDTO createPlan(String json, String transactionToken);
	//studentGetPlanList
	public List<PlanDTO> studentGetPlanList(PlanListParam planListParam, String projectToken);
	//tutorGetPlanList
	public List<TutorPlanSimpleDTO> getPlanProgressList(String json);
	//tutorGetPlanList
	public List<TutorPlanDTO> getPlanProgressList(String json, String teamToken);
	//deletePlan
	public ErrorDTO deletePlan(String json, String planToken);
	//postPlan
	public TokenDTO getTokenForCreatingPlan(String json, String projectToken);
	
}
