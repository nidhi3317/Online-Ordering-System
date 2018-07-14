package com.app.controllers;


import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.UserServiceIntf;

import pojos.User;

@Controller //m
@RequestMapping("/user") //optional
public class UserController {
	//D.I
	@Autowired
	private UserServiceIntf service;
	
	//request handling method to show login form
	@GetMapping("/login")
	public String showLoginForm(Model map)
	{
		System.out.println("in show login form "+map);
		map.addAttribute("my_user", new User());
		return "/user/login";
	}
	//request handling method to process login form
	@PostMapping("/login")
	public String processLoginForm(@ModelAttribute(name="my_user") User u,Model map)
	{
		System.out.println("in process login form ");
		//invoke service layer method for user validation
		try {
		 User validUser=service.validateUser(u.getEmail(),u.getPass());
		 //valid login
		 return "redirect:/vendor/list";
		} catch (NoResultException e) {
			//invalid login
			map.addAttribute("message", "Invalid Login , Pls retry...");
			return "/user/login";
		}
		
	}
	

}
