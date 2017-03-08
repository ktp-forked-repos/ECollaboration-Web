package com.general.service;

import com.general.dto.DetailedStudentProfileDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.ProfileDTO;

public interface ProfileService {
	//GetProfile
	public ProfileDTO getProfile(com.general.param.GlobalParam globalParam);
	//putProfile
	public ErrorDTO updateProfile(String json);
	//getProfileOfStudent
	public DetailedStudentProfileDTO getStudentDetailedProfile(String json,String studentToken);
}
