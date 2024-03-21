package com.project.PersoFin.services;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.project.PersoFin.daos.UserDao;
import com.project.PersoFin.models.user;

@Service
public class UserService {

	private final UserDao userDao;
	

	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public List<user> getallUsers(){
		return userDao.findAll();
	}
	
	public user registerUser(user User) {
		return userDao.save(User);
	}
	
	public Optional<user> FindUser(int id) {
		return userDao.findById((long) id);
	}
	
	
	
}
