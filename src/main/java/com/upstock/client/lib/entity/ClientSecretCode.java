package com.upstock.client.lib.entity;

import java.time.LocalDateTime;

public class ClientSecretCode {
	private LocalDateTime createdAt;
	private String code;

	public ClientSecretCode(LocalDateTime createdAt, String code) {
		super();
		this.createdAt = createdAt;
		this.code = code;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
