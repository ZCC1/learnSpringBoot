package com.example.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPK(userId);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		boolean result = false;
		try {
			userDao.insertSelective(user);
			result = true;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

}
