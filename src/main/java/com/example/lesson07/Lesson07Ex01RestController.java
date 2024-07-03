package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07/ex01")
@RestController
public class Lesson07Ex01RestController {
	
	@Autowired
	private StudentBO studentBO;
	
	// C: create
	@GetMapping("/create")
	public StudentEntity create() {
		String name = "동그리";
		String phoneNumber = "010-2222-0000";
		String email = "jibga@aver.com";
		String dreamJob = "홈프로텍터";
		
		return studentBO.addStudent(name, phoneNumber, email, dreamJob);
	}
	
	// U: Update
	@GetMapping("/update")
	public StudentEntity update() {
		// id가 5번인 dreamJob 변경(홈프로텍터)
		return	studentBO.updateStudentDreamJobById(5, "기획자");
	}
	
	// D: Delete
	@GetMapping("/delete")
	public String delete() {
		// id가 4번인 데이터 삭제
		studentBO.deleteStudentById(4);
		
		return "삭제 성공";
	}
}
