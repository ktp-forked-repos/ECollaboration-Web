package com.general.dto;

import java.util.List;

import com.general.Enum.QuestionTypeEnum;

public class SimpleQuestionaireDTO {
	private String title;
	public QuestionTypeEnum type;
	private List<Option> options;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public QuestionTypeEnum getType() {
		return type;
	}
	public void setType(QuestionTypeEnum type) {
		this.type = type;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
}
