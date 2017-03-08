package com.general.param.tutor;

import java.util.ArrayList;

//putQuestionaire
public class QuestionaireToUpdateParam extends GlobalParam {

	private String projectToken;
	private ArrayList<AnswerDetail> answers;

	public ArrayList<AnswerDetail> newAnswers() {
		return new ArrayList<AnswerDetail>();
	}

	public AnswerDetail newAnswer() {
		return new AnswerDetail();
	}

	public String getProjectToken() {
		return projectToken;
	}

	public void setProjectToken(String projectToken) {
		this.projectToken = projectToken;
	}

	public ArrayList<AnswerDetail> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<AnswerDetail> answers) {
		this.answers = answers;
	}

	public class AnswerDetail {
		private String title;
		private int type;
		private ArrayList<String> options;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public ArrayList<String> getOptions() {
			return options;
		}

		public void setOptions(ArrayList<String> options) {
			this.options = options;
		}
	}

}
