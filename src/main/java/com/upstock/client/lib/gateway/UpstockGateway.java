package com.upstock.client.lib.gateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.upstock.client.lib.configurations.UpstockClientConfig;
import com.upstock.client.lib.entity.UpstockAuthResponse;
import com.upstock.client.lib.service.impl.MockService;

import reactor.core.publisher.Mono;

@Component
public class UpstockGateway {

    @Value("${upstock.auth.mockFlag}")
	public boolean mockFlag;

	@Autowired
	private MockService mockService;

	@Autowired
	private WebClient webClient;

	@Autowired
	private UpstockClientConfig upstockClientConfig;

	public Mono<UpstockAuthResponse> doPost(MultiValueMap<String, String> request) {
		if (mockFlag)
			return Mono.just(mockService.getAuthMockResponse());
		else
			return webClient.post().uri(upstockClientConfig.getUrl()).contentType(MediaType.APPLICATION_FORM_URLENCODED)
					.body(BodyInserters.fromFormData(request)).retrieve().bodyToMono(UpstockAuthResponse.class);
	}

}
