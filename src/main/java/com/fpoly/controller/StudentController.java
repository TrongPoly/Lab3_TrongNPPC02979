package com.fpoly.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fpoly.model.Student;

@Controller
public class StudentController {
	@GetMapping("/student/form")
	public String index(@ModelAttribute("student") Student student) {
		return "student/form";
	}

	@PostMapping("/student/save")
	public String save(@ModelAttribute("student") Student student, Model model) {

		if (student.getGender()) {
			model.addAttribute("gender", "Male");
		} else
			model.addAttribute("gender", "Female");

		String hb = " ";
		hb.concat("haha");
		if (student.getHobbies().contains("T")) {
			hb = hb.concat("Travelling, ");

		}
		if (student.getHobbies().contains("M")) {
			hb = hb.concat("Music, ");
		}
		if (student.getHobbies().contains("F")) {
			hb = hb.concat("Food, ");
		}
		if (student.getHobbies().contains("O")) {
			hb = hb.concat("Other, ");
		}

		System.out.println("Hobbies1: " + student.getHobbies());
		System.out.println(hb);
		model.addAttribute("hb", hb);
		model.addAttribute("std", student);
		return "student/result";
	}

	@ModelAttribute("faculties")
	public List<String> getFaculties() {
		return Arrays.asList("CNTT", "DLNHKS", "QTDN");
	}

	@ModelAttribute("hobbies")
	public Map<String, String> getHobbies() {
		Map<String, String> map = new HashMap<>();
		map.put("T", "Travelling");
		map.put("M", "Music");
		map.put("F", "Food");
		map.put("O", "Other");
		return map;
	}

	@ModelAttribute("genders")
	public Map<Boolean, String> getGenders() {
		Map<Boolean, String> map = new HashMap<>();
		map.put(true, "Male");
		map.put(false, "Female");
		return map;
	}
}
