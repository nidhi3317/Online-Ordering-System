package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDaoIntf;

import pojos.User;

@Service
@Transactional
public class UserService implements UserServiceIntf {

	@Autowired
	private UserDaoIntf dao;
	@Override
	@Transactional(readOnly=true)
	public User validateUser(String em, String pass) {
		
		return dao.validateUser(em, pass);
	}
	@Override
	public int addUser(User u) {
		// TODO Auto-generated method stub
		return dao.addUser(u);
	}

}
