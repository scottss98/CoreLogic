package com.triples.corelogic.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "rp_data")
public class AppConfig {
	private String client_id;
	private String client_secret;
	
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	
	@Override
	public String toString() {
		return String.format("Client ID: %s, Secret: %s", client_id, client_secret);
	}
}