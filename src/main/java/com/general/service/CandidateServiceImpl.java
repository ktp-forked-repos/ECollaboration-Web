package com.general.service;

import java.util.List;

import com.general.dto.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CandidateServiceImpl implements CandidateService {
	//getCandidateList
	public List<User> getCandidateList(String json){
		return null;
	}
}
