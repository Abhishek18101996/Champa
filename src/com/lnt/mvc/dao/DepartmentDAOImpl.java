package com.lnt.mvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.model.Department;

public class DepartmentDAOImpl implements DepartmentDAO {
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	@Transactional
	public void createDepartment(Department department) {
		this.sessionFactory.getCurrentSession().save(department);

	}

	@Override
	@Transactional
	public void updateDepartment(Department department) {
		this.sessionFactory.getCurrentSession().update(department);

	}

	@Override
	@Transactional
	public void deleteDepartment(int departmentid) {
		Department department = (Department) this.sessionFactory.getCurrentSession().load(Department.class,
				new Integer(departmentid));
		this.sessionFactory.getCurrentSession().delete(department);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Department> getAllDepartments() {
		Query allDepartment = this.sessionFactory.getCurrentSession().createQuery("from Department");
		return (List<Department>) allDepartment.list();
	}

	@Override
	@Transactional
	public Department getDeptById(int id) {
		System.out.println("Inside getdeptbyid1");
		System.out.println(this.sessionFactory);
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Inside getdeptbyid2");

		Department p = (Department) session.load(Department.class, new Integer(id));
		System.out.println("Inside getdeptbyid3");
		System.out.println(p);
		return p;
	}

}
