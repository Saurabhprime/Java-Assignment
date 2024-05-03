package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.exception.TeacherNotFoundException;
import com.model.Course;
import com.model.Teacher;
import com.utility.DBConnect;

public class TeacherDaoImpl implements TeacherDao{

	@Override
	public Teacher DisplayTeacherInfo(int id) throws SQLException, TeacherNotFoundException {
		Connection con = DBConnect.dbConnect();
		String sql="select * from teacher where teacher_id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	        	Teacher teacher = new Teacher();
	            int tid = rs.getInt("teacher_id");
	            String fname = rs.getString("first_name");
	            String lname = rs.getString("last_name");
	            String mail = rs.getString("email");
	            teacher = new Teacher(tid, fname, lname, mail);
	            return teacher;
		}
	        else {
		DBConnect.dbClose();		
		return null;
	        }
	}

	@Override
	public List<Course> findAll(int tId) throws SQLException, TeacherNotFoundException {
		
		Connection con = DBConnect.dbConnect();
		String sql="select * from courses where teacher_id= ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, tId);
		ResultSet rst = pstmt.executeQuery();
		List<Course> list = new ArrayList<>();
		while(rst.next() == true) {
			int id  = rst.getInt("course_id");
			String name = rst.getString("course_name");
			int credit = rst.getInt("credits");
			int amount = rst.getInt("amount");
			int tid = rst.getInt("teacher_id");
			
			Course course = new Course(id,name,credit,amount,tid); //100X 200X 300X
			list.add(course);
		}
		DBConnect.dbClose();		
		return list;
	}
	}


