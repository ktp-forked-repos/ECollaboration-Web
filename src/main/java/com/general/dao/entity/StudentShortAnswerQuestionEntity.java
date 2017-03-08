package com.general.dao.entity;

import javax.persistence.ManyToOne;

/**
 * Created by joanna on 1/5/17.
 */
public class StudentShortAnswerQuestionEntity {
    private Integer student;
    private Integer question;
    private String answer;
    private StudentEntity studentByStudent;

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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentShortAnswerQuestionEntity that = (StudentShortAnswerQuestionEntity) o;

        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student != null ? student.hashCode() : 0;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }

    public StudentEntity getStudentByStudent() {
        return studentByStudent;
    }

    public void setStudentByStudent(StudentEntity studentByStudent) {
        this.studentByStudent = studentByStudent;
    }

    @ManyToOne
    private ShortAnswerQuestionEntity shortAnswerQuestionByQuestion;

    public ShortAnswerQuestionEntity getShortAnswerQuestionByQuestion() {
        return shortAnswerQuestionByQuestion;
    }

    public void setShortAnswerQuestionByQuestion(ShortAnswerQuestionEntity shortAnswerQuestionByQuestion) {
        this.shortAnswerQuestionByQuestion = shortAnswerQuestionByQuestion;
    }
}
