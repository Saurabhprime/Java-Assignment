package com.service;
import com.dao.TeacherDao;
import com.dao.TeacherDaoImpl;
import com.model.Course;
import com.exception.TeacherNotFoundException;
import java.sql.SQLException;
import java.util.List;
public class CourseService {

TeacherDao dao = new TeacherDaoImpl();

	public List<Course> findAll(int tid) throws SQLException, TeacherNotFoundException{
		
		 return dao.findAll(tid);
	}

}
