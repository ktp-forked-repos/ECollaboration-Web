package com.general.dao.entity;

import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class QuestionaireEntity {
    private Integer id;
    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionaireEntity that = (QuestionaireEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        return result;
    }

    @javax.persistence.OneToOne(mappedBy = "questionaire")
    private ProjectEntity projectByQuestionaire;

    public ProjectEntity getProjectByQuestionaire() {
        return projectByQuestionaire;
    }

    public void setProjectByQuestionaire(ProjectEntity projectByQuestionaire) {
        this.projectByQuestionaire = projectByQuestionaire;
    }

    @javax.persistence.OneToMany
    private Set<QuestionEntity> questionByQuestionaire;

    public Set<QuestionEntity> getQuestionByQuestionaire() {
        return questionByQuestionaire;
    }

    public void setQuestionByQuestionaire(Set<QuestionEntity> questionByQuestionaire) {
        this.questionByQuestionaire = questionByQuestionaire;
    }
}
