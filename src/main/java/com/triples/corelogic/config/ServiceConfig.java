package com.triples.corelogic.config;

import org.springframework.web.util.UriComponentsBuilder;

public abstract class ServiceConfig {
	private String method = "http";
	private String host;
	private String base_uri = "";
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public String getBase_uri() {
		return base_uri;
	}
	
	public void setBase_uri(String base_uri) {
		this.base_uri = base_uri;
	}
	
	public UriComponentsBuilder getUriBuilder() {
		return UriComponentsBuilder.newInstance()
							    	.scheme(method)
							        .host(host)
							        .path(base_uri);		
	}
	
	@Override
	public String toString() {
		return String.format("%s://%s%s", method, host, base_uri);
	}
}