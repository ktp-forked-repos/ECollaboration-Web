package com.general.param.student;

//postApplication
public class ApplicationToSubmitParam extends GlobalParam {

	private String tutor;
	private String title;
	private int beLeader;

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBeLeader() {
		return beLeader;
	}

	public void setBeLeader(int beLeader) {
		this.beLeader = beLeader;
	}

}
