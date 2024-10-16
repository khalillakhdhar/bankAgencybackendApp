package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {

}
