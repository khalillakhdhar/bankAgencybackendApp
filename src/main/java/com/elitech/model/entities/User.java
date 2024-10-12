package com.elitech.model.entities;


import com.elitech.model.BaseEntity;
import com.elitech.model.enums.Genders;
import com.elitech.model.enums.Grades;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class User extends BaseEntity {
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false,unique = true)
	private String telephone;
	@Column(nullable = false)
	private String mdp;
	@Enumerated(EnumType.STRING)
	private Genders genre;
	@Enumerated(EnumType.STRING)
	private Grades grades;

}
