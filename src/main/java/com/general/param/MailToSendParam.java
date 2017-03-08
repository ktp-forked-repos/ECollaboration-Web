package com.general.param;

import java.util.ArrayList;

//putMail
public class MailToSendParam extends GlobalParam {

	private String transactionToken;
	private String consignee;
	private String subject;
	private String content;
	private ArrayList<Object> files;

	public String getTransactionToken() {
		return transactionToken;
	}

	public void setTransactionToken(String transactionToken) {
		this.transactionToken = transactionToken;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ArrayList<Object> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<Object> files) {
		this.files = files;
	}

}
