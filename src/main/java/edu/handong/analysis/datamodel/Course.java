package edu.handong.analysis.datamodel;

public class Course{
	private String courseName;
	
	public Course(String name) {
		courseName = new String(name.split(",")[2].trim());
	}
	
	public String getCourseName() {
		return courseName;
	}
}