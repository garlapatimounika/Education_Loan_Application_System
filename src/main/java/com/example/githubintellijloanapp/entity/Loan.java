
package com.example.githubintellijloanapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan{
    @Id
    @Column(name="loan_id")
    private String loan_id;

    @Column(name="interest_rate")
    private BigDecimal interest_rate;

    @Column(name="tenure")
    private int tenure;

    @Column(name="approved_date")
    private LocalDate approved_date;

    @Column(name="loan_status")
    private String loan_status;

    @ManyToOne
    @JoinColumn(name="application_id")
    private  LoanApplication loanApplication;

}

