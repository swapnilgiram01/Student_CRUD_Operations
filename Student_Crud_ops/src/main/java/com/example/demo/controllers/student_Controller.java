package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.student_Service;
import com.example.demo.entities.Student;

@RestController
public class student_Controller {
	@Autowired
	student_Service sserv;
	
	@GetMapping("/allstudent")
	public List<Student> getall(){
		return sserv.getall();
	}
	
	@PostMapping("/saveinfo")
	public Student SaveInfo(@RequestBody Student st) {
		return sserv.SaveInfo(st);
	}
	
	@PutMapping("/updateinfo")
	public int updateinfo(@RequestParam ("studentid") int student_id, @RequestParam ("coursenm") String course_name)
	{
		return sserv.update_student_info(student_id, course_name);
		
	}
	
	@DeleteMapping("/deleteinfo")
	public void deleteInfo(@RequestParam("studentid") int student_id) {
		sserv.deleteById(student_id);
	}
	
}
