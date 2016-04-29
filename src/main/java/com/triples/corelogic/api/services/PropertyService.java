package com.triples.corelogic.api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.api.SuggestionRequest;
import com.triples.corelogic.api.SuggestionResponse;
import com.triples.corelogic.config.PropertyServiceConfig;

@RestController
public class PropertyService {
	private static final Logger log = LoggerFactory.getLogger(PropertyService.class);
	
	private final PropertyServiceConfig serviceConfig;
	private AccessToken accessToken;

	@Autowired
	public PropertyService(PropertyServiceConfig serviceConfig, AccessToken accessToken) {
		this.serviceConfig = serviceConfig;
		this.accessToken = accessToken;
		
		log.info("Property Service Config: " + this.serviceConfig.toString());
	}
	
	@RequestMapping(value="/property")
	public String propertySuggestions(@RequestParam(required=true,  value="query") String query,
									  @RequestParam(required=false, value="suggestionTypes") String suggestionTypes,
									  @RequestParam(required=false, value="limit") Integer limit,
									  @RequestParam(required=false, value="includeUnits") Boolean includeUnits,
									  @RequestParam(required=false, value="includeBodyCorporates") Boolean includeBodyCorporates,
									  @RequestParam(required=false, value="returnSuggestion") String returnSuggestion) {
		SuggestionRequest request = new SuggestionRequest(accessToken, serviceConfig, query);
		if (suggestionTypes != null) {
			request.setSuggestionTypes(suggestionTypes);
		}
		if (limit != null) {
			request.setLimit(limit);
		}
		if (includeUnits != null) {
			request.setIncludeUnits(includeUnits);
		}
		if (includeBodyCorporates != null) {
			request.setIncludeBodyCorporates(includeBodyCorporates);
		}
		if (returnSuggestion != null) {
			request.setReturnSuggestion(returnSuggestion);
		}
		
		SuggestionResponse response = request.getSuggestion();
		if (response != null) {
			return response.toString();
		}
		else {
			return "Error";
		}
	}
}
