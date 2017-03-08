package com.general.dto;

import java.util.Date;

public class PlanDTO {
	private String planToken;
	private Date deadline;
	private String title;
	private String detail;
	private Boolean isFinished;
	public String getPlanToken() {
		return planToken;
	}
	public void setPlanToken(String planToken) {
		this.planToken = planToken;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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

    @Override
    public String toString() {
        return "PlanDTO{" +
                "planToken='" + planToken + '\'' +
                ", deadline=" + deadline +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", isFinished=" + isFinished +
                '}';
    }
}
