package com.example.ICHP.ichpDemo.service;

import com.example.ICHP.ichpDemo.entity.StudentBankAccount;
import com.example.ICHP.ichpDemo.repository.StudentBankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService implements BankAccountServiceInterface{
    @Autowired
    private StudentBankAccountRepository studentBankAccountRepository;
    @Override
    public void deleteBankAccount(String bankAccount) {
        this.studentBankAccountRepository.deleteStudentBankAccountByBankAccount(bankAccount);
    }

    @Override
    public void insertBankAccount(StudentBankAccount studentBankAccount) {

    }

    @Override
    public void updateBankAccount(StudentBankAccount studentBankAccount) {

    }

    @Override
    public StudentBankAccount findBankAccountById(String bankAccount) {
        return this.findBankAccountById(bankAccount);
    }
}
