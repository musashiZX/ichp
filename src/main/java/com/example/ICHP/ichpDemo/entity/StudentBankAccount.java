package com.example.ICHP.ichpDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "StudentBankAccount")
public class StudentBankAccount {
    @Id
    @Column(name = "BankAccount", nullable = false)
    private String bankAccount;

    @Column(name = "StudentId", nullable = false)
    private Integer studentId;

    @Column(name = "Currency")
    private String currency;

    @Column(name = "Balance")
    private String balance;
}
