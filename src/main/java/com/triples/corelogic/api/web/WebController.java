package com.triples.corelogic.api.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping(value="/propertySearch")
	public String showPropertySearch(Map<String, Object> model) {
		model.put("test", "value");
		return "PropertySearch";
	}
}
