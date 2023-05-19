package com.fpoly.model;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Student {

	@NotEmpty
	@Size(min = 20, message = "{Size.Student.Name}")
	String name;
	String email;
	Double marks;
	Boolean gender;

	String faculty;
	List<String> hobbies;

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

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Student(String name, String email, Double marks, Boolean gender, String faculty, List<String> hobbies) {
		super();
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.gender = gender;
		this.faculty = faculty;
		this.hobbies = hobbies;
	}

	public Student() {
		super();
	}

}
