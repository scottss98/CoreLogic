package com.triples.corelogic.api.services;

import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.api.TokenRequest;
import com.triples.corelogic.api.TokenResponse;
import com.triples.corelogic.config.AccessServiceConfig;
import com.triples.corelogic.config.AppConfig;

@RestController
public class AccessService {
	private static final Logger log = LoggerFactory.getLogger(AccessService.class);
	
	private final AppConfig appConfig;
	private final AccessServiceConfig serviceConfig;
	private final AccessToken accessToken;

	@Autowired
	public AccessService(AppConfig appConfig, AccessServiceConfig serviceConfig, AccessToken accessToken) {
		this.appConfig = appConfig;
		this.serviceConfig = serviceConfig;
		this.accessToken = accessToken;
		
		log.info("App Config: " + this.appConfig.toString());
		log.info("Access Service Config: " + this.serviceConfig.toString());
		
		this.accessToken.setTokenResponse(getToken());
	}
/*	
	@RequestMapping("/")
	public String home() {
		Token token = getToken();
		if (token != null) {
			return token.toString();
		}
		else {
			return "Error";
		}
	}
*/
	public TokenResponse getToken() {
		try {
			TokenRequest restTemplate = new TokenRequest(appConfig, serviceConfig);
			return restTemplate.getToken();
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}
}
