package com.general.service;

import com.general.dto.ErrorDTO;
import com.general.dto.TokenDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MailServiceImpl implements MailService {
	//postMail
	public TokenDTO getTokenForSendingMail(String json){
		return null;
	}
	//putMail
	public ErrorDTO sendMail(String json,String transactionToken){
		return null;
	}
}
