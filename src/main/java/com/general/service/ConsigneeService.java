package com.general.service;

import java.util.List;

import com.general.dto.ConsigneeDTO;

public interface ConsigneeService {
	//getMailToList
	public List<ConsigneeDTO> getConsigneeList(String json);
	//getMailToListWithProjToken
	public List<ConsigneeDTO> getConsigneeListWithProjToken(String json,String projectToken);
}
