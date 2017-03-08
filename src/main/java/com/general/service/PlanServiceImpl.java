package com.general.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.general.IdsGetter;
import com.general.dao.EntityDAO;
import com.general.dao.entity.*;
import com.general.dto.DetailedPlanDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.PlanDTO;
import com.general.dto.TokenDTO;
import com.general.dto.TutorPlanDTO;
import com.general.dto.TutorPlanSimpleDTO;
import com.general.param.student.PlanListParam;
import com.general.service.planService.StudentGetPlanList;
import com.general.util.EntityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlanServiceImpl implements PlanService {
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
    @Autowired
    EntityUtil entityUtil;
    //getPlanDetail
	public DetailedPlanDTO getPlanDetail(String json, String planToken){
		return null;
	}
	//getPlanDetail
	public DetailedPlanDTO getPlanDetail(String json,String planToken, String teamToken){
		return null;
	}
	//studentPutPlan
	public ErrorDTO submitPlan(String json, String planToken){
		return null;
	}
	//tutorPutPlan
	public ErrorDTO createPlan(String json, String transactionToken){
		return null;
	}
	//studentGetPlanList
	public List<PlanDTO> studentGetPlanList(PlanListParam planListParam, String projectToken){
        String userId = new IdsGetter().getUserId();
        projectToken=new IdsGetter().getProjectId();
        return new StudentGetPlanList().invoke(entityDAO, entityUtil, planListParam, projectToken, userId);
	}
    //tutorGetPlanList
	public List<TutorPlanSimpleDTO> getPlanProgressList(String json){
		return null;
	}
	//tutorGetPlanList
	public List<TutorPlanDTO> getPlanProgressList(String json, String teamToken){
		return null;
	}
	//deletePlan
	public ErrorDTO deletePlan(String json, String planToken){
		return null;
	}
	//postPlan
	public TokenDTO getTokenForCreatingPlan(String json, String projectToken){
		return null;
	}
	
}
