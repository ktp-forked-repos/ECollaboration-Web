package com.general.dao.entity;

import javax.persistence.Basic;
import java.sql.Date;
import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class ProjectEntity {
    private Integer id;
    private String title;
    private String detail;
    private Date year;
    private Integer teamMax;
    private Integer memberMax;
    private Integer memberMin;
    private Integer tutor;
    private Set<PlanEntity> planById;

    private TutorEntity tutorByTutor;
    private Set<ProjectStudentEntity> projectStudentsById;
    private Set<TeamEntity> teamsById;

    public Set<PlanEntity> getPlanById() {
        return planById;
    }

    public void setPlanById(Set<PlanEntity> planById) {
        this.planById = planById;
    }

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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Integer getTeamMax() {
        return teamMax;
    }

    public void setTeamMax(Integer teamMax) {
        this.teamMax = teamMax;
    }

    public Integer getMemberMax() {
        return memberMax;
    }

    public void setMemberMax(Integer memberMax) {
        this.memberMax = memberMax;
    }

    public Integer getMemberMin() {
        return memberMin;
    }

    public void setMemberMin(Integer memberMin) {
        this.memberMin = memberMin;
    }

    public Integer getTutor() {
        return tutor;
    }

    public void setTutor(Integer tutor) {
        this.tutor = tutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (teamMax != null ? !teamMax.equals(that.teamMax) : that.teamMax != null) return false;
        if (memberMax != null ? !memberMax.equals(that.memberMax) : that.memberMax != null) return false;
        if (memberMin != null ? !memberMin.equals(that.memberMin) : that.memberMin != null) return false;
        if (tutor != null ? !tutor.equals(that.tutor) : that.tutor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (teamMax != null ? teamMax.hashCode() : 0);
        result = 31 * result + (memberMax != null ? memberMax.hashCode() : 0);
        result = 31 * result + (memberMin != null ? memberMin.hashCode() : 0);
        result = 31 * result + (tutor != null ? tutor.hashCode() : 0);
        return result;
    }

    public TutorEntity getTutorByTutor() {
        return tutorByTutor;
    }

    public void setTutorByTutor(TutorEntity tutorByTutor) {
        this.tutorByTutor = tutorByTutor;
    }

    public Set<ProjectStudentEntity> getProjectStudentsById() {
        return projectStudentsById;
    }

    public void setProjectStudentsById(Set<ProjectStudentEntity> projectStudentsById) {
        this.projectStudentsById = projectStudentsById;
    }

    public Set<TeamEntity> getTeamsById() {
        return teamsById;
    }

    public void setTeamsById(Set<TeamEntity> teamsById) {
        this.teamsById = teamsById;
    }

    @Basic
    private Integer questionaire;

    public Integer getQuestionaire() {
        return questionaire;
    }

    public void setQuestionaire(Integer questionaire) {
        this.questionaire = questionaire;
    }

    @javax.persistence.OneToOne
    private QuestionaireEntity questionaireByQuestionaire;

    public QuestionaireEntity getQuestionaireByQuestionaire() {
        return questionaireByQuestionaire;
    }

    public void setQuestionaireByQuestionaire(QuestionaireEntity questionaireByquestionaire) {
        this.questionaireByQuestionaire = questionaireByquestionaire;
    }

    @Basic
    private java.util.Date deadline;

    public java.util.Date getDeadline() {
        return deadline;
    }

    public void setDeadline(java.util.Date deadline) {
        this.deadline = deadline;
    }
}
