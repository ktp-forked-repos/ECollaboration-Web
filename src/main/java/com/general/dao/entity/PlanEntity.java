package com.general.dao.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class PlanEntity {
    private Integer id;
    private String title;
    private String detail;
    private Timestamp deadline;
    private Integer project;
    private ProjectEntity projectByProject;
    private Set<PlanTeacherFileEntity> planTeacherFilesById;
    private Set<PlanTeamEntity> planTeamsById;
    private Set<TaskEntity> tasksById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }



    public ProjectEntity getProjectByProject() {
        return projectByProject;
    }

    public void setProjectByProject(ProjectEntity projectByProject) {
        this.projectByProject = projectByProject;
    }

    public Set<PlanTeacherFileEntity> getPlanTeacherFilesById() {
        return planTeacherFilesById;
    }

    public void setPlanTeacherFilesById(Set<PlanTeacherFileEntity> planTeacherFilesById) {
        this.planTeacherFilesById = planTeacherFilesById;
    }

    public Set<PlanTeamEntity> getPlanTeamsById() {
        return planTeamsById;
    }

    public void setPlanTeamsById(Set<PlanTeamEntity> planTeamsById) {
        this.planTeamsById = planTeamsById;
    }

    public Set<TaskEntity> getTasksById() {
        return tasksById;
    }

    public void setTasksById(Set<TaskEntity> tasksById) {
        this.tasksById = tasksById;
    }
}
