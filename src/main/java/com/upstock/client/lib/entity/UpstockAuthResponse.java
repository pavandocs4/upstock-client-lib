package com.upstock.client.lib.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpstockAuthResponse {
	@JsonProperty("access_token")
	private String access_token;
	@JsonProperty("is_active")
	private boolean is_active;
}
