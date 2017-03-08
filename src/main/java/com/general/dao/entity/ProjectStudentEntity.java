package com.general.dao.entity;

import java.sql.Timestamp;

/**
 * Created by joanna on 1/5/17.
 */
public class ProjectStudentEntity {
    private Integer project;
    private Integer student;
    private String confirmCode;
    private Timestamp passAt;
    private Timestamp failAt;
    private ProjectEntity projectByProject;
    private StudentEntity studentByStudent;

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    public Timestamp getPassAt() {
        return passAt;
    }

    public void setPassAt(Timestamp passAt) {
        this.passAt = passAt;
    }

    public Timestamp getFailAt() {
        return failAt;
    }

    public void setFailAt(Timestamp failAt) {
        this.failAt = failAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectStudentEntity that = (ProjectStudentEntity) o;

        if (project != null ? !project.equals(that.project) : that.project != null) return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        if (confirmCode != null ? !confirmCode.equals(that.confirmCode) : that.confirmCode != null) return false;
        if (passAt != null ? !passAt.equals(that.passAt) : that.passAt != null) return false;
        if (failAt != null ? !failAt.equals(that.failAt) : that.failAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = project != null ? project.hashCode() : 0;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (confirmCode != null ? confirmCode.hashCode() : 0);
        result = 31 * result + (passAt != null ? passAt.hashCode() : 0);
        result = 31 * result + (failAt != null ? failAt.hashCode() : 0);
        return result;
    }

    public ProjectEntity getProjectByProject() {
        return projectByProject;
    }

    public void setProjectByProject(ProjectEntity projectByProject) {
        this.projectByProject = projectByProject;
    }

    public StudentEntity getStudentByStudent() {
        return studentByStudent;
    }

    public void setStudentByStudent(StudentEntity studentByStudent) {
        this.studentByStudent = studentByStudent;
    }
}
