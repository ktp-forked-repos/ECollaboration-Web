package com.general.dto;

import java.util.Date;
import java.util.List;

public class StudentTaskDTO {
	private String title;
	private Date deadline;
	private Boolean isFinished;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public Boolean getIsFinished() {
		return isFinished;
	}
	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}
	public List<TaskDTO> getTasks() {
		return tasks;
	}
	public void setTasks(List<TaskDTO> tasks) {
		this.tasks = tasks;
	}
	private List<TaskDTO> tasks;

    @Override
    public String toString() {
        return "StudentTaskDTO{" +
                "title='" + title + '\'' +
                ", deadline=" + deadline +
                ", isFinished=" + isFinished +
                ", tasks=" + tasks +
                '}';
    }
}
