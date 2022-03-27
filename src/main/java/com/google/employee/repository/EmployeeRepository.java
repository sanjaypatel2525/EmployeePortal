package com.google.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.employee.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByIdGreaterThan(int id);

}
