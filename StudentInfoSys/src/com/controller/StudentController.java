package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.exception.StudentNotFoundException;
import com.model.Student;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
	StudentService studentService = new StudentService();
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("===Welcome to Student Menu===" );
		System.out.println("press--1 to display student info");
		System.out.println("press 0 to exit");
		int input = sc.nextInt();
		if(input==0) { 
			System.out.println("Exiting");
			break;
			}
		switch(input) {
		case 1:
			System.out.println("Enter Student Id to view datails");
			int id = sc.nextInt();
			try {
				Student student = studentService.fetchDetails(id);
				System.out.println(student);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (StudentNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}
		
		}
			
		
	}
	}