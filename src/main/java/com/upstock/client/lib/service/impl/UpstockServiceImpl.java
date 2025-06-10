package com.upstock.client.lib.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.upstock.client.lib.configurations.UpstockClientConfig;
import com.upstock.client.lib.entity.UpstockAuthRequest;
import com.upstock.client.lib.entity.UpstockAuthResponse;
import com.upstock.client.lib.gateway.UpstockGateway;
import com.upstock.client.lib.service.UpstockClientService;

@Service
public class UpstockServiceImpl implements UpstockClientService {

	@Autowired
	private UpstockGateway upstockGateway;

	@Autowired
	private UpstockClientConfig upstockClientConfig;

	@Override

   // @Cacheable(value = "upstockAuthResponse")
	public UpstockAuthResponse getPartnerAuthResponse(String code) {
		// TODO Auto-generated method stub
		MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
		formData.add("code", code);
		formData.add("client_id", upstockClientConfig.getClient_id());
		formData.add("client_secret", upstockClientConfig.getClient_secret());
		formData.add("redirect_uri", upstockClientConfig.getRedirection_uri());
		formData.add("grant_type", upstockClientConfig.getGrant_type());

		return upstockGateway.doPost(formData).block();
		
	}

}
