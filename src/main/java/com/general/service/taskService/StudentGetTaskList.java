package com.general.service.taskService;

import com.general.dao.EntityDAO;
import com.general.dao.entity.PlanEntity;
import com.general.dao.entity.TaskEntity;
import com.general.dao.entity.TaskStudentEntity;
import com.general.dto.PlanDTO;
import com.general.dto.StudentTaskDTO;
import com.general.dto.TaskDTO;
import com.general.param.student.PlanListParam;
import com.general.param.student.TaskListParam;
import com.general.service.planService.StudentGetPlanList;
import com.general.util.EntityUtil;

import java.util.*;

/**
 * Created by joanna on 2/18/17.
 */
public class StudentGetTaskList {
    public List<StudentTaskDTO> invoke(EntityDAO entityDAO,
                                       EntityUtil entityUtil,
                                       TaskListParam taskListParam,
                                       String projectId,
                                       String userId) {
        System.out.println(taskListParam);
        List<StudentTaskDTO> studentTaskDTOs = getAllStudentTaskDTO(
                taskListParam, projectId, entityDAO, userId, entityUtil);
        //System.out.println();
        //System.out.println(studentTaskDTOs);
        filterStudentTaskDTO(taskListParam, studentTaskDTOs, entityDAO);
        //System.out.println(studentTaskDTOs);
        sortTaskByDeadline(studentTaskDTOs);
        return studentTaskDTOs;
    }

    private void sortTaskByDeadline(List<StudentTaskDTO> studentTaskDTOs) {
        for(Iterator<StudentTaskDTO> i = studentTaskDTOs.listIterator(); i.hasNext();){
            StudentTaskDTO studentTaskDTO = i.next();
            List<TaskDTO> taskDTOs = studentTaskDTO.getTasks();
            //sort taskDTOs by deadline
            Collections.sort(taskDTOs, new Comparator<TaskDTO>() {
                @Override
                public int compare(TaskDTO o1, TaskDTO o2) {
                    return o1.getDeadline().compareTo(o2.getDeadline());
                }
            });
        }
    }

    private void filterStudentTaskDTO(
            TaskListParam taskListParam, List<StudentTaskDTO> studentTaskDTOs, EntityDAO entityDAO) {
        //filter StudentTaskDTOs by owner, deadline and is_finished
        if(taskListParam!=null) {
            for (Iterator<StudentTaskDTO> i = studentTaskDTOs.listIterator(); i.hasNext(); ) {
                StudentTaskDTO studentTaskDTO = i.next();
                for(Iterator<TaskDTO> j=studentTaskDTO.getTasks().iterator(); j.hasNext();){
                    TaskDTO taskDTO = j.next();
                    //is_finished
                    if((taskListParam.getIsFinished()==0)||(taskListParam.getIsFinished()==1)) {
                        if (((taskListParam.getIsFinished() == 0) &&
                                (Boolean.TRUE.equals(taskDTO.getIsFinished()))) ||
                                ((taskListParam.getIsFinished() == 1) &&
                                        (Boolean.FALSE.equals(taskDTO.getIsFinished()))))
                            //not applicable
                            studentTaskDTO.getTasks().remove(taskDTO);
                    }
                    //deadline
                    if(taskListParam.getDeadline()!=null) {
                        Calendar calendar = new GregorianCalendar();
                        calendar.add(Calendar.DATE, Integer.parseInt(taskListParam.getDeadline()));
                        //today<=applicable tasks' deadline<today+increment(such as 30 days) is ok
                        if ((calendar.getTime().after(taskDTO.getDeadline())) &&
                                (!new Date().after(taskDTO.getDeadline()))) {
                            //this is ok, so do nothing
                        } else {
                            studentTaskDTO.getTasks().remove(taskDTO);
                        }
                    }
                    //owner
                    if(taskListParam.getOwner()!=null){
                        if (isStudentInTask(taskListParam, taskDTO,entityDAO)){
                            //applicable, do nothing
                        }else{
                            studentTaskDTO.getTasks().remove(taskDTO);
                        }
                    }
                }

            }
        }
    }

    private boolean isStudentInTask(TaskListParam taskListParam, TaskDTO taskDTO, EntityDAO entityDAO) {
        for(Iterator<TaskStudentEntity> k = entityDAO.
                getEntity(Integer.parseInt(taskDTO.getToken()), TaskEntity.class).
                getTaskStudentsById().
                iterator(); k.hasNext();){
            if(k.next().getStudentByStudent().getStudentId().equals(taskListParam.getOwner()))
                return true;
        }
        return false;
    }

    private List<StudentTaskDTO> getAllStudentTaskDTO(TaskListParam taskListParam,
                                                      String projectToken,
                                                      EntityDAO entityDAO,
                                                      String userId, EntityUtil entityUtil) {
        PlanListParam planListParam=new PlanListParam();
        planListParam.setPage(taskListParam.getPage());
        List<PlanDTO> planDTOs = new StudentGetPlanList().invoke(
                entityDAO, entityUtil, planListParam, projectToken, userId);
        List<StudentTaskDTO> studentTaskDTOs = fillStudentTaskDTOs(entityDAO, planDTOs);
        return studentTaskDTOs;
    }

    private List<StudentTaskDTO> fillStudentTaskDTOs(EntityDAO entityDAO, List<PlanDTO> planDTOs) {
        List<StudentTaskDTO> studentTaskDTOs=new LinkedList<>();
        for(Iterator<PlanDTO> i = planDTOs.listIterator(); i.hasNext();){
            PlanDTO planDTO = i.next();
            StudentTaskDTO studentTaskDTO=new StudentTaskDTO();
            studentTaskDTO.setTitle(planDTO.getTitle());
            studentTaskDTO.setDeadline(planDTO.getDeadline());
            studentTaskDTO.setIsFinished(planDTO.getIsFinished());
            List<TaskDTO> taskDTOs=new LinkedList<>();
            //fill in taskDTOs
            Set<TaskEntity> taskEntities = entityDAO.
                    getEntity(Integer.parseInt(planDTO.getPlanToken()), PlanEntity.class).
                    getTasksById();
            for(Iterator<TaskEntity> j=taskEntities.iterator();j.hasNext();){
                TaskEntity taskEntity = j.next();
                TaskDTO taskDTO=new TaskDTO();
                //fill in a taskDTO
                taskDTO.setTitle(taskEntity.getTitle());
                taskDTO.setDeadline(taskEntity.getDeadline());
                taskDTO.setDetail(taskEntity.getDetail());
                taskDTO.setToken(String.valueOf(taskEntity.getId()));
                //determine if the task is finished by finish_at
                if(taskEntity.getFinishAt()==null)
                    taskDTO.setIsFinished(false);
                else
                    taskDTO.setIsFinished(true);
                taskDTOs.add(taskDTO);
            }
            studentTaskDTO.setTasks(taskDTOs);
            studentTaskDTOs.add(studentTaskDTO);
        }
        return studentTaskDTOs;
    }

}
