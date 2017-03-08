package com.general.dto;

import java.util.List;

public class Team {
	private String leaderName;
	private List<String> member;
	private String teamToken;
	private String progress;
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public List<String> getMember() {
		return member;
	}
	public void setMember(List<String> member) {
		this.member = member;
	}
	public String getTeamToken() {
		return teamToken;
	}
	public void setTeamToken(String teamToken) {
		this.teamToken = teamToken;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
}
