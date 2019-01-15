package com.lnt.mvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.model.Job;


public class JobDAOImpl implements JobsDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	@Transactional
	public void createJob(Job job) {
		this.sessionFactory.getCurrentSession().save(job);
	}

	@Override
	@Transactional
	public void updateJob(Job job) {
		this.sessionFactory.getCurrentSession().update(job);
	}

	@Override
	@Transactional
	public void deleteJob(String jobId) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Job> getAllJobs() {
		Query allJobQuery = this.sessionFactory.getCurrentSession().createQuery("from Job");
		allJobQuery.setCacheable(true);
		return (List<Job>) allJobQuery.list();
	}

	@Override
	@Transactional
	public Job getJob(int jobId) {
		System.out.println("Inside getjob 1");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Inside getjob 2");
		Job p = (Job) session.load(Job.class, new Integer(jobId));
		System.out.println("Inside getjob 3");
		System.out.println(p);
		return p;
	}
}
