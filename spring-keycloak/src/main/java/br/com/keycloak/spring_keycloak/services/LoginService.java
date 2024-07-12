package br.com.keycloak.spring_keycloak.services;

import org.springframework.http.ResponseEntity;

import br.com.keycloak.spring_keycloak.models.User;

public interface LoginService<T> {

	ResponseEntity<T> login(User user);
	
	ResponseEntity<T> refreshToken(String refreshToken);
}
