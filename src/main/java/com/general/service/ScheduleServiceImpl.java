package com.general.service;

import java.util.List;

import com.general.dto.DetailedScheduleDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.ScheduleDTO;
import com.general.dto.TokenDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
	//deleteSchedule
	public ErrorDTO deleteSchedule(String json,String scheduleToken){
		
		return null;
	}
	//getScheduleDetail
	public DetailedScheduleDTO getScheduleDetail(String json, String scheduleToken){
		return null;
	}
	//getScheduleList
	public List<ScheduleDTO> getScheduleList(String json){
		return null;
	}
	//getScheduleList
	public List<ScheduleDTO> getScheduleList(String json,String projectToken){
		return null;
	}
	//postSchedule
	public TokenDTO getTokenForCreatingSchedule(String json){
		return null;
	}
	//putSchedule
	public ErrorDTO createSchedule(String json){
		return null;
	}
}
