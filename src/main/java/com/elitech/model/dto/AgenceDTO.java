package com.elitech.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
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
public class AgenceDTO extends BaseDTO{
	@NotBlank(message = "le  nom de l'agence est obligatoire")
	private String nom;
	@NotBlank(message = "le  ville est obligatoire")
	private String ville;
	@NotBlank(message = "l'adresse est obligatoire")
	private String adresse;
	@JsonIgnoreProperties("agence")
	private List<CompteDTO> comptes;
	@JsonIgnoreProperties("agences")
	private List<UserDTO> employees;
	

}
