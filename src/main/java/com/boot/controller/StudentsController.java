package com.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Students;
import com.example.repository.StudentsRepo;

@RestController
public class StudentsController {
@Autowired
StudentsRepo sr;

@PostMapping("/savestudent")
public String saveStudent(@RequestBody Students s) {
	sr.save(s);
	return "Student Saved Successfully";
}

@GetMapping("/getstudent")
public Students getStudent(@RequestParam int id) {
	Optional<Students> so = sr.findById(id);
	return so.get();
}

@GetMapping("/getallstudents")
public List<Students> getAllStudent(){
	return sr.findAll();
}

@DeleteMapping("/deletestudent")
public String deleteStudent(@RequestParam int id) {
	sr.deleteById(id);
	return "Student Deleted Successfully";
}

@PutMapping("/updatestudent")
public String updateStudent(@RequestBody Students st) {
	sr.save(st);
	return "Student Updated Successfully";
}
}
