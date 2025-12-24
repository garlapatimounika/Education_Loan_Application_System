package com.example.githubintellijloanapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id
    @ManyToOne
    @JoinColumn(name="student_Id")
    private Student student;

    @Column(name="notification_id")
    private String notification_id;

    @Column(name="notification_type")
    private String notification_type;

    @Column(name=" notification_status")
    private String notification_status;

    @Column(name="notifi_createAt")
    private LocalDateTime notifi_createAt;

  @Column(name="message",nullable=false)
    private String message;

}
