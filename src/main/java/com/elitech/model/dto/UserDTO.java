package com.elitech.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
	@NotBlank(message = "le nom est obligatoire")
	@Pattern(regexp = "^[A-Za-z éçè]+$",message = "veuillez saisir un nom valide")
	private String nom;
	@NotBlank(message = "le prenom est obligatoire")
	@Pattern(regexp = "^[A-Za-z éçè]+$",message = "veuillez saisir un nom valide")
	
	private String prenom;
	@Email(message = "veuillez saisir un email valide")
	@NotBlank(message="Email ne peut pas être vide")
	private String email;
	@NotBlank(message = "le mot de passe est obligatoire")
	@Pattern(
			regexp ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!*& ]))"
			)
	
	private String mdp;
	@Pattern(regexp = "^[0-9+ -]")
	@NotBlank
	private String telephone;
	private String genre;
	private String grade;
	@JsonIgnoreProperties("comptes")
	private List<CompteDTO> comptes;
@JsonIgnoreProperties("employees")
	private List<AgenceDTO> agences;
@JsonIgnoreProperties("clients")
	private EmployeeDTO responsable;

}
