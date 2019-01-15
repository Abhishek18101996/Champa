package com.lnt.mvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.model.EmployeeDetails;
import com.lnt.mvc.model.Person;


/**
 * 
 * @author 10653218
 *@Repository – annotate classes at persistence layer, which will act as database repository. 
 */
	public class EmployeeDAOImpl implements EmployeeDAO {
		private static final Logger logger = 			
				LoggerFactory.getLogger(EmployeeDAOImpl.class);
		
	
		private SessionFactory sessionFactory;
		@Autowired
		public void setSessionFactory(SessionFactory sf) {
			this.sessionFactory = sf;
		}
		
		@Override
		@Transactional
		public void createEmployeeDetails(EmployeeDetails EmployeeDetails) {
			System.out.println("ENETERD 1");
		 Session session=this.sessionFactory.getCurrentSession();
		 System.out.println("ENETERD 2");
		 session.save(EmployeeDetails);
		 System.out.println("ENETERD 3");
		 logger.info("EmployeeDetails saved successfully, EmployeeDetails Details="
					+ EmployeeDetails);
		}

		@Override
		@Transactional
		public void updateEmployeeDetails(EmployeeDetails EmployeeDetails) {
			sessionFactory.getCurrentSession().update(EmployeeDetails);
			logger.info("EmployeeDetails updated successfully, "
					+ "EmployeeDetails Details=" + EmployeeDetails);

		}

		@Override
		public void deleteEmployeeDetails(int EmployeeDetailsId) {
			Session session = this.sessionFactory.getCurrentSession();
			EmployeeDetails EmployeeDetails = 
			(EmployeeDetails) session.load(EmployeeDetails.class, new Integer(EmployeeDetailsId));
			if (null != EmployeeDetails) {
				session.delete(EmployeeDetails);
			}else {
				logger.error
				("EmployeeDetails NOT deleted, with EmployeeDetails Id=" +EmployeeDetailsId);
			}
			logger.info("EmployeeDetails deleted successfully, EmployeeDetails details=" + EmployeeDetails);
		}
		

		@SuppressWarnings("unchecked")
		@Override
		public List<EmployeeDetails> getAllEmployeeDetailss() {
			Session session = this.sessionFactory.getCurrentSession();
			List<EmployeeDetails> getAllEmployeeDetailss = session.createQuery("from EmployeeDetails").list();
			for (EmployeeDetails EmployeeDetails : getAllEmployeeDetailss) {
				logger.info("EmployeeDetails List::" + EmployeeDetails);
			}
			return getAllEmployeeDetailss;
		}
		@Override
		@Transactional
		public EmployeeDetails getEmployeeDetails(int EmployeeDetailsId) {
			System.out.println("Inside getEmployeeDetails1");
			Session session = this.sessionFactory.getCurrentSession();
			System.out.println("Inside getEmployeeDetails2");
			EmployeeDetails p = (EmployeeDetails) session.load(EmployeeDetails.class, new Integer(EmployeeDetailsId));
			System.out.println("Inside getEmployeeDetails3");
			logger.info("Person loaded successfully, Person details=" + p);
			return p;
			
		}
		@Override
		@Transactional
		public List<EmployeeDetails> getByNameEmp(String name) {
			System.out.println("inside getbyname 1");
			String hql="from EmployeeDetails e where e.firstName like :names";
			System.out.println("inside getbyname 1");

			Session session = this.sessionFactory.getCurrentSession();
			System.out.println("inside getbyname 2");

			Query query = session.createQuery(hql);
			System.out.println("inside getbyname 3");

			query.setParameter("names", name+"%");
			System.out.println("inside getbyname 4");

			List<EmployeeDetails>emp=query.list();
			System.out.println("inside getbyname 5");

			System.out.println(emp);
			System.out.println("inside getbyname 6");

			return emp;
		}

}
