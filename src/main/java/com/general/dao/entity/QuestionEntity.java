package com.general.dao.entity;

import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class QuestionEntity {
    private Integer id;
    private String title;
    private String detail;
    private Set<MultiAnswerQuestionEntity> multiAnswerQuestionsById;
    private Set<OptionEntity> optionsById;
    private Set<ShortAnswerQuestionEntity> shortAnswerQuestionsById;
    private Set<SingleAnswerQuestionEntity> singleAnswerQuestionsById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionEntity that = (QuestionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        return result;
    }

    public Set<MultiAnswerQuestionEntity> getMultiAnswerQuestionsById() {
        return multiAnswerQuestionsById;
    }

    public void setMultiAnswerQuestionsById(Set<MultiAnswerQuestionEntity> multiAnswerQuestionsById) {
        this.multiAnswerQuestionsById = multiAnswerQuestionsById;
    }

    public Set<OptionEntity> getOptionsById() {
        return optionsById;
    }

    public void setOptionsById(Set<OptionEntity> optionsById) {
        this.optionsById = optionsById;
    }

    public Set<ShortAnswerQuestionEntity> getShortAnswerQuestionsById() {
        return shortAnswerQuestionsById;
    }

    public void setShortAnswerQuestionsById(Set<ShortAnswerQuestionEntity> shortAnswerQuestionsById) {
        this.shortAnswerQuestionsById = shortAnswerQuestionsById;
    }

    public Set<SingleAnswerQuestionEntity> getSingleAnswerQuestionsById() {
        return singleAnswerQuestionsById;
    }

    public void setSingleAnswerQuestionsById(Set<SingleAnswerQuestionEntity> singleAnswerQuestionsById) {
        this.singleAnswerQuestionsById = singleAnswerQuestionsById;
    }

    @javax.persistence.Basic
    private Integer questionaire;

    public Integer getQuestionaire() {
        return questionaire;
    }

    public void setQuestionaire(Integer questionaire) {
        this.questionaire = questionaire;
    }

    @javax.persistence.ManyToOne
    private QuestionaireEntity questionaireByQuestionaire;

    public QuestionaireEntity getQuestionaireByQuestionaire() {
        return questionaireByQuestionaire;
    }

    public void setQuestionaireByQuestionaire(QuestionaireEntity questionaireByQuestionaire) {
        this.questionaireByQuestionaire = questionaireByQuestionaire;
    }
}
