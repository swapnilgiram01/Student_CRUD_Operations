package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.student_Repository;
import com.example.demo.entities.Student;

@Service
public class student_Service {

	@Autowired
	student_Repository srepo;
	
	public List<Student> getall(){
		return srepo.findAll();
	}
	
	public Student SaveInfo(Student st) {
		return srepo.save(st);
	}
	
	public int update_student_info(int student_id,String course_name) {
		return srepo.update_student_info(student_id, course_name);
	}
	
	public void deleteById(int student_id) {
		srepo.deleteById(student_id);
	}
}
