package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
