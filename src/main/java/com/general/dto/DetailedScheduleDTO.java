package com.general.dto;

import java.util.Date;
import java.util.List;

import com.general.Enum.RepetitionEnum;

public class DetailedScheduleDTO {
	private String title;
	private List<User> owners;
	private Date beginTime;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<User> getOwners() {
		return owners;
	}
	public void setOwners(List<User> owners) {
		this.owners = owners;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public RepetitionEnum getRepetition() {
		return repetition;
	}
	public void setRepetition(RepetitionEnum repetition) {
		this.repetition = repetition;
	}
	public String getProjectToken() {
		return projectToken;
	}
	public void setProjectToken(String projectToken) {
		this.projectToken = projectToken;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Boolean getCanDelete() {
		return canDelete;
	}
	public void setCanDelete(Boolean canDelete) {
		this.canDelete = canDelete;
	}
	private Date endTime;
	private RepetitionEnum repetition;
	private String projectToken;
	private String creatorName;
	private String detail;
	private Boolean canDelete;
}
