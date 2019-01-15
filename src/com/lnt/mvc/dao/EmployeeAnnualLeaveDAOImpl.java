package com.lnt.mvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.model.EmployeeAnnualLeave;


public class EmployeeAnnualLeaveDAOImpl implements EmployeeAnnualLeaveDAO {
	 private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	
	@Override
	@Transactional
	public void createEmployeeAnnualLeaveDAO(EmployeeAnnualLeave empleave) {
		sessionFactory.getCurrentSession().save(empleave);		
		
	}

	@Override
	public void updateEmployeeAnnualLeaveDAO(EmployeeAnnualLeave empleave) {
		sessionFactory.getCurrentSession().update(empleave);			
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeAnnualLeave> getAllEmployeeAnnualLeave() {
		Query allEmployeeAnnualLeave = sessionFactory.getCurrentSession().createQuery("from EmployeeAnnualLeave");
		return (List<EmployeeAnnualLeave>) allEmployeeAnnualLeave.list();
	}

}
