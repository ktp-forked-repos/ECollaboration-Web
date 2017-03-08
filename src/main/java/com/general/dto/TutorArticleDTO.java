package com.general.dto;

import java.util.Date;

public class TutorArticleDTO{
	protected String token;
	protected String title;
	private int maxTeamNum;
	private int minMember;
	private int maxMember;
	private Date deadline;
	private Boolean canEdit;
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
	public int getMaxTeamNum() {
		return maxTeamNum;
	}
	public void setMaxTeamNum(int maxTeamNum) {
		this.maxTeamNum = maxTeamNum;
	}
	public int getMinMember() {
		return minMember;
	}
	public void setMinMember(int minMember) {
		this.minMember = minMember;
	}
	public int getMaxMember() {
		return maxMember;
	}
	public void setMaxMember(int maxMember) {
		this.maxMember = maxMember;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public Boolean getCanEdit() {
		return canEdit;
	}
	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}
}
