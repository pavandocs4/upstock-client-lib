package com.upstock.client.lib.service.impl;

import org.springframework.stereotype.Component;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.upstock.client.lib.entity.UpstockAuthResponse;

@Component
public class MockService {

	public UpstockAuthResponse getAuthMockResponse() {
		String jsonString = "{" + "\"email\":\"pavandocs4@gmail.com\","
				+ "\"exchanges\":[\"BSE\",\"NSE\",\"NFO\",\"CDS\",\"BCD\",\"BFO\"],"
				+ "\"products\":[\"OCO\",\"D\",\"CO\",\"I\"]," + "\"broker\":\"UPSTOX\"," + "\"user_id\":\"JS4329\","
				+ "\"user_name\":\"PAVAN KISHORRAO KHEDKAR\","
				+ "\"order_types\":[\"MARKET\",\"LIMIT\",\"SL\",\"SL-M\"]," + "\"user_type\":\"individual\","
				+ "\"poa\":false," + "\"ddpi\":false," + "\"is_active\":true,"
				+ "\"access_token\":\"eyJ0eXAiOiJKV1QiLCJrZXlfaWQiOiJza192MS4wIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiJKUzQzMjkiLCJqdGkiOiI2ODQ4MzQ5YTljNDM0NDFiMjNmNzM1OTUiLCJpc011bHRpQ2xpZW50IjpmYWxzZSwiaXNQbHVzUGxhbiI6ZmFsc2UsImlhdCI6MTc0OTU2MjUyMiwiaXNzIjoidWRhcGktZ2F0ZXdheS1zZXJ2aWNlIiwiZXhwIjoxNzQ5NTkyODAwfQ.8h9d_wqpzzMHifSPrXUGA2LcOs2V6glfDxtLkVF1Fg4\","
				+ "\"extended_token\":null" + "}";

		JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
		return new UpstockAuthResponse("eyJ0eXAiOiJKV1QiLCJrZXlfaWQiOiJza192MS4wIiwiYWxnIjoiSFMyNTYifQ", false, "JS4329");
	}

}
