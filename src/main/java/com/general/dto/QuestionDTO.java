package com.general.dto;

import java.util.List;

import com.general.Enum.QuestionTypeEnum;

public class QuestionDTO {
	private String title;
	public QuestionTypeEnum type;
	private String token;
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}

}
