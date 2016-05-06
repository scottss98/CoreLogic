package com.triples.corelogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.triples.corelogic.api.TokenResponse;
import com.triples.corelogic.api.services.AccessService;

@Component
public class AccessToken {
	private static final Logger log = LoggerFactory.getLogger(AccessToken.class);
	private final AccessService accessService;
	private TokenResponse token;
	
	@Autowired
	public AccessToken(AccessService accessService) {
		this.accessService = accessService;
	}
	
	private TokenResponse getTokenResponse() {
		boolean bValidToken = false;
		
		if (token != null) {
			if (token.isValid()){
				bValidToken = true;
			}
			else {
				log.info("Token is invalid (probably expired). Old token: {}", token);
			}
		}
		
		if (!bValidToken) {
			log.info("Getting new token...");
			token = accessService.getToken();
			
			if (token != null) {
				if (token.isValid()){
					log.info("New token is valid. New token: {}", token);
					bValidToken = true;
				}
				else {
					log.info("New token is invalid! New token: {}", token);
				}
			}
			else {
				log.error("Failed to get new token");
			}
		}
		
		if (bValidToken) {
			return token;
		}
		else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		TokenResponse response = getTokenResponse();
		if (response != null) {
			return response.getAccess_token();
		}
		else {
			return "No valid access token";
		}
	}
}
