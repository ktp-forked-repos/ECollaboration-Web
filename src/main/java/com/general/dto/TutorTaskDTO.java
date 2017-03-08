package com.general.dto;

import java.util.Date;
import java.util.List;

public class TutorTaskDTO {
	private String token;
	private String title;
	private List<User> owner;
	private Date finishTime;
	private String evaluation;

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<User> getOwner() {
		return owner;
	}
	public void setOwner(List<User> owner) {
		this.owner = owner;
	}
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
}
