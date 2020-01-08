package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;

@Controller
public class FreeMakerController {
	@Autowired
	UserService userService;

	@RequestMapping("/showUserInfo")
	public ModelAndView showUserInfo(Long id) {
		ModelAndView view = new ModelAndView("userInfo");
		User user = userService.getUser(id);
		view.addObject("user", user);
		//view.setViewName("userInfo");
		   
		return view;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	
	@GetMapping("/showUsers")
	public ModelAndView showUsers() {

		List<User> usrList = userService.GetAllUsers();

	    Map<String, Object> params = new HashMap<String, Object>();
	    params.put("users", usrList);

	    return new ModelAndView("showUsers", params);
	}
}
