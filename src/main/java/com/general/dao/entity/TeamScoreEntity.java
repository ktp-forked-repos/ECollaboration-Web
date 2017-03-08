package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class TeamScoreEntity {
    private Integer id;
    private String title;
    private Double score;
    private Double weight;
    private Integer team;
    private TeamEntity teamByTeam;

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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamScoreEntity that = (TeamScoreEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (team != null ? !team.equals(that.team) : that.team != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (team != null ? team.hashCode() : 0);
        return result;
    }

    public TeamEntity getTeamByTeam() {
        return teamByTeam;
    }

    public void setTeamByTeam(TeamEntity teamByTeam) {
        this.teamByTeam = teamByTeam;
    }
}
