package com.elitech.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Min;
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
public class OperationDTO extends BaseDTO {

	@NotBlank
	private String types;
	//@Positive
	@Min(value = 10)
	private double montant;
	@JsonIgnoreProperties("operations")
private CompteDTO compte;
}
