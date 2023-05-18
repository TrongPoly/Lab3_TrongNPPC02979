package com.fpoly.model;

public class Student {
	String name;
	String email;
	Double marks;
	Boolean gender;
	String faculty;
//hello
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Student(String name, String email, Double marks, Boolean gender, String faculty) {
		super();
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.gender = gender;
		this.faculty = faculty;
	}

	public Student() {
		super();
	}

}
