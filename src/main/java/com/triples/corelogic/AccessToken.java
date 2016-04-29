package com.triples.corelogic;

import org.springframework.stereotype.Component;

import com.triples.corelogic.api.TokenResponse;

@Component
public class AccessToken {
	private TokenResponse token;
	
	public boolean bTokenReady() {
		return (token != null);
	}
	
	public void setTokenResponse(TokenResponse token) {
		this.token = token;
	}
	
	@Override
	public String toString() {
		return token.getAccess_token();
	}
}
