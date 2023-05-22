package com.fpoly.model;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Student {

	// @NotBlank(message = "{Blank.Name}")
	String fullname;

	@NotBlank(message = "{Blank.Email}")
	@Email(message = "{Format.Email}")
	String email;

	@Min(value = 0, message = "{Min.Marks}")
	@Max(value = 10, message = "{Max.Marks}")
	@NotNull(message = "{Null.Marks}")
	Double marks;

	@NotNull(message = "{Null.Gender}")
	Boolean gender;

	String faculty;
	@NotEmpty(message = "{Empty.Hobbies}")
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
