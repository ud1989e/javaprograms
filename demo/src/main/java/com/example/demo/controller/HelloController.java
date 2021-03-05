package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepository;
import com.example.demo.modal.Student;

@RestController
public class HelloController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String index() {

		return "Greetings from Spring Boot!";
	}

	@GetMapping(path = "/list")
	public @ResponseBody List<Student> returnAll() {
		Iterable<Student> student = userRepository.findAll();
		List<Student> stud = new ArrayList<Student>();
		student.forEach(st -> stud.add(st));
		return stud;

	}

	@PostMapping(path = "/add")  // Map ONLY POST Requests
	public @ResponseBody String savaStudent(@RequestParam String name, @RequestParam String address,
			@RequestParam String grade) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		Student n = new Student();
		n.setName(name);
		n.setAddress(address);
		n.setGrade(grade);
		userRepository.save(n);
		return "Saved";

	}
}
