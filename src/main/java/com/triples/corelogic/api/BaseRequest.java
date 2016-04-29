package com.triples.corelogic.api;

import org.springframework.web.client.RestTemplate;

public class BaseRequest extends RestTemplate {
	private static String client_id;
	private static String client_secret;
	
	public BaseRequest() {
	}
	
	public static void setClientId(String client_id) {
		BaseRequest.client_id = client_id;
	}
	
	public static void setClientSecret(String client_secret) {
		BaseRequest.client_secret = client_secret;
	}
}
