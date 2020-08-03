package com.springboot.mybatis.service;


import com.springboot.mybatis.bean.Student;

/**
 * @author zhangquanwei
 */
public interface StudentService {
	int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
