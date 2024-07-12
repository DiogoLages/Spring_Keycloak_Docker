package br.com.keycloak.spring_keycloak.models.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.keycloak.spring_keycloak.models.User;
import br.com.keycloak.spring_keycloak.services.LoginService;
import jakarta.validation.Valid;

@RestController
public class AuthController {

	@Autowired
	private LoginService<String> loginService;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@Valid @RequestBody User user){
		return loginService.login(user);
	}
	
	public ResponseEntity<?> refresh(@RequestParam("refresh_Token") String refreshToken) {
		return loginService.refreshToken(refreshToken);
	}
	
}
