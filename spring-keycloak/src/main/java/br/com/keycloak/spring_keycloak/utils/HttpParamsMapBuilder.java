package br.com.keycloak.spring_keycloak.utils;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class HttpParamsMapBuilder {
	
	private final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
	
	public static HttpParamsMapBuilder builder() {
		return new HttpParamsMapBuilder();
	}

	public HttpParamsMapBuilder withClient(String clientId) {
		params.add("clientId", clientId);
		return this;
	}
	
	public HttpParamsMapBuilder withClientSecret(String clientSecret) {
		params.add("clientSecret", clientSecret);
		return this;
	}
	
	public HttpParamsMapBuilder withGrantType(String grantType) {
		params.add("grantType", grantType);
		return this;
	}
	
	public HttpParamsMapBuilder withUserName(String username) {
		params.add("username", username);
		return this;
	}
	
	public HttpParamsMapBuilder withPassword(String password) {
		params.add("password", password);
		return this;
	}

	public HttpParamsMapBuilder withRefreshToken(String refreshToken) {
		params.add("refreshToken", refreshToken);
		return this;
	}
	
	public MultiValueMap<String, String> build() {
		return params;
	}
	
}
