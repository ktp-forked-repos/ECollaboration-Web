package com.general.param.tutor;

import java.util.ArrayList;

//putScoreForStudent
public class ScoreforStudentToSubParam extends GlobalParam {

	private String teamToken;
	private ArrayList<ScoreDetail> scores;

	public ArrayList<ScoreDetail> newScores() {
		return new ArrayList<ScoreDetail>();
	}

	public ScoreDetail newScore() {
		return new ScoreDetail();
	}

	public String getTeamToken() {
		return teamToken;
	}

	public void setTeamToken(String teamToken) {
		this.teamToken = teamToken;
	}

	public ArrayList<ScoreDetail> getScores() {
		return scores;
	}

	public void setScores(ArrayList<ScoreDetail> scores) {
		this.scores = scores;
	}

	public class ScoreDetail {
		private String token;
		private double score;

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
	}

}
