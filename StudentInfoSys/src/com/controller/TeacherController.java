package com.controller;
import com.model.Teacher;
import com.model.Course;
import com.service.CourseService;
import com.service.TeacherService;
import com.exception.TeacherNotFoundException;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TeacherController {

	public static void main(String[] args) {
			TeacherService teacherService = new TeacherService();
			CourseService courseService = new CourseService();
			Course course = new Course();
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("----------Teacher Ops-------------");
				System.out.println("Press 1. Display teacher info ");
				System.out.println("Press 2. Show Assigned Courses");
				System.out.println("Press 0. to Exit");
				int input = sc.nextInt();
				if(input == 0) {
					System.out.println("Exiting Teacher Module..");
					break; 
				}
				
				switch(input) {
				case 1: 
					System.out.println("Enter your ID");
					int id = sc.nextInt();
					try {
						Teacher teacher = teacherService.DisplayTeacherInfo(id);
						System.out.println(teacher);
						}
					catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					catch(TeacherNotFoundException e) {
						System.out.println(e.getMessage());
					}
					break; 
					
				case 2:
					System.out.println("Enter your id");
					int tid = sc.nextInt();
					try {
					List<Course>list = courseService.findAll(tid);
					for(Course c : list) {
					System.out.println(c);
					}
					}
					catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					catch(TeacherNotFoundException e) {
						System.out.println(e.getMessage());
					}
					break; 

	}

}
			sc.close();
			
			}
			}
