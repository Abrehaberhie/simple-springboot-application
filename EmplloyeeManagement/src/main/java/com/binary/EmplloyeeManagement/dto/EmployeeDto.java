package com.binary.EmplloyeeManagement.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
