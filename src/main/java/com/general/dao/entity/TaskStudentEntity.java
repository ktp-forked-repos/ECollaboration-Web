package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class TaskStudentEntity {
    private Integer student;
    private Integer task;
    private StudentEntity studentByStudent;
    private TaskEntity taskByTask;

    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    public Integer getTask() {
        return task;
    }

    public void setTask(Integer task) {
        this.task = task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskStudentEntity that = (TaskStudentEntity) o;

        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        if (task != null ? !task.equals(that.task) : that.task != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student != null ? student.hashCode() : 0;
        result = 31 * result + (task != null ? task.hashCode() : 0);
        return result;
    }

    public StudentEntity getStudentByStudent() {
        return studentByStudent;
    }

    public void setStudentByStudent(StudentEntity studentByStudent) {
        this.studentByStudent = studentByStudent;
    }

    public TaskEntity getTaskByTask() {
        return taskByTask;
    }

    public void setTaskByTask(TaskEntity taskByTask) {
        this.taskByTask = taskByTask;
    }
}
