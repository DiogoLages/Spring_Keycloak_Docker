package br.com.keycloak.spring_keycloak.models;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	
	@NotBlank(message = "Nome do usuário é obrigatório")
	private String username;
	
	@Size(min = 8, max = 20, message = "A senha deve ter entre 8 e 20 caracteres")
	private String password;

}
