package com.result.view.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.result.view.entity.Mark;
import com.result.view.entity.Student;

@Repository
public interface MarkRepo extends JpaRepository<Mark, Long>
{

    List<Mark> findByStudent(Student student);

}
