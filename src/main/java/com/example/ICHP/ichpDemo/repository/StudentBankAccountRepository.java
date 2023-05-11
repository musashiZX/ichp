package com.example.ICHP.ichpDemo.repository;

import com.example.ICHP.ichpDemo.entity.StudentBankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StudentBankAccountRepository extends JpaRepository<StudentBankAccount, String> {
    StudentBankAccount findStudentBankAccountByBankAccount(String bankAccount);
    void deleteStudentBankAccountByBankAccount(String bankAccount);
}
