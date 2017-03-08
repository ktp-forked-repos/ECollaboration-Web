package com.general.param.tutor;

import java.util.ArrayList;

//putScoreForTeam
public class ScoreForTeamToSubParam extends GlobalParam {

	private String transactionToken;
	private Score score;

	public Score newScore() {
		return new Score();
	}

	public String getTransactionToken() {
		return transactionToken;
	}

	public void setTransactionToken(String transactionToken) {
		this.transactionToken = transactionToken;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public class Score {
		private double total;
		private ArrayList<ScoreDetail> scores;

		public ArrayList<ScoreDetail> newScores() {
			return new ArrayList<ScoreDetail>();
		}
		
		public ScoreDetail newScore(){
			return new ScoreDetail();
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public ArrayList<ScoreDetail> getScores() {
			return scores;
		}

		public void setScores(ArrayList<ScoreDetail> scores) {
			this.scores = scores;
		}

		public class ScoreDetail {
			private String title;
			private double Score;
			private double weight;

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public double getScore() {
				return Score;
			}

			public void setScore(double score) {
				Score = score;
			}

			public double getWeight() {
				return weight;
			}

			public void setWeight(double weight) {
				this.weight = weight;
			}

		}
	}

}
