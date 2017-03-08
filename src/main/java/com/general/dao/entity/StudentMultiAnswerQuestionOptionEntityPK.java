package com.general.dao.entity;

import java.io.Serializable;

/**
 * Created by joanna on 1/5/17.
 */
public class StudentMultiAnswerQuestionOptionEntityPK implements Serializable {
    private Integer student;
    private Integer question;
    private Integer option;

    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    public Integer getOption() {
        return option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentMultiAnswerQuestionOptionEntityPK that = (StudentMultiAnswerQuestionOptionEntityPK) o;

        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (option != null ? !option.equals(that.option) : that.option != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student != null ? student.hashCode() : 0;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (option != null ? option.hashCode() : 0);
        return result;
    }
}
