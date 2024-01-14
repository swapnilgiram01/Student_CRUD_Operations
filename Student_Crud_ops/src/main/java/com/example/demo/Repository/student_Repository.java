package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Student;

import jakarta.transaction.Transactional;
@Transactional
@Repository
public interface student_Repository extends JpaRepository<Student, Integer> {

	@Modifying
	@Query("update Student set course_name=:course_nm where student_id=:studentid")
	public int update_student_info(int studentid,String course_nm);
	
	@Modifying
	@Query("DELETE FROM Student s WHERE s.student_id = :studentId")
	void delete_Student_info( int studentId);

	

	
}
