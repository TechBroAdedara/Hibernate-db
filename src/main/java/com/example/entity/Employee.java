package com.example.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "hire_date", nullable = false)
    private Date hireDate;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private EmploymentStatus status;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "job_title", length = 100)
    private String jobTitle;

    @Lob
    @Column(name = "profile_picture")
    private byte[] profilePicture;

    // Getters and Setters
}
