package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.app.dao.VendorDaoIntf;

import pojos.Vendor;

@Service
@Transactional
public class VendorService implements VendorServiceIntf {
     @Autowired
     private VendorDaoIntf dao;
	
	@Override
	public List<Vendor> listVendors() {
		// TODO Auto-generated method stub
		return dao.listVendors();
	}

}
