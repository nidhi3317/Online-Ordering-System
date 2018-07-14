package com.app.dao;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pojos.Vendor;

@Repository
public class VendorDao implements VendorDaoIntf {
	// auto wire dependency
	@Autowired
	private SessionFactory sf;

	public List<Vendor> listVendors() {
		return sf.getCurrentSession().
				createQuery("select v from Vendor v", 
						Vendor.class).getResultList();
	}

	/*
	 * public String deleteVendor(int id) { String mesg =
	 * "delete vendor failed..."; Session hs = getSf().getCurrentSession();
	 * Transaction tx = hs.beginTransaction(); try { Vendor v =
	 * hs.get(Vendor.class, id); if (v != null) { hs.delete(v); mesg =
	 * "vendor with id=" + id + " deleted successfully"; } tx.commit();
	 * 
	 * } catch (HibernateException e) { if (tx != null) tx.rollback(); throw e;
	 * } return mesg; }
	 * 
	 * public Vendor getVendorDetails(int id) { Vendor v = null; Session hs =
	 * getSf().getCurrentSession(); Transaction tx = hs.beginTransaction(); try
	 * { v = hs.get(Vendor.class, id); tx.commit(); } catch (HibernateException
	 * e) { if (tx != null) tx.rollback(); throw e; } return v; }
	 * 
	 * public String updateVendor(Vendor v) { String mesg =
	 * "vendor updation successful"; Session hs = getSf().getCurrentSession();
	 * Transaction tx = hs.beginTransaction(); try { hs.update(v);
	 * //re-attaching detached pojo tx.commit();
	 * 
	 * } catch (HibernateException e) { if (tx != null) tx.rollback(); throw e;
	 * } return mesg; }
	 * 
	 */}
