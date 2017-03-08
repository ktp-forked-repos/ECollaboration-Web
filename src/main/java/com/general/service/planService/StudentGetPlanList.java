package com.general.service.planService;

import com.general.IdsGetter;
import com.general.dao.EntityDAO;
import com.general.dao.entity.PlanEntity;
import com.general.dao.entity.PlanTeamEntity;
import com.general.dao.entity.ProjectEntity;
import com.general.dao.entity.TeamEntity;
import com.general.dto.PlanDTO;
import com.general.param.student.PlanListParam;
import com.general.util.EntityUtil;

import java.util.*;

/**
 * Created by joanna on 2/18/17.
 */
public class StudentGetPlanList {

    public List<PlanDTO> invoke(EntityDAO entityDAO,
                                EntityUtil entityUtil,
                                PlanListParam planListParam,
                                String projectId,
                                String userId) {
        TeamEntity teamEntity = entityUtil.getTeambyUserAndProject(projectId, Integer.parseInt(userId));
        if(teamEntity==null){
            try {
                throw new Exception("No team is found using specific user and project");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        List<PlanDTO> planDTOs = getPlanDTOs(entityDAO, projectId, teamEntity);
        sortPlanByDeadline(planDTOs);

        return planDTOs;
    }

    private void sortPlanByDeadline(List<PlanDTO> planDTOs) {
        //sort planDTOs by deadline
        Collections.sort(planDTOs, new Comparator<PlanDTO>() {
            @Override
            public int compare(PlanDTO o1, PlanDTO o2) {
                //ascending order
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        });
    }

    private List<PlanDTO> getPlanDTOs(EntityDAO entityDAO, String projectId, TeamEntity teamEntity) {
        Set<PlanEntity> planEntities = entityDAO.
                getEntity(Integer.parseInt(projectId), ProjectEntity.class).
                getPlanById();
        List<PlanDTO> planDTOs = fillPlanDTOs(teamEntity, planEntities);
        return planDTOs;
    }

    private List<PlanDTO> fillPlanDTOs(TeamEntity teamEntity, Set<PlanEntity> planEntities) {
        List<PlanDTO> planDTOs=new LinkedList<>();
        for(Iterator<PlanEntity> i = planEntities.iterator(); i.hasNext();){
            PlanEntity planEntity = i.next();
            PlanDTO planDTO=new PlanDTO();
            planDTO.setPlanToken(String.valueOf(planEntity.getId()));
            planDTO.setDeadline(planEntity.getDeadline());
            planDTO.setTitle(planEntity.getTitle());
            planDTO.setDetail(planEntity.getDetail());
            for(Iterator<PlanTeamEntity> j = planEntity.getPlanTeamsById().iterator(); j.hasNext();){
                PlanTeamEntity planTeamEntity = j.next();
                if(planTeamEntity.getTeam().equals(teamEntity.getId())){
                    if(planTeamEntity.getSubmitAt()==null)
                        planDTO.setIsFinished(false);
                    else
                        planDTO.setIsFinished(true);
                }
            }
            if(planDTO.getIsFinished()==null){
                try {
                    throw new Exception("No Plan__Team entry for this plan and team");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            planDTOs.add(planDTO);
        }
        return planDTOs;
    }

}
