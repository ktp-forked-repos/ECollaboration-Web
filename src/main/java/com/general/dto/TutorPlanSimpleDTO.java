package com.general.dto;

import java.util.Date;

public class TutorPlanSimpleDTO {
	private String planToken;
	private Date deadline;
	private String title;
	private String detail;
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

}
