package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.exception.StudentNotFoundException;
import com.model.Student;
import com.utility.DBConnect;

public class StudentDaoImpl implements StudentDao{

	@Override
	public Student displayStudentInfo(int sId) throws SQLException, StudentNotFoundException {
		Connection con = DBConnect.dbConnect();
		String sql = ("select * from students where student_id = ?");
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,sId);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
		Student student = new Student();
		int id = rs.getInt("student_id");
		String fname = rs.getString("first_name");
		String lname = rs.getString("last_name");
		String dob = rs.getString("date_of_birth");
		String email = rs.getString("email");
		int num = rs.getInt("phone_number");
		student = new Student(id,fname,lname,dob,email,num);
		return student;
	}
		else{
			DBConnect.dbClose();
			return null;
			}
		}

	@Override
	public Student updateStudentInfo(int sid, Student student) throws SQLException, StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
