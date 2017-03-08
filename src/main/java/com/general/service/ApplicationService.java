package com.general.service;

import com.general.dto.ErrorDTO;

public interface ApplicationService {
	//postApplication
	public ErrorDTO submitTopicApplication(String json);
	//putApplication
	public ErrorDTO reviewApplication(String json,String applicationToken);
	
}
