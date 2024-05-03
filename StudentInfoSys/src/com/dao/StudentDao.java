package com.dao;

import java.sql.SQLException;

import com.exception.StudentNotFoundException;
import com.model.Student;

public interface StudentDao {
Student displayStudentInfo(int sId) throws SQLException, StudentNotFoundException;
Student updateStudentInfo(int sid, Student student)throws SQLException, StudentNotFoundException;
}
