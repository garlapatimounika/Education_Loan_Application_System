package com.example.githubintellijloanapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @Column(name="payment_id",nullable=false)
    private String payment_id;

    @Column(name="amount_paid",nullable = false)
    private BigDecimal amount_paid;

    @Column(name="payment_date",nullable=false)
    private LocalDateTime payment_date;

    @Column(name="payment_mode")
    private String payment_mode;

    @Column(name="payment_status")
    private String payment_status;

    @Column(name="transaction_reference", unique = true)
    private String transaction_reference;

    @ManyToOne
    @JoinColumn(name="emi_id")
    private EMI emi;

}
