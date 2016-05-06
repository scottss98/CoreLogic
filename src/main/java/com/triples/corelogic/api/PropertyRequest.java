package com.triples.corelogic.api;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.config.PropertyServiceConfig;

public class PropertyRequest extends RestTemplate {
	private static final Logger log = LoggerFactory.getLogger(PropertyRequest.class);
	private static final String version = "/v1";
	private static final String relativeURI = "/property/";
	
	private UriComponentsBuilder uriBuilder;
	private URI finalURI;
	private AccessToken accessToken;
	
	// Parameters
	private Integer propertyId;

	private PropertyRequest(UriComponentsBuilder uriBuilder) {
		this.uriBuilder = uriBuilder.path(version).path(relativeURI);
	}
	
	public PropertyRequest(AccessToken accessToken, PropertyServiceConfig serviceConfig, Integer propertyId) {
		this(serviceConfig.getUriBuilder());
		this.accessToken = accessToken;
		this.propertyId = propertyId;
	}
	
	public PropertyResponse getProperty() {
		URI uri = getURI();
		log.info("URL: " + uri.toString());
		return getForObject(uri, PropertyResponse.class);
	}
	
	private URI getURI() {
		if (finalURI == null) {
			uriBuilder.path(propertyId + ".json")
			          .queryParam("access_token", accessToken.toString());

			finalURI = uriBuilder.build(false).toUri();
		}
		
		return finalURI;
	}
	
	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
}
