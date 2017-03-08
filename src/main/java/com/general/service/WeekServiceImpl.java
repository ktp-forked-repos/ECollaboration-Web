package com.general.service;

import java.util.LinkedList;
import java.util.List;

import com.general.dto.WeekDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WeekServiceImpl implements WeekService {
	//getWeekList
	public List<WeekDTO> getWeekList(String json, String accessToken){
		List<WeekDTO> list=new LinkedList<>();
        return list;
	}
}
