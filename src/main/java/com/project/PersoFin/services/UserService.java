package com.project.PersoFin.services;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import com.project.PersoFin.daos.userDao;
import org.springframework.stereotype.Service;


import com.project.PersoFin.models.user;

@Service
public class UserService {

	@Autowired
	public static userDao UserDao;
	
	public static List<user> getallUsers(){
		return UserDao.findAll();
	}
	
	public user registerUser(user User) {
		return UserDao.save(User);
	}
	
	public Optional<user> FindUser(int id) {
		return UserDao.findById((long) id);
	}
	
	
	
}
