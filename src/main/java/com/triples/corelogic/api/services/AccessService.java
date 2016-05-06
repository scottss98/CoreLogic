package com.triples.corelogic.api.services;

import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.triples.corelogic.api.TokenRequest;
import com.triples.corelogic.api.TokenResponse;
import com.triples.corelogic.config.AccessServiceConfig;
import com.triples.corelogic.config.AppConfig;

@RestController
public class AccessService extends ServiceBase {
	private static final Logger log = LoggerFactory.getLogger(AccessService.class);
	
	private final AppConfig appConfig;

	@Autowired
	public AccessService(AppConfig appConfig, AccessServiceConfig serviceConfig) {
		super(serviceConfig, null);
		this.appConfig = appConfig;
		
		log.debug("App Config: {}", appConfig);
		log.debug("Access Service Config: {}", getServiceConfig());
	}

	public TokenResponse getToken() {
		try {
			TokenRequest restTemplate = new TokenRequest(appConfig, (AccessServiceConfig)getServiceConfig());
			return restTemplate.getToken();
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}
}
