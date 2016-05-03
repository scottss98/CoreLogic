package com.triples.corelogic.api;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.config.PropertyServiceConfig;
import com.triples.corelogic.config.SearchServiceConfig;

public class PostCodeRequest extends RestTemplate {
	private static final Logger log = LoggerFactory.getLogger(SuggestionRequest.class);
	private static final String relativeURI = "/au/property/postcode";
	
	private UriComponentsBuilder uriBuilder;
	private URI finalURI;
	private AccessToken accessToken;
	
	// Parameters
	private Integer postCodeId;

	private PostCodeRequest(UriComponentsBuilder uriBuilder) {
		this.uriBuilder = uriBuilder.path(relativeURI);
	}
	
	public PostCodeRequest(AccessToken accessToken, SearchServiceConfig serviceConfig, Integer postCodeId) {
		this(serviceConfig.getUriBuilder());
		this.accessToken = accessToken;
		this.postCodeId = postCodeId;
	}
	
	public PostCodeResponse getPostCodeResponse() {
		URI uri = getURI();
		log.info("URL: " + uri.toString());
		return getForObject(uri, PostCodeResponse.class);
	}
	
	private URI getURI() {
		if (finalURI == null) {
			uriBuilder.path(postCodeId.toString())
			          .queryParam("access_token", accessToken.toString());

			finalURI = uriBuilder.build(false).toUri();
		}
		
		return finalURI;
	}
	
	public Integer getPostCodeId() {
		return postCodeId;
	}

	public void setPostCodeId(Integer postCodeId) {
		this.postCodeId = postCodeId;
	}
}
