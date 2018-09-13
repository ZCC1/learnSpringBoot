package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	public User getUserById(int userId);
	
	boolean addUser(User user);
	
}
