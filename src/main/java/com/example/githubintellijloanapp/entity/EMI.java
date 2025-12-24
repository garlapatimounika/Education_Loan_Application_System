package com.example.githubintellijloanapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EMI {
    @Id

    @Column(name="emi_id")
    private  String emi_id;
    @Column(name="emi_amount")
    private BigDecimal emi_amount;

    @Column(name="due_date")
    private LocalDate due_date;

    @Column(name="emi_status")
    private String emi_status;

    @Column(name="paid_date")
    private LocalDate paid_date;

    @ManyToOne
    @JoinColumn(name="loan_id")
    private Loan loan;
}
