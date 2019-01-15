package com.lnt.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lnt.mvc.dao.FeedbackDAO;
import com.lnt.mvc.model.Feedback;


public class FeedbackDAOImpl implements FeedbackDAO {

	
	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	@Transactional
	public void createFeedback(Feedback feedback) {
		this.sessionFactory.getCurrentSession().save(feedback);

	}

	/*@Override
	public void updateFeedback(Feedback feedback) {
		sessionFactory.getCurrentSession().update(feedback);

	}*/

	@Override
	public void deleteFeedback(int FeedbackId) {
		Feedback feed = (Feedback) this.sessionFactory.getCurrentSession().load(Feedback.class,
				new Integer(FeedbackId));
		sessionFactory.getCurrentSession().delete(feed);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Feedback> getAllFeedback() {
		Query allFeedbackQuery = sessionFactory.getCurrentSession().createQuery("from Feedback");
		return (List<Feedback>) allFeedbackQuery.list();
	}
}
