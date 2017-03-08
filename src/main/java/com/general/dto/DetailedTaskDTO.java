package com.general.dto;

import java.util.Date;
import java.util.List;

public class DetailedTaskDTO {
	private String title;
	private String planToken;
	private String detail;
	private Date deadline;
	private List<User> owners;
	private List<File> files;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPlanToken() {
		return planToken;
	}
	public void setPlanToken(String planToken) {
		this.planToken = planToken;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public List<User> getOwners() {
		return owners;
	}
	public void setOwners(List<User> owners) {
		this.owners = owners;
	}
	public List<File> getFiles() {
		return files;
	}
	public void setFiles(List<File> files) {
		this.files = files;
	}
}
