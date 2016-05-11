package com.triples.corelogic.api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.api.PostCodeRequest;
import com.triples.corelogic.api.PostCodeResponse;
import com.triples.corelogic.config.SearchServiceConfig;

import io.swagger.model.PagedResourcesOfPropertySearchResource;

@RestController
public class SearchService extends ServiceBase {
	private static final Logger log = LoggerFactory.getLogger(SearchService.class);

	@Autowired
	public SearchService(SearchServiceConfig serviceConfig, AccessToken accessToken) {
		super(serviceConfig, accessToken);

		log.debug("Search Service Config: {}", getServiceConfig());
	}

	public PagedResourcesOfPropertySearchResource getPostCode(Integer postCodeId) {
		PostCodeRequest request = new PostCodeRequest(getAccessToken(), (SearchServiceConfig)getServiceConfig(), postCodeId);
		PagedResourcesOfPropertySearchResource response = request.getPostCodeResponse();
		if (response != null) {
			return response;
		}
		else {
			return null;
		}
	}
}
