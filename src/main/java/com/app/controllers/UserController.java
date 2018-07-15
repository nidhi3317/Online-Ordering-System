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
 //optional
public class UserController {
	//D.I
	@Autowired
	private UserServiceIntf service;
	
	//request handling method to show login form
	@GetMapping("/")
	public String showLoginForm(Model map)
	{
		System.out.println("in show login form "+map);
		map.addAttribute("my_user", new User());
		return "Login";
	}
	//request handling method to process login form
	@PostMapping("/")
	public String processLoginForm(@ModelAttribute(name="my_user") User u,Model map)
	{
		System.out.println("in process login form ");
		//invoke service layer method for user validation
		try {
		 User validUser=service.validateUser(u.getEmail(),u.getPass());
		 //valid login
		 return "redirect:/vendor/list"; //home welcome page 
		} catch (NoResultException e) {
			//invalid login
			map.addAttribute("message", "Invalid Login , Pls retry...");
			return "Login";
		}
				
	}
	
	@GetMapping("/signup") //for mapping the pages 
	public String showSignForm(Model map) {

		System.out.println("in show signup form "+map);
		map.addAttribute("my_user", new User());
		return "Signin";
		
	}
	
	@PostMapping("/signup")
	public String processSignupForm(@ModelAttribute(name="my_user") User u,Model map)
	{
		System.out.println("in process login form ");
		//invoke service layer method for user validation
		try {
		int id=service.addUser(u);
		 //valid login
		 return "Login"; //home welcome page 
		} catch (NoResultException e) {
			//invalid login
			map.addAttribute("message", "Invalid Login , Pls retry...");
			return "Login";
		}
	}
	

}
