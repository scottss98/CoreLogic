package com.triples.corelogic.api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.api.PropertyRequest;
import com.triples.corelogic.api.PropertyResponse;
import com.triples.corelogic.api.PropertyResponse.Property;
import com.triples.corelogic.api.SuggestionRequest;
import com.triples.corelogic.api.SuggestionResponse;
import com.triples.corelogic.config.PropertyServiceConfig;

@RestController
public class PropertyService extends ServiceBase {
	private static final Logger log = LoggerFactory.getLogger(PropertyService.class);

	@Autowired
	public PropertyService(PropertyServiceConfig serviceConfig, AccessToken accessToken) {
		super(serviceConfig, accessToken);

		log.debug("Property Service Config: {}", getServiceConfig());
	}

	@RequestMapping(value = "/property")
	public String propertySuggestions(@RequestParam(required = true, value = "query") String query,
			@RequestParam(required = false, value = "suggestionTypes") String suggestionTypes,
			@RequestParam(required = false, value = "limit") Integer limit,
			@RequestParam(required = false, value = "includeUnits") Boolean includeUnits,
			@RequestParam(required = false, value = "includeBodyCorporates") Boolean includeBodyCorporates,
			@RequestParam(required = false, value = "returnSuggestion") String returnSuggestion) {
		SuggestionResponse response = getPropertySuggestions(query, suggestionTypes, limit, includeUnits,
				includeBodyCorporates, returnSuggestion);
		if (response != null) {
			return response.toString();
		} else {
			return "Error";
		}
	}

	public Property getProperty(Integer propertyId) {
		PropertyRequest request = new PropertyRequest(getAccessToken(), (PropertyServiceConfig) getServiceConfig(),
				propertyId);
		PropertyResponse response = request.getProperty();
		if (response != null) {
			return response.getProperty();
		} else {
			return null;
		}
	}

	public SuggestionResponse getPropertySuggestions(String query, String suggestionTypes, Integer limit,
			Boolean includeUnits, Boolean includeBodyCorporates, String returnSuggestion) {
		SuggestionRequest request = new SuggestionRequest(getAccessToken(), (PropertyServiceConfig) getServiceConfig(),
				query, suggestionTypes, limit, includeUnits, includeBodyCorporates, returnSuggestion);
		return request.getSuggestion();
	}
}
