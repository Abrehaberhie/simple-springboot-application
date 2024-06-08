package com.binary.EmplloyeeManagement.controller;

import com.binary.EmplloyeeManagement.dto.EmployeeDto;
import com.binary.EmplloyeeManagement.model.Employee;
import com.binary.EmplloyeeManagement.service.EmployeeSerive;
import com.binary.EmplloyeeManagement.service.EmployeeServiceImple;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeServiceImple employeeServiceImple;

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeServiceImple.createEmployee(employee);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeServiceImple.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
        Employee employee = employeeServiceImple.getEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee employeeDetails) {
        Employee updatedEmployee = employeeServiceImple.updateEmployee(id, employeeDetails);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
        employeeServiceImple.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
