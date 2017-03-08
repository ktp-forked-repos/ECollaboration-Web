package com.general.dto;

import java.util.Date;

public class TaskDTO {
	private String title;
	private Date deadline;
	private String detail;
	private Boolean isFinished;
	private String token;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Boolean getIsFinished() {
		return isFinished;
	}
	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

    @Override
    public String toString() {
        return "TaskDTO{" +
                "title='" + title + '\'' +
                ", deadline=" + deadline +
                ", detail='" + detail + '\'' +
                ", isFinished=" + isFinished +
                ", token='" + token + '\'' +
                '}';
    }
}
