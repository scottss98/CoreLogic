package com.triples.corelogic.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenResponse {
	private String access_token;
	private String token_type;
	private int expires_in;
	private String scope;
	private String iss;
	private boolean env_access_restrict;
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public int getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getIss() {
		return iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}
	public boolean isEnv_access_restrict() {
		return env_access_restrict;
	}
	public void setEnv_access_restrict(boolean env_access_restrict) {
		this.env_access_restrict = env_access_restrict;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("access_token: \"").append(access_token).append("\"")
		  .append(", token_type: \"").append(token_type).append("\"")
		  .append(", expires_in: ").append(expires_in)
		  .append(", scope: \"").append(scope).append("\"")
		  .append(", iss: \"").append(iss).append("\"")
		  .append(", env_access_restrict: ").append(env_access_restrict);
		return sb.toString();
	}
}
