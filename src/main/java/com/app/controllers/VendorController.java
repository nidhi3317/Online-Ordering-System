package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.VendorServiceIntf;

@Controller
public class VendorController {
	@Autowired
	private VendorServiceIntf service;
	
	public VendorController() {
		System.out.println("in vendor controller");
	}
	@RequestMapping("/vendor/list")
	public String listVendors(Model map)
	{
		System.out.println("in list vendors");
		map.addAttribute("vendor_list",service.listVendors());
		return "list123";
	}

}
