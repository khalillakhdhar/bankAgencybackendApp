package com.elitech.model.dto;


import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
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
public class CompteDTO extends BaseDTO {
@NotBlank
private String type;
@PositiveOrZero
private double solde;
private AgenceDTO agence;
private List<OperationDTO> operations;
}
