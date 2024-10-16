package com.elitech.model.entities;

import java.util.List;

import com.elitech.model.BaseEntity;
import com.elitech.model.enums.Types;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Compte extends BaseEntity {
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
private Types type;
@Column(nullable = false)
private double solde;
@ManyToOne(optional = false)
private User user;
@OneToMany(mappedBy = "compte")
private List<Operation> operations;
@ManyToOne(optional = false)
private Agence agence;

}
