package com.example.demo.dao;

import com.example.demo.entity.User;

public interface UserDao {
	int deleteByPK(Integer id);
	
	int insert(User user);
	
	int insertSelective(User user);
	
	User selectByPK(Integer id);
	
	int updateByPKSelective(User user);
	
	int updateByPK(User user);
}
