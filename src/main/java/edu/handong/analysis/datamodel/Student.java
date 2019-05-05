package edu.handong.analysis.datamodel;

public class Student{
	private String name;
	
	
	public Student() {
		name = null;
	}
	
	public Student(String name) {
		this.name = new String(name.split(",")[1].trim());
	}
	
	public String getName() {
		return name;
	}
}