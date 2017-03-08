package com.general.dto;

public class StudentArticleDTO {
	private String title;
	private String tutorName;
	private Integer maxTeamNum;
	private Integer minMemberNum;
	private Integer maxMemberNum;
	private Integer applyNum;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTutorName() {
		return tutorName;
	}
	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}
	public Integer getMaxTeamNum() {
		return maxTeamNum;
	}
	public void setMaxTeamNum(Integer maxTeamNum) {
		this.maxTeamNum = maxTeamNum;
	}
	public Integer getMinMemberNum() {
		return minMemberNum;
	}
	public void setMinMemberNum(Integer minMemberNum) {
		this.minMemberNum = minMemberNum;
	}
	public Integer getMaxMemberNum() {
		return maxMemberNum;
	}
	public void setMaxMemberNum(Integer maxMemberNum) {
		this.maxMemberNum = maxMemberNum;
	}
	public Integer getApplyNum() {
		return applyNum;
	}
	public void setApplyNum(Integer applyNum) {
		this.applyNum = applyNum;
	}
	public Boolean getCanApply() {
		return canApply;
	}
	public void setCanApply(Boolean canApply) {
		this.canApply = canApply;
	}
	private Boolean canApply;
}
