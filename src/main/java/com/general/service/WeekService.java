package com.general.service;

import java.util.List;

import com.general.dto.WeekDTO;

public interface WeekService {
	//getWeekList
	public List<WeekDTO> getWeekList(String json, String accessToken);
}
