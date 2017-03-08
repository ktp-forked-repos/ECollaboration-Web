package com.general.dao.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class PlanTeamEntity {
    private Integer id;
    private Integer team;
    private Integer plan;
    private Timestamp submitAt;
    private Set<PlanStudentFileEntity> planStudentFilesById;
    private TeamEntity teamByTeam;
    private PlanEntity planByPlan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Timestamp getSubmitAt() {
        return submitAt;
    }

    public void setSubmitAt(Timestamp submitAt) {
        this.submitAt = submitAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlanTeamEntity that = (PlanTeamEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (team != null ? !team.equals(that.team) : that.team != null) return false;
        if (plan != null ? !plan.equals(that.plan) : that.plan != null) return false;
        if (submitAt != null ? !submitAt.equals(that.submitAt) : that.submitAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (team != null ? team.hashCode() : 0);
        result = 31 * result + (plan != null ? plan.hashCode() : 0);
        result = 31 * result + (submitAt != null ? submitAt.hashCode() : 0);
        return result;
    }

    public Set<PlanStudentFileEntity> getPlanStudentFilesById() {
        return planStudentFilesById;
    }

    public void setPlanStudentFilesById(Set<PlanStudentFileEntity> planStudentFilesById) {
        this.planStudentFilesById = planStudentFilesById;
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
}
