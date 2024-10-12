package com.elitech.model.entities;


import java.util.List;

import com.elitech.model.BaseEntity;
import com.elitech.model.enums.Genders;
import com.elitech.model.enums.Grades;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Inheritance(strategy = InheritanceType.JOINED)
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
	@OneToMany(mappedBy = "user")
	private List<Compte> comptes;
	@ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Agence> agences;
	@ManyToOne(fetch = FetchType.EAGER)
	private Employee responsable;

}
