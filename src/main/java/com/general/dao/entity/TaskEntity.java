package com.general.dao.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class TaskEntity {
    private Integer id;
    private String title;
    private String detail;
    private Timestamp deadline;
    private String finishAt;
    private Integer team;
    private Integer plan;
    private TeamEntity teamByTeam;
    private PlanEntity planByPlan;
    private Set<TaskFileEntity> taskFilesById;
    private Set<TaskStudentEntity> taskStudentsById;

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

    public String getFinishAt() {
        return finishAt;
    }

    public void setFinishAt(String finishAt) {
        this.finishAt = finishAt;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public Integer getPlan() {
        return plan;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskEntity that = (TaskEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        if (finishAt != null ? !finishAt.equals(that.finishAt) : that.finishAt != null) return false;
        if (team != null ? !team.equals(that.team) : that.team != null) return false;
        if (plan != null ? !plan.equals(that.plan) : that.plan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (finishAt != null ? finishAt.hashCode() : 0);
        result = 31 * result + (team != null ? team.hashCode() : 0);
        result = 31 * result + (plan != null ? plan.hashCode() : 0);
        return result;
    }

    public TeamEntity getTeamByTeam() {
        return teamByTeam;
    }

    public void setTeamByTeam(TeamEntity teamByTeam) {
        this.teamByTeam = teamByTeam;
    }

    public PlanEntity getPlanByPlan() {
        return planByPlan;
    }

    public void setPlanByPlan(PlanEntity planByPlan) {
        this.planByPlan = planByPlan;
    }

    public Set<TaskFileEntity> getTaskFilesById() {
        return taskFilesById;
    }

    public void setTaskFilesById(Set<TaskFileEntity> taskFilesById) {
        this.taskFilesById = taskFilesById;
    }

    public Set<TaskStudentEntity> getTaskStudentsById() {
        return taskStudentsById;
    }

    public void setTaskStudentsById(Set<TaskStudentEntity> taskStudentsById) {
        this.taskStudentsById = taskStudentsById;
    }
}
