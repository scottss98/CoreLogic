package com.triples.corelogic.api.services;

import com.triples.corelogic.AccessToken;
import com.triples.corelogic.config.ServiceConfig;

public class ServiceBase {
	private final ServiceConfig serviceConfig;
	private AccessToken accessToken;

	public ServiceBase(ServiceConfig serviceConfig, AccessToken accessToken) {
		this.serviceConfig = serviceConfig;
		this.accessToken = accessToken;
	}

	protected AccessToken getAccessToken() {
		return accessToken;
	}

	protected void setAccessToken(AccessToken accessToken) {
		this.accessToken = accessToken;
	}

	protected ServiceConfig getServiceConfig() {
		return serviceConfig;
	}
}
