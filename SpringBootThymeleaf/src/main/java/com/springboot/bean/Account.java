package com.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhangquanwei
 */
@Data
@AllArgsConstructor
public class Account {
	private String account;
	private String name;
	private String password;
	private String accountType;
	private String tel;
	
}
