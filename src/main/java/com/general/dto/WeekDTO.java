package com.general.dto;

import java.util.Date;

import com.general.Enum.WeekEnum;

public class WeekDTO{
	private WeekEnum name;
	private Date value;
	public WeekEnum getName() {
		return name;
	}
	public void setName(WeekEnum name) {
		this.name = name;
	}
	public Date getValue() {
		return value;
	}
	public void setValue(Date value) {
		this.value = value;
	}

}
