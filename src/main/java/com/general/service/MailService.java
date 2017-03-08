package com.general.service;

import com.general.dto.ErrorDTO;
import com.general.dto.TokenDTO;

public interface MailService {
	//postMail
	public TokenDTO getTokenForSendingMail(String json);
	//putMail
	public ErrorDTO sendMail(String json,String transactionToken);
}
