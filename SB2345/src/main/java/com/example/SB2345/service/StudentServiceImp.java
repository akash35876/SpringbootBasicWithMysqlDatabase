package com.example.SB2345.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SB2345.model.Student;
import com.example.SB2345.repositry.StudentDao;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	
	StudentDao dao;

	@Override
	public List<Student> getDeatils() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
