package com.binary.EmplloyeeManagement.repository;

import com.binary.EmplloyeeManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
