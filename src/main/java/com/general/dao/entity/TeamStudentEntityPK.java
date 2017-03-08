package com.general.dao.entity;

import java.io.Serializable;

/**
 * Created by joanna on 1/5/17.
 */
public class TeamStudentEntityPK implements Serializable {
    private Integer team;
    private Integer member;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamStudentEntityPK that = (TeamStudentEntityPK) o;

        if (team != null ? !team.equals(that.team) : that.team != null) return false;
        if (member != null ? !member.equals(that.member) : that.member != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = team != null ? team.hashCode() : 0;
        result = 31 * result + (member != null ? member.hashCode() : 0);
        return result;
    }
}
