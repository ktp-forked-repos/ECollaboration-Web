package com.general.dto;

import java.util.Date;
import java.util.List;

public class ProjectTeamDTO {
	private String teamToken;
	private User leader;
	private List<User> members;
	private Date applyTime;
	private Date passTime;
	public String getTeamToken() {
		return teamToken;
	}
	public void setTeamToken(String teamToken) {
		this.teamToken = teamToken;
	}
	public User getLeader() {
		return leader;
	}
	public void setLeader(User leader) {
		this.leader = leader;
	}
	public List<User> getMembers() {
		return members;
	}
	public void setMembers(List<User> members) {
		this.members = members;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getPassTime() {
		return passTime;
	}
	public void setPassTime(Date passTime) {
		this.passTime = passTime;
	}
}
