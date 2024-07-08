package com.example.lesson07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson07.entity.StudentEntity;
import com.example.lesson07.repository.StudentRepository;

@RequestMapping("/lesson07/ex02")
@RestController
public class Lesson07Ex02RestController {

	
	// !!!!!!!!!!!!! 이번에만 BO 생략
	@Autowired
	private StudentRepository studentRepository;
	
	// 조회하는 다양한 방법
	@GetMapping("/select1")
	public List<StudentEntity> select1() {
		// 1) 전체 조회(기본으로 제공됨)
//		return studentRepository.findAll();
		
		// 2) id 기준 내림차순 전체 조회
//		return studentRepository.findAllByOrderByIdDesc();
		
		// 3) id 기준 내림차순 3개만 조회
//		return studentRepository.findTop3ByOrderByIdDesc();
		
		// 4) 이름이 동그리인 데이터 조회
//		return studentRepository.findByName("동그리");
		
		// 5) in문으로 일치하는 값 모두 조회
//		return studentRepository.findByNameIn(List.of("유재석", "조세호"));
		
		// 6) 여러 컬럼값과 일치하는 데이터 조회
//		return studentRepository.findByNameAndDreamJob("조세호", "변호사");
		
		// 7) email 컬럼에 kakao가 포함된 데이터 조회  like '%josep%'
//		return studentRepository.findByEmailContains("132");
		
		// 8) 동으로 시작하는 데이터 조회 like '동%'
//		return studentRepository.findByNameStartingWith("동");
		
		// 9) id가 2 ~ 5까지 조회  between
		return studentRepository.findByIdBetween(2, 5);
		
	}
	
	@GetMapping("/select2")
	public List<StudentEntity> select2() {
		// 장래희망이 변호사인 데이터 조회
		return studentRepository.findByDreamJob("변호사");
	}
}
