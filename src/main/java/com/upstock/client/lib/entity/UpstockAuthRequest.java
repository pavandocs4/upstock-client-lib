package com.upstock.client.lib.entity;

public class UpstockAuthRequest {
	private String code;
	private String redirection_uri;
	private String client_id;
	private String client_secret;
	private String grant_type;

	public UpstockAuthRequest(String secretCode, String redirection_uri, String client_id, String client_secret,
			String grant_type) {
		super();
		this.code = secretCode;
		this.redirection_uri = redirection_uri;
		this.client_id = client_id;
		this.client_secret = client_secret;
		this.grant_type = grant_type;
	}

	public String getSecretCode() {
		return code;
	}

	public void setSecretCode(String secretCode) {
		this.code = secretCode;
	}

	public String getRedirection_uri() {
		return redirection_uri;
	}

	public void setRedirection_uri(String redirection_uri) {
		this.redirection_uri = redirection_uri;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getGrant_type() {
		return grant_type;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

}
