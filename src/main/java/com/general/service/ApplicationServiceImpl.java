package com.general.service;

import com.general.dto.ErrorDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService {
	//postApplication
	public ErrorDTO submitTopicApplication(String json){

		return null;
	}
	//putApplication
	public ErrorDTO reviewApplication(String json,String applicationToken){
		return null;
	}
	
}
