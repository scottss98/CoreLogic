package com.triples.corelogic.api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.api.PostCodeRequest;
import com.triples.corelogic.api.PostCodeResponse;
import com.triples.corelogic.config.SearchServiceConfig;

@RestController
public class SearchService {
	private static final Logger log = LoggerFactory.getLogger(PropertyService.class);

	private final SearchServiceConfig serviceConfig;
	private AccessToken accessToken;

	@Autowired
	public SearchService(SearchServiceConfig serviceConfig, AccessToken accessToken) {
		this.serviceConfig = serviceConfig;
		this.accessToken = accessToken;

		log.info("Property Service Config: " + this.serviceConfig.toString());
	}

	public PostCodeResponse getPostCode(Integer postCodeId) {
		PostCodeRequest request = new PostCodeRequest(accessToken, serviceConfig, postCodeId);
		PostCodeResponse response = request.getPostCodeResponse();
		if (response != null) {
			return response;
		}
		else {
			return null;
		}
	}
}
