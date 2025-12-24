package com.example.githubintellijloanapp.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name="loan_application")
public class LoanApplication {
    @Id
    @Column(name="application_id")
    private String application_id;

    @Column(name="loan_amount")
    private BigDecimal loan_amount;

    @Column(name="institute_name")
    private String institute_name;

    @Column(name ="course_duration")
    private String course_duration;

    @Column(name="application_date")
    private LocalDateTime application_date;

    @Column(name="eligibility_status")
    private  String eligibility_status;

    @Column(name="application_status")
    private String application_status;

    @ManyToOne
    @JoinColumn(name="student_Id")
    private Student student;
}
