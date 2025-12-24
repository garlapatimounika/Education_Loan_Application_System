package com.example.githubintellijloanapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="document")
public class Document {
    @Id
    @Column(name="document_id")
    private String document_id;

    @Column(name="document_name",nullable=false)
    private String document_name;

    @Column(name="document_type")
    private String document_type;

    @Column(name="document_url")
    private  String document_url;
    @Column(name="uploaded_date")
    private LocalDateTime uploaded_date;

    @Column(name="verification_status")
    private String verification_status;

    @ManyToOne
    @JoinColumn(name="application_id")
    private LoanApplication loanApplication;


}
