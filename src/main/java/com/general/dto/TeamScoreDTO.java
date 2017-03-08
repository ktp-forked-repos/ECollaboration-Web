package com.general.dto;

import java.util.List;

public class TeamScoreDTO {
	private Double total;
	private List<PartialScore> scores;
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public List<PartialScore> getScores() {
		return scores;
	}
	public void setScores(List<PartialScore> scores) {
		this.scores = scores;
	}
}
