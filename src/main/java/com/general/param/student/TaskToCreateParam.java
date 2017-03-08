package com.general.param.student;

import java.util.ArrayList;

//putNewTask
public class TaskToCreateParam extends GlobalParam {

	private String projectToken;
	private String transactionToken;
	private String name;
	private String planToken;
	private String detail;
	private String deadline;
	private ArrayList<OwnerDetail> owners;
	private ArrayList<Object> files;

	public ArrayList<OwnerDetail> newOwners() {
		return new ArrayList<OwnerDetail>();
	}

	public OwnerDetail newOwner() {
		return new OwnerDetail();
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public ArrayList<OwnerDetail> getOwners() {
		return owners;
	}

	public void setOwners(ArrayList<OwnerDetail> owners) {
		this.owners = owners;
	}

	public ArrayList<Object> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<Object> files) {
		this.files = files;
	}

	public class OwnerDetail {
		private String token;

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

	}

}
