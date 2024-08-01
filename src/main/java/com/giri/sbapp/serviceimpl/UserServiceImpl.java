package com.giri.sbapp.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.giri.sbapp.model.User;
import com.giri.sbapp.repository.UserRepo;
import com.giri.sbapp.service.UserService;
 
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
 
	public void addUser(User user) {
		repo.save(user);
	}
 
	public User getUserByEmail(String email) {
		return repo.findByEmail(email);
	}
 
	public List<User> getAllUsers() {
		return repo.findAll();
	}

}
