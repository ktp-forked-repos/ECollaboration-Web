package com.general.dao.entity;

import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class OptionEntity {
    private Integer id;
    private String title;
    private Integer question;
    private QuestionEntity questionByQuestion;
    private Set<StudentMultiAnswerQuestionOptionEntity> studentMultiAnswerQuestionOptionsById;
    private Set<StudentSingleAnswerQuestionOptionEntity> studentSingleAnswerQuestionOptionsById;

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

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OptionEntity that = (OptionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        return result;
    }

    public QuestionEntity getQuestionByQuestion() {
        return questionByQuestion;
    }

    public void setQuestionByQuestion(QuestionEntity questionByQuestion) {
        this.questionByQuestion = questionByQuestion;
    }

    public Set<StudentMultiAnswerQuestionOptionEntity> getStudentMultiAnswerQuestionOptionsById() {
        return studentMultiAnswerQuestionOptionsById;
    }

    public void setStudentMultiAnswerQuestionOptionsById(Set<StudentMultiAnswerQuestionOptionEntity> studentMultiAnswerQuestionOptionsById) {
        this.studentMultiAnswerQuestionOptionsById = studentMultiAnswerQuestionOptionsById;
    }

    public Set<StudentSingleAnswerQuestionOptionEntity> getStudentSingleAnswerQuestionOptionsById() {
        return studentSingleAnswerQuestionOptionsById;
    }

    public void setStudentSingleAnswerQuestionOptionsById(Set<StudentSingleAnswerQuestionOptionEntity> studentSingleAnswerQuestionOptionsById) {
        this.studentSingleAnswerQuestionOptionsById = studentSingleAnswerQuestionOptionsById;
    }
}
