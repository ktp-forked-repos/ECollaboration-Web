package com.general.service;

import java.util.List;

import com.general.dto.DetailedScheduleDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.ScheduleDTO;
import com.general.dto.TokenDTO;

public interface ScheduleService {
	//deleteSchedule
	public ErrorDTO deleteSchedule(String json,String scheduleToken);
	//getScheduleDetail
	public DetailedScheduleDTO getScheduleDetail(String json, String scheduleToken);
	//getScheduleList
	public List<ScheduleDTO> getScheduleList(String json);
	//getScheduleList
	public List<ScheduleDTO> getScheduleList(String json,String projectToken);
	//postSchedule
	public TokenDTO getTokenForCreatingSchedule(String json);
	//putSchedule
	public ErrorDTO createSchedule(String json);
}
