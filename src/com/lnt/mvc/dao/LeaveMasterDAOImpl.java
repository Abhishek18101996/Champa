package com.lnt.mvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.model.Job;
import com.lnt.mvc.model.LeaveMaster;

public class LeaveMasterDAOImpl implements LeaveMasterDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void createLeaveMaster(LeaveMaster leavemaster) {
		sessionFactory.getCurrentSession().save(leavemaster);
	}

	@Override
	public void updateLeaveMaster(LeaveMaster leavemaster) {
		sessionFactory.getCurrentSession().update(leavemaster);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LeaveMaster> getAllLeaveMaster() {
		Query allLeaveMaster = sessionFactory.getCurrentSession().createQuery("from LeaveMaster");
		return (List<LeaveMaster>) allLeaveMaster.list();
	}

	@Override
	@Transactional
	public LeaveMaster getbyId(int master_id) {
		System.out.println("Inside getlnm 1");
		System.out.println(this.sessionFactory);
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Inside getlm 2");
		LeaveMaster p = (LeaveMaster) session.load(LeaveMaster.class, master_id);
		System.out.println("Inside getlm 3");
		System.out.println(p);
		return p;		
	}
}
