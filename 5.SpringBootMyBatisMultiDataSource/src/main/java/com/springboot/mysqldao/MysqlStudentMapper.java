package com.springboot.mysqldao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangquanwei
 */
@Mapper
public interface MysqlStudentMapper {
	List<Map<String, Object>> getAllStudents();
}
