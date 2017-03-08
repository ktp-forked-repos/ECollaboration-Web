package com.general.param.student;

import java.util.ArrayList;

//putScoreAdvice
public class ScoreAdviceToSubmitParam extends GlobalParam {

	private String projectToken;
	private String detail;
	private String files;
	private ArrayList<AdviceDetail> advices;

	public ArrayList<AdviceDetail> newAdvices() {
		return new ArrayList<AdviceDetail>();
	}

	public AdviceDetail newAdvice() {
		return new AdviceDetail();
	}

	public String getProjectToken() {
		return projectToken;
	}

	public void setProjectToken(String projectToken) {
		this.projectToken = projectToken;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public ArrayList<AdviceDetail> getAdvices() {
		return advices;
	}

	public void setAdvices(ArrayList<AdviceDetail> advices) {
		this.advices = advices;
	}

	public class AdviceDetail {
		private String token;
		private double score;
		private double contribution;

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public double getScore() {
			return score;
		}

		public void setScore(double score) {
			this.score = score;
		}

		public double getContribution() {
			return contribution;
		}

		public void setContribution(double contribution) {
			this.contribution = contribution;
		}
	}

}
