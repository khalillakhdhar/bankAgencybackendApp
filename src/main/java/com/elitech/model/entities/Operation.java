package com.elitech.model.entities;

import com.elitech.model.BaseEntity;
import com.elitech.model.enums.TypeOperation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Operation extends BaseEntity {
	@Column(nullable = false)
private double montant;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
private TypeOperation types;
	@ManyToOne(optional = true)
	private Compte compte;
}
