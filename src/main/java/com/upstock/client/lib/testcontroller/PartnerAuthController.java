package com.upstock.client.lib.testcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upstock.client.lib.entity.UpstockAuthResponse;
import com.upstock.client.lib.service.UpstockClientService;
import com.upstock.client.starter.lib.global.exception.PartnerAuthException;

@RestController
public class PartnerAuthController {
	
	@Autowired
	private UpstockClientService upstockClientService;
	
	@PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UpstockAuthResponse> getAuthToken(@RequestParam("code") String code, @RequestParam("userId") String userId) throws PartnerAuthException{
		UpstockAuthResponse upstockAuthResponse= upstockClientService.getPartnerAuthResponse(code ,userId);
		return new ResponseEntity<UpstockAuthResponse>(upstockAuthResponse, HttpStatus.OK);
	}

}
