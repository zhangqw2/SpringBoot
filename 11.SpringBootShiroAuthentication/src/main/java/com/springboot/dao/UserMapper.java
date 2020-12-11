package com.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.pojo.User;

/**
 * 接口
 * @author 张全伟
 */
@Mapper
public interface UserMapper {
	/**
	 * 查询
	 * @param userName
	 * @return
	 */
	User findByUserName(String userName);
}
