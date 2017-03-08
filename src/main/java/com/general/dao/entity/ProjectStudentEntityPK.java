package com.general.dao.entity;

import java.io.Serializable;

/**
 * Created by joanna on 1/5/17.
 */
public class ProjectStudentEntityPK implements Serializable {
    private Integer project;
    private Integer student;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectStudentEntityPK that = (ProjectStudentEntityPK) o;

        if (project != null ? !project.equals(that.project) : that.project != null) return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = project != null ? project.hashCode() : 0;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        return result;
    }
}
