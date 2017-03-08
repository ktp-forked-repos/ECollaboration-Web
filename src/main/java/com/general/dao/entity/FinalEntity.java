package com.general.dao.entity;

import javax.persistence.OneToOne;
import java.sql.Date;

/**
 * Created by joanna on 2/24/17.
 */
public class FinalEntity {
    private Integer team;
    private Date submitAt;
    private String description;

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public Date getSubmitAt() {
        return submitAt;
    }

    public void setSubmitAt(Date submitAt) {
        this.submitAt = submitAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FinalEntity that = (FinalEntity) o;

        if (team != null ? !team.equals(that.team) : that.team != null) return false;
        if (submitAt != null ? !submitAt.equals(that.submitAt) : that.submitAt != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = team != null ? team.hashCode() : 0;
        result = 31 * result + (submitAt != null ? submitAt.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @OneToOne
    private TeamEntity teamByTeam;

    public TeamEntity getTeamByTeam() {
        return teamByTeam;
    }

    public void setTeamByTeam(TeamEntity teamByTeam) {
        this.teamByTeam = teamByTeam;
    }
}
