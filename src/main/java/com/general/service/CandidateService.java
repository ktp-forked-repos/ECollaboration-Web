package com.general.service;

import java.util.List;

import com.general.dto.User;

public interface CandidateService {
	//getCandidateList
	public List<User> getCandidateList(String json);
}
