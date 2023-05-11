package com.example.ICHP.ichpDemo.controller;

import com.example.ICHP.ichpDemo.constant.ApplicationConstant;
import com.example.ICHP.ichpDemo.entity.StudentBankAccount;
import com.example.ICHP.ichpDemo.entity.StudentData;
import com.example.ICHP.ichpDemo.service.BankAccountService;
import com.example.ICHP.ichpDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = ApplicationConstant.REQUEST_MAPPING)
public class Controller {
    @Autowired
    private BankAccountService bankAccountService;
    @Autowired
    private StudentService studentService;
    @GetMapping(value = ApplicationConstant.GET_STUDENT)
    public StudentData getStudentData(@RequestBody Integer studentId){
        return this.studentService.findStudentById(studentId);
    }
    @GetMapping(value = ApplicationConstant.GET_STUDENT_BANK_ACCOUNT)
    public StudentBankAccount getStudentBankAccount(@RequestBody String bankAccount){
        return this.bankAccountService.findBankAccountById(bankAccount);
    }
    @GetMapping(value = ApplicationConstant.HEALTH_CHECK)
    public String getHealthCheck(){
        return "health";
    }
    @DeleteMapping(value = ApplicationConstant.DELETE_STUDENT)
    public void deleteStudentData(@RequestBody Integer studentId){
        this.studentService.deleteStudent(studentId);
    }
    @DeleteMapping(value = ApplicationConstant.DELETE_STUDENT_BANK_ACCOUNT)
    public void deleteStudentBankAccount(@RequestBody String bankAccount){
        this.bankAccountService.deleteBankAccount(bankAccount);
    }

}
