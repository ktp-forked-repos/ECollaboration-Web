package com.general.service;

import java.util.List;

import com.general.dto.ConsigneeDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ConsigneeServiceImpl implements ConsigneeService {
	//getMailToList
	public List<ConsigneeDTO> getConsigneeList(String json){
		return null;
	}
	//getMailToListWithProjToken
	public List<ConsigneeDTO> getConsigneeListWithProjToken(String json,String projectToken){
		return null;
	}
}
