package com.binary.EmplloyeeManagement.service;

import com.binary.EmplloyeeManagement.dto.EmployeeDto;
import com.binary.EmplloyeeManagement.model.Employee;

import java.util.List;

public interface EmployeeSerive {
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    Employee updateEmployee(Integer id, Employee employeeDetails);
    void deleteEmployee(Integer id);
}
