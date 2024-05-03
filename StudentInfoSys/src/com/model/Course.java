package com.model;

public class Course {
	private int courseId;
	private String courseName; 
	private int credits; 
	private int amount;
	private int teacherId;
	public Course(int courseId, String courseName, int credits, int amount, int teacherId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.credits = credits;
		this.amount = amount;
		this.teacherId = teacherId;
	}
	public Course() {
		super();
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", credits=" + credits + ", amount="
				+ amount + ", teacherId=" + teacherId + "]";
	}
	

}
