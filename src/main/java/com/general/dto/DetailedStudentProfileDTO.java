package com.general.dto;

public class DetailedStudentProfileDTO {
	private String name;
	private String studentId;
	private String phoneNumber;
	private String wechatAccount;
	private String githubAccount;
	private String eamil;
	private SimpleQuestionaireDTO questionaires;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getWechatAccount() {
		return wechatAccount;
	}
	public void setWechatAccount(String wechatAccount) {
		this.wechatAccount = wechatAccount;
	}
	public String getGithubAccount() {
		return githubAccount;
	}
	public void setGithubAccount(String githubAccount) {
		this.githubAccount = githubAccount;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public SimpleQuestionaireDTO getQuestionaires() {
		return questionaires;
	}
	public void setQuestionaires(SimpleQuestionaireDTO questionaires) {
		this.questionaires = questionaires;
	}
}
