package com.general.dao.entity;

import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class ShortAnswerQuestionEntity {
    //id is question in table, which is both primary key and foreign key
    private Integer id;
    private QuestionEntity questionByQuestion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer question) {
        this.id = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShortAnswerQuestionEntity that = (ShortAnswerQuestionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public QuestionEntity getQuestionByQuestion() {
        return questionByQuestion;
    }

    public void setQuestionByQuestion(QuestionEntity questionByQuestion) {
        this.questionByQuestion = questionByQuestion;
    }

    @javax.persistence.OneToMany()
    private Set<StudentShortAnswerQuestionEntity> studentShortAnswerQuestionByQuestion;

    public Set<StudentShortAnswerQuestionEntity> getStudentShortAnswerQuestionByQuestion() {
        return studentShortAnswerQuestionByQuestion;
    }

    public void setStudentShortAnswerQuestionByQuestion(Set<StudentShortAnswerQuestionEntity> studentShortAnswerQuestionByQuestion) {
        this.studentShortAnswerQuestionByQuestion = studentShortAnswerQuestionByQuestion;
    }
}
