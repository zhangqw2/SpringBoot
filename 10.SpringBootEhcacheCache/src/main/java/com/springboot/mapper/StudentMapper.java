package com.springboot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.springboot.bean.Student;

/**
 * 接口Mapper
 * @author 张全伟
 */
@Mapper
public interface StudentMapper {

	/**
	 * 更新
	 * @param student
	 * @return
	 */
	@Update("update student set sname=#{name},ssex=#{sex} where sno=#{sno}")
	int update(Student student);

	/**
	 * 删除
	 * @param sno
	 */
	@Delete("delete from student where sno=#{sno}")
	void deleteStudentBySno(String sno);

	/**
	 * 查询
	 * @param sno
	 * @return
	 */
	@Select("select * from student where sno=#{sno}")
	@Results(id = "student", value = { @Result(property = "sno", column = "sno", javaType = String.class),
			@Result(property = "name", column = "sname", javaType = String.class),
			@Result(property = "sex", column = "ssex", javaType = String.class) })
	Student queryStudentBySno(String sno);
}
