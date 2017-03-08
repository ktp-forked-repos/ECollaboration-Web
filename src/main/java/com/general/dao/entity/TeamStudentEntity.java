package com.general.dao.entity;

import javax.persistence.Basic;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by joanna on 1/5/17.
 */
public class TeamStudentEntity implements Serializable{
    private Integer team;
    private Integer member;
    private Timestamp passAt;
    private Timestamp failAt;
    private Double score;
    @javax.persistence.Basic
    private Float adviceScore;
    @Basic
    private Float contribution;
    private TeamEntity teamByTeam;
    private StudentEntity studentByMember;
    public Float getAdviceScore() {
        return adviceScore;
    }

    public void setAdviceScore(Float adviceScore) {
        this.adviceScore = adviceScore;
    }


    public Float getContribution() {
        return contribution;
    }

    public void setContribution(Float contribution) {
        this.contribution = contribution;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public Timestamp getPassAt() {
        return passAt;
    }

    public void setPassAt(Timestamp passAt) {
        this.passAt = passAt;
    }

    public Timestamp getFailAt() {
        return failAt;
    }

    public void setFailAt(Timestamp failAt) {
        this.failAt = failAt;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamStudentEntity that = (TeamStudentEntity) o;

        if (team != null ? !team.equals(that.team) : that.team != null) return false;
        if (member != null ? !member.equals(that.member) : that.member != null) return false;
        if (passAt != null ? !passAt.equals(that.passAt) : that.passAt != null) return false;
        if (failAt != null ? !failAt.equals(that.failAt) : that.failAt != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = team != null ? team.hashCode() : 0;
        result = 31 * result + (member != null ? member.hashCode() : 0);
        result = 31 * result + (passAt != null ? passAt.hashCode() : 0);
        result = 31 * result + (failAt != null ? failAt.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }

    public TeamEntity getTeamByTeam() {
        return teamByTeam;
    }

    public void setTeamByTeam(TeamEntity teamByTeam) {
        this.teamByTeam = teamByTeam;
    }

    public StudentEntity getStudentByMember() {
        return studentByMember;
    }

    public void setStudentByMember(StudentEntity studentByMember) {
        this.studentByMember = studentByMember;
    }

}
