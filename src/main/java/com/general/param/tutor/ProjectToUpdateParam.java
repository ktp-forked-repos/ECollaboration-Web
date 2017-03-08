package com.general.param.tutor;

import java.util.ArrayList;

//putProject
public class ProjectToUpdateParam extends GlobalParam {

	private String projectToken;
	private String transactionToken;
	private String title;
	private String detail;
	private int teamMax;
	private int memberMin;
	private int memberMax;
	private String deadline;
	private ArrayList<Object> files;

	public String getProjectToken() {
		return projectToken;
	}

	public void setProjectToken(String projectToken) {
		this.projectToken = projectToken;
	}

	public String getTransactionToken() {
		return transactionToken;
	}

	public void setTransactionToken(String transactionToken) {
		this.transactionToken = transactionToken;
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

	public int getTeamMax() {
		return teamMax;
	}

	public void setTeamMax(int teamMax) {
		this.teamMax = teamMax;
	}

	public int getMemberMin() {
		return memberMin;
	}

	public void setMemberMin(int memberMin) {
		this.memberMin = memberMin;
	}

	public int getMemberMax() {
		return memberMax;
	}

	public void setMemberMax(int memberMax) {
		this.memberMax = memberMax;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public ArrayList<Object> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<Object> files) {
		this.files = files;
	}

}
