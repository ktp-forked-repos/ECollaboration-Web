package com.general.controller.api;

import com.general.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.general.dto.ErrorDTO;
import com.general.dto.TokenDTO;

@Controller
@RequestMapping("/api/mails")
public class MailController {
	@Autowired
	private MailService mailService;
	//getTokenForSendingMail
	@RequestMapping(value="",method=RequestMethod.POST)
	public TokenDTO postMail(@RequestBody String json){


		return mailService.getTokenForSendingMail(json);
	}
	//sendMail
	@RequestMapping(value="/transactions/{transaction_token}",method=RequestMethod.PUT)
	public ErrorDTO putMail(@RequestBody String json,@PathVariable String transactionToken){

		return mailService.sendMail(json, transactionToken);
	}
}
