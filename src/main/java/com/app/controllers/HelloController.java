package com.app.controllers;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // mandatory
public class HelloController {
	@RequestMapping("/") // mandatory
	 public String sayHello2() {
		System.out.println("in say hello");
		return "login";
	}
	public HelloController() {
		System.out.println("in hello controller");
	}

	// request handling method
	@RequestMapping("/hello") // mandatory
	public String sayHello() {
		System.out.println("in say hello");
		return "welcome";
	}

	@RequestMapping("/hello1") // mandatory
	public ModelAndView sayHello1() {
		System.out.println("in say hello1");
		//o.s.w.s.ModelAndView(String viewName,String modelattrName,
		//Object attrVal)
		return new ModelAndView("welcome",
				"server_date", new Date());
	}
	// o.s.ui.Model --i/f --holder of model attrs --map 
		@RequestMapping("/hello2") // mandatory
		public String sayHello2(Model map) {
			System.out.println("in say hello2 "+map);
			map.addAttribute("num_list", Arrays.asList(1,2,3,4,5));
			map.addAttribute("server_date", new Date());
			System.out.println(map);
			return "Signin";
		}

}
