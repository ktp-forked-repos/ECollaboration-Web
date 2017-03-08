package com.general.dto;

import java.util.Date;

public class TutorPlanDTO {
	private String planToken;
	private Date deadline;
	private String title;
	private String detail;
	private Boolean isFinished;
	private Boolean isFinishedOnTime;
	private Date submitTime;
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
	public Boolean getIsFinishedOnTime() {
		return isFinishedOnTime;
	}
	public void setIsFinishedOnTime(Boolean isFinishedOnTime) {
		this.isFinishedOnTime = isFinishedOnTime;
	}
	public Date getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
}
