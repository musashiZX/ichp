package com.example.ICHP.ichpDemo.service;

import com.example.ICHP.ichpDemo.entity.StudentData;
import com.example.ICHP.ichpDemo.repository.StudentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceInterface{
    @Autowired
    private StudentDataRepository studentDataRepository;
    @Override
    public void deleteStudent(Integer studentId) {
        this.studentDataRepository.deleteStudentDataById(studentId);
    }

    @Override
    public void insertStudent(StudentData studentData) {

    }

    @Override
    public void updateStudent(StudentData studentData) {

    }

    @Override
    public StudentData findStudentById(Integer studentId) {
        return this.studentDataRepository.findStudentDataById(studentId);
    }
}
