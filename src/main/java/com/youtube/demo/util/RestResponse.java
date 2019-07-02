package com.youtube.demo.util;

public class RestResponse {

	private Integer reponseCode;
	private String messege;
	
	public RestResponse(Integer reponseCode) {
		super();
		this.reponseCode = reponseCode;
	}
	
	public RestResponse(Integer reponseCode, String messege) {
		super();
		this.reponseCode = reponseCode;
		this.messege = messege;		
	}	
	
	public Integer getReponseCode() {
		return reponseCode;
	}
	public void setReponseCode(Integer reponseCode) {
		this.reponseCode = reponseCode;
	}
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	
}
