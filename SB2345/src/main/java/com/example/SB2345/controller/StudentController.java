package com.example.SB2345.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SB2345.model.Student;
import com.example.SB2345.service.StudentServiceImp;

@RestController
@RequestMapping("/kl")
public class StudentController {
	
	@Autowired
	
	StudentServiceImp imp;
	
	@GetMapping("/tn")
	public List<Student> getEmployee(){
		
		return imp.getDeatils();
	}

}
