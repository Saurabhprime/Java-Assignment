package com.service;
import com.dao.TeacherDao;
import com.dao.TeacherDaoImpl;
import com.exception.TeacherNotFoundException;

import java.sql.SQLException;
import java.util.List;
import com.model.Teacher;




public class TeacherService {

TeacherDao dao = new TeacherDaoImpl();
public  Teacher DisplayTeacherInfo(int id) throws SQLException, TeacherNotFoundException{
		Teacher teacher = dao.DisplayTeacherInfo(id);
				if(teacher == null) {
					throw new TeacherNotFoundException("Teacher Not Found");
				}
		return teacher;
	}
	

	
			
	
}



