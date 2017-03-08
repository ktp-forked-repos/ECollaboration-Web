package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class TaskFileEntity {
    private Integer file;
    private Integer task;
    private FileEntity fileByFile;
    private TaskEntity taskByTask;

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
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

        TaskFileEntity that = (TaskFileEntity) o;

        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (task != null ? !task.equals(that.task) : that.task != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file != null ? file.hashCode() : 0;
        result = 31 * result + (task != null ? task.hashCode() : 0);
        return result;
    }

    public FileEntity getFileByFile() {
        return fileByFile;
    }

    public void setFileByFile(FileEntity fileByFile) {
        this.fileByFile = fileByFile;
    }

    public TaskEntity getTaskByTask() {
        return taskByTask;
    }

    public void setTaskByTask(TaskEntity taskByTask) {
        this.taskByTask = taskByTask;
    }
}
