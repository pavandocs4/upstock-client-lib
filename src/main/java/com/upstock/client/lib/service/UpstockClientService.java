package com.upstock.client.lib.service;

import org.springframework.stereotype.Service;

import com.upstock.client.lib.entity.UpstockAuthResponse;

@Service
public interface UpstockClientService {

	UpstockAuthResponse getPartnerAuthResponse(String code);

}
