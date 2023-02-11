package com.example.SB2345.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SB2345.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	
	List<Student>findAll();

}
