package com.result.view.repository;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.result.view.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {


    //important
    Optional<Student> findByRollNumber(String rollNumber);

    Optional<Student> findByRollNumberAndDateOfBirth(String rollNumber, LocalDate dateOfBirth);
}