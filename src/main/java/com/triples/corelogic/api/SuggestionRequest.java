package com.triples.corelogic.api;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.config.PropertyServiceConfig;

public class SuggestionRequest extends RestTemplate {
	private static final Logger log = LoggerFactory.getLogger(SuggestionRequest.class);
	private static final String version = "/v1";
	private static final String relativeURI = "/suggest.json";

	private UriComponentsBuilder uriBuilder;
	private URI finalURI;
	private AccessToken accessToken;

	// Parameters
	private String query;
	private String suggestionTypes;
	private Integer limit;
	private Boolean includeUnits;
	private Boolean includeBodyCorporates;
	private String returnSuggestion;

	private SuggestionRequest(UriComponentsBuilder uriBuilder) {
		this.uriBuilder = uriBuilder.path(version).path(relativeURI);
	}

	public SuggestionRequest(AccessToken accessToken, PropertyServiceConfig serviceConfig, String query) {
		this(serviceConfig.getUriBuilder());
		this.accessToken = accessToken;
		this.query = query;
	}

	public SuggestionRequest(AccessToken accessToken, PropertyServiceConfig serviceConfig, String query,
			String suggestionTypes, Integer limit, Boolean includeUnits, Boolean includeBodyCorporates,
			String returnSuggestion) {
		this(serviceConfig.getUriBuilder());
		this.accessToken = accessToken;
		this.query = query;
	}

	public SuggestionResponse getSuggestion() {
		URI uri = getURI();
		log.info("URL: " + uri.toString());
		return getForObject(uri, SuggestionResponse.class);
	}

	private URI getURI() {
		if (finalURI == null) {
			uriBuilder.queryParam("access_token", accessToken.toString()).queryParam("q", query);

			if (suggestionTypes != null) {
				uriBuilder.queryParam("suggestionTypes", suggestionTypes);
			}
			if (limit != null) {
				uriBuilder.queryParam("limit", limit);
			}
			if (includeUnits != null) {
				uriBuilder.queryParam("includeUnits", includeUnits);
			}
			if (returnSuggestion != null) {
				uriBuilder.queryParam("returnSuggestion", returnSuggestion);
			}
			finalURI = uriBuilder.build(false).toUri();
		}

		return finalURI;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSuggestionTypes() {
		return suggestionTypes;
	}

	public void setSuggestionTypes(String suggestionTypes) {
		this.suggestionTypes = suggestionTypes;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Boolean getIncludeUnits() {
		return includeUnits;
	}

	public void setIncludeUnits(Boolean includeUnits) {
		this.includeUnits = includeUnits;
	}

	public Boolean getIncludeBodyCorporates() {
		return includeBodyCorporates;
	}

	public void setIncludeBodyCorporates(Boolean includeBodyCorporates) {
		this.includeBodyCorporates = includeBodyCorporates;
	}

	public String getReturnSuggestion() {
		return returnSuggestion;
	}

	public void setReturnSuggestion(String returnSuggestion) {
		this.returnSuggestion = returnSuggestion;
	}
}
