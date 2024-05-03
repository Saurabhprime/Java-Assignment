package com.service;

import java.sql.SQLException;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exception.StudentNotFoundException;
import com.model.Student;

public class StudentService {
	StudentDao studentDao = new StudentDaoImpl();
	public Student fetchDetails(int id) throws SQLException, StudentNotFoundException {
		Student student = studentDao.displayStudentInfo(id); 
		if(student == null) {
			throw new StudentNotFoundException("Record not found");
		}
	
		return student;
	}

}
