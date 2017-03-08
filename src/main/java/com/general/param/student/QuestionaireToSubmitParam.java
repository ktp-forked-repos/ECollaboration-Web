package com.general.param.student;

import java.util.ArrayList;

//putQuestionare
public class QuestionaireToSubmitParam extends GlobalParam {

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
		private String answerToken;
		private String answerValue;

		public String getAnswerToken() {
			return answerToken;
		}

		public void setAnswerToken(String answerToken) {
			this.answerToken = answerToken;
		}

		public String getAnswerValue() {
			return answerValue;
		}

		public void setAnswerValue(String answerValue) {
			this.answerValue = answerValue;
		}

	}

}
