package com.general.dao.entity;

import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class StudentEntity {
    private Integer user;
    private String studentId;
    private Set<ProjectStudentEntity> projectStudentsByUser;
    private UserEntity userByUser;
    private Set<StudentMultiAnswerQuestionOptionEntity> studentMultiAnswerQuestionOptionsByUser;
    private Set<StudentShortAnswerQuestionEntity> studentShortAnswerQuestionsByUser;
    private Set<StudentSingleAnswerQuestionOptionEntity> studentSingleAnswerQuestionOptionsByUser;
    private Set<TaskStudentEntity> taskStudentsByUser;
    private Set<TeamEntity> teamsByUser;
    private Set<TeamStudentEntity> teamStudentsByUser;

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }

    public Set<ProjectStudentEntity> getProjectStudentsByUser() {
        return projectStudentsByUser;
    }

    public void setProjectStudentsByUser(Set<ProjectStudentEntity> projectStudentsByUser) {
        this.projectStudentsByUser = projectStudentsByUser;
    }

    public UserEntity getUserByUser() {
        return userByUser;
    }

    public void setUserByUser(UserEntity userByUser) {
        this.userByUser = userByUser;
    }

    public Set<StudentMultiAnswerQuestionOptionEntity> getStudentMultiAnswerQuestionOptionsByUser() {
        return studentMultiAnswerQuestionOptionsByUser;
    }

    public void setStudentMultiAnswerQuestionOptionsByUser(Set<StudentMultiAnswerQuestionOptionEntity> studentMultiAnswerQuestionOptionsByUser) {
        this.studentMultiAnswerQuestionOptionsByUser = studentMultiAnswerQuestionOptionsByUser;
    }

    public Set<StudentShortAnswerQuestionEntity> getStudentShortAnswerQuestionsByUser() {
        return studentShortAnswerQuestionsByUser;
    }

    public void setStudentShortAnswerQuestionsByUser(Set<StudentShortAnswerQuestionEntity> studentShortAnswerQuestionsByUser) {
        this.studentShortAnswerQuestionsByUser = studentShortAnswerQuestionsByUser;
    }

    public Set<StudentSingleAnswerQuestionOptionEntity> getStudentSingleAnswerQuestionOptionsByUser() {
        return studentSingleAnswerQuestionOptionsByUser;
    }

    public void setStudentSingleAnswerQuestionOptionsByUser(Set<StudentSingleAnswerQuestionOptionEntity> studentSingleAnswerQuestionOptionsByUser) {
        this.studentSingleAnswerQuestionOptionsByUser = studentSingleAnswerQuestionOptionsByUser;
    }

    public Set<TaskStudentEntity> getTaskStudentsByUser() {
        return taskStudentsByUser;
    }

    public void setTaskStudentsByUser(Set<TaskStudentEntity> taskStudentsByUser) {
        this.taskStudentsByUser = taskStudentsByUser;
    }

    public Set<TeamEntity> getTeamsByUser() {
        return teamsByUser;
    }

    public void setTeamsByUser(Set<TeamEntity> teamsByUser) {
        this.teamsByUser = teamsByUser;
    }

    public Set<TeamStudentEntity> getTeamStudentsByUser() {
        return teamStudentsByUser;
    }

    public void setTeamStudentsByUser(Set<TeamStudentEntity> teamStudentsByUser) {
        this.teamStudentsByUser = teamStudentsByUser;
    }
}
