package com.triples.corelogic.api.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.triples.corelogic.api.services.PropertyService;
import com.triples.corelogic.api.services.SearchService;

@Controller
public class WebController {
	PropertyService propertyService;
	SearchService searchService;
	
	@Autowired
	WebController(PropertyService propertyService, SearchService searchService) {
		this.propertyService = propertyService;
		this.searchService = searchService;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "redirect:/propertySearch";
	}
	
	@RequestMapping(value="/propertySearch", method=RequestMethod.GET)
	public String showPropertySearch(Map<String, Object> model) {
		model.put("test", "value");
		return "PropertySearch";
	}
	
	@RequestMapping(value="/propertySearch", method=RequestMethod.POST)
	public String propertySuggestions(@RequestParam(required=true,  value="query") String query,
									  @RequestParam(required=false, value="suggestionTypes") String suggestionTypes,
									  @RequestParam(required=false, value="limit") Integer limit,
									  @RequestParam(required=false, value="includeUnits") Boolean includeUnits,
									  @RequestParam(required=false, value="includeBodyCorporates") Boolean includeBodyCorporates,
									  @RequestParam(required=false, value="returnSuggestion") String returnSuggestion,
									  Map<String, Object> model) {
		model.put("query", query);
		model.put("suggestionTypes", suggestionTypes);
		model.put("limit", limit);
		model.put("includeUnits", includeUnits);
		model.put("includeBodyCorporates", includeBodyCorporates);
		model.put("returnSuggestion", returnSuggestion);
		model.put("suggestionResponse", propertyService.getPropertySuggestions(query, suggestionTypes, limit, includeUnits, includeBodyCorporates, returnSuggestion));
		
		return "PropertySearch";
	}
	
	@RequestMapping(value="/property", method=RequestMethod.GET)
	public String propertyDetails(@RequestParam(required=true,  value="id") Integer propertyId,
									  Map<String, Object> model) {
		model.put("propertyId", propertyId);
		model.put("property", propertyService.getProperty(propertyId));
		
		return "PropertyDetail";
	}
/*
	@RequestMapping(value="/postCode", method=RequestMethod.GET)
	public String postcodeDetails(@RequestParam(required=true,  value="id") Integer postCodeId,
								  Map<String, Object> model) {
		model.put("postCodeId", postCodeId);
		model.put("postCodeDetails", searchService.getPostCode(postCodeId));
		
		return "PostCodeDetail";
	}
*/
}
