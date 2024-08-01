package com.giri.sbapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
 
import com.giri.sbapp.model.User;
 
@Service
public interface UserService {
 
	public void addUser(User user);
	public User getUserByEmail(String email);
	public List<User> getAllUsers();

}