package com.upstock.client.lib.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpstockAuthResponse implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	 
	@JsonProperty("access_token")
	private String access_token;
	@JsonProperty("is_active")
	private boolean is_active;
	@JsonProperty("user_id")
	private String user_id;

	public UpstockAuthResponse() {

	}

	public UpstockAuthResponse(String access_token, boolean is_active, String user_id) {
		super();
		this.access_token = access_token;
		this.is_active = is_active;
		this.user_id = user_id;
	}
}
