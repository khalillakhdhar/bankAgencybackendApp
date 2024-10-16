package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
