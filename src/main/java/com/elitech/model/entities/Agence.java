package com.elitech.model.entities;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.elitech.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
public class Agence extends BaseEntity{
	@Column(nullable = false)
private String nom;
	@Column(nullable = false)
private String ville;
	@Column(nullable = false)
private String adresse;
@ManyToMany(fetch = FetchType.EAGER,mappedBy = "agences")
@OnDelete(action = OnDeleteAction.CASCADE)
private List<User> users;
@OneToMany(mappedBy = "agence")
@OnDelete(action = OnDeleteAction.CASCADE)
private List<Employee> employees;
@OneToMany(mappedBy = "agence",fetch = FetchType.EAGER)
@OnDelete(action = OnDeleteAction.CASCADE)
private List<Compte> comptes;
}
