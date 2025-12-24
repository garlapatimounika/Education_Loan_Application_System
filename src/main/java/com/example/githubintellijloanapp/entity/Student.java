package com.example.githubintellijloanapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @Column(name="student_Id")
    private String student_Id;

    @Column(name="email", nullable=false,unique=true)
    private String email;

    @Column(name="mobile",nullable=false,unique=true)
    private String mobile;

    @Column(name="password", nullable=false)
    private String password;

    @Column(name="address")
    private String address;
    @Column(name="created_at")
    private LocalDateTime create_at;

}
