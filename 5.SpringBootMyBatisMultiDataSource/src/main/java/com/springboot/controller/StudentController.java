package com.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.StudentService;

/**
 * @author zhangquanwei
 */
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("queryStudentsFromOracle")
	public List<Map<String, Object>> queryStudentsFromOracle(){
		return this.studentService.getAllStudentsFromOralce();
	}
	
	@RequestMapping("queryStudentsFromMysql")
	public List<Map<String, Object>> queryStudentsFromMysql(){
		return this.studentService.getAllStudentsFromMysql();
	}
}
