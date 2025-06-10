package com.upstock.client.lib.service;

import org.springframework.stereotype.Service;

import com.upstock.client.lib.entity.UpstockAuthResponse;
import com.upstock.client.starter.lib.global.exception.PartnerAuthException;

@Service
public interface UpstockClientService {

	UpstockAuthResponse getPartnerAuthResponse(String code, String userId) throws PartnerAuthException;

	UpstockAuthResponse getPartnerAuthResponse(String userId) throws PartnerAuthException;

}
