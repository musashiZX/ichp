package com.example.ICHP.ichpDemo.service;

import com.example.ICHP.ichpDemo.entity.StudentData;

public interface StudentServiceInterface {
    void deleteStudent(Integer studentId);
    void insertStudent(StudentData studentData);
    void updateStudent(StudentData studentData);
    StudentData findStudentById(Integer studentId);
}
