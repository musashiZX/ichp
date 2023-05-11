package com.example.ICHP.ichpDemo.repository;

import com.example.ICHP.ichpDemo.entity.StudentData;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface StudentDataRepository extends JpaRepository<StudentData, Integer> {
    StudentData findStudentDataById(Integer Id);
    void deleteStudentDataById(Integer Id);
}
