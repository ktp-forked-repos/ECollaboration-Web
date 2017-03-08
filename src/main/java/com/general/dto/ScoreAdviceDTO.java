package com.general.dto;

import java.util.List;

public class ScoreAdviceDTO {
	private String detail;
	private List<Advice> advice;
	private List<File> files;
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public List<Advice> getAdvice() {
		return advice;
	}
	public void setAdvice(List<Advice> advice) {
		this.advice = advice;
	}
	public List<File> getFiles() {
		return files;
	}
	public void setFiles(List<File> files) {
		this.files = files;
	}

}

