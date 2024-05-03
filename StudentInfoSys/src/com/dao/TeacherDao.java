package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.TeacherNotFoundException;
import com.model.Teacher;
import com.model.Course;


public interface TeacherDao {
	Teacher DisplayTeacherInfo(int id) throws SQLException,TeacherNotFoundException;
	List<Course> findAll(int tId) throws SQLException, TeacherNotFoundException;
}
