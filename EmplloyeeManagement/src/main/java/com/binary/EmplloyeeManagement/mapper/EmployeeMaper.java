package com.binary.EmplloyeeManagement.mapper;

import com.binary.EmplloyeeManagement.dto.EmployeeDto;
import com.binary.EmplloyeeManagement.model.Employee;

public class EmployeeMaper {
    public static EmployeeDto mapToEmployeeDto(Employee employee)
    {
        return new EmployeeDto(employee.getId(),
                employee.getFirstName()
                ,employee.getLastName(),
                employee.getEmail());
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto)
    {
        return new Employee(employeeDto.getId(),
                employeeDto.getFirstName()
                ,employeeDto.getLastName(),
                employeeDto.getEmail());
    }

}
