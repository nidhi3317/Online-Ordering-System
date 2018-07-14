package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pojos.User;

@Repository
public class UserDao implements UserDaoIntf {
	@Autowired
	private SessionFactory sf;

	@Override
	public User validateUser(String em1, String pass1) {
		String jpql = "select u from User u where u.email = :em and u.pass = :pass";
		return sf.getCurrentSession().createQuery(jpql, User.class).setParameter("em", em1).setParameter("pass", pass1)
				.getSingleResult();
	}

}
