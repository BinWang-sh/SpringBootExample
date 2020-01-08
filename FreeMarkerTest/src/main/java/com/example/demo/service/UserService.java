package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.User;



@Service
public class UserService {

	public void initUser() {
		
	}
	
	
	public User getUser(long id) {
		
		User u = new User("User_" + id, "Shanghai", 30, true);
		u.setUsrid(id+"");
		return u;
	}
	
	public List<User> GetAllUsers() {
		
		List<User> l = new ArrayList();
		for (int i=0;i<5;i++) {
			User u = getUser(i);
			
			l.add(u);
		}
		
		return l;
	}
	
	public User getSpecUser(long type, long id) {
		
		User u = new User("SpecUser_"+type+"_"+id, "Minhang area, Shanghai", 22, false);
		
		return u;
		
	}
}