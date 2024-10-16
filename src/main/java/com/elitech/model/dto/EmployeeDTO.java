package com.elitech.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class EmployeeDTO extends UserDTO {
	@JsonIgnoreProperties("employees")
private AgenceDTO agence;
	@JsonIgnoreProperties("responsable")
private List<UserDTO> clients;
}
