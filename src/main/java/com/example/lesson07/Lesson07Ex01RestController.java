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
	private StudentBO studentBo;
	// C: create
	@GetMapping("/create")
	public StudentEntity create() {
		String name = "동그리";
		String phoneNumber = "010-2222-0000";
		String email = "jibga@aver.com";
		String dreamJob = "홈프로텍터";
		
		return studentBo.addStudent(name, phoneNumber, email, dreamJob);
	}
}
