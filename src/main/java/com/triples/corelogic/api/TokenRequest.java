package com.triples.corelogic.api;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.triples.corelogic.config.AccessServiceConfig;
import com.triples.corelogic.config.AppConfig;

public class TokenRequest extends RestTemplate {
	private static final Logger log = LoggerFactory.getLogger(TokenRequest.class);
	private static final String relativeURI = "/oauth/token";
	private static final String grant_type = "client_credentials";
	private URI finalURI;
	
	protected TokenRequest(UriComponentsBuilder builder, String client_id, String client_secret) throws URISyntaxException {
		this.finalURI = builder
					        .path(relativeURI)
					        .queryParam("client_id", client_id)
					        .queryParam("client_secret", client_secret)
					        .queryParam("grant_type", grant_type)
					        .build(false)
					        .toUri();
	}
	public TokenRequest(String method, String host, String baseURI, String client_id, String client_secret) throws URISyntaxException {
		this(UriComponentsBuilder.newInstance()
							.scheme(method)
					        .host(host)
					        .path(baseURI), 
			 client_id, 
			 client_secret);
	}
	
	public TokenRequest(AppConfig appConfig, AccessServiceConfig serviceConfig) throws URISyntaxException {
		this(serviceConfig.getUriBuilder(), appConfig.getClient_id(), appConfig.getClient_secret());
	}
	
	public TokenResponse getToken() {
		log.info("URL: " + finalURI.toString());
		return getForObject(finalURI, TokenResponse.class);
	}
}
