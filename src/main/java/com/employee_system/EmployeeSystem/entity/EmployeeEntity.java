package com.employee_system.EmployeeSystem.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "employee_system", name = "employees")

public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
