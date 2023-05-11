package com.example.ICHP.ichpDemo.service;

import com.example.ICHP.ichpDemo.entity.StudentBankAccount;
import com.example.ICHP.ichpDemo.entity.StudentData;

public interface BankAccountServiceInterface {
    void deleteBankAccount(String bankAccount);
    void insertBankAccount(StudentBankAccount studentBankAccount);
    void updateBankAccount(StudentBankAccount studentBankAccount);
    StudentBankAccount findBankAccountById(String bankAccount);
}
