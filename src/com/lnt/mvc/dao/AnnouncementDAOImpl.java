package com.lnt.mvc.dao;
import java.util.List;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lnt.mvc.dao.AnnouncementDAO;
import com.lnt.mvc.model.Announcement;



public class AnnouncementDAOImpl implements AnnouncementDAO {

	 private SessionFactory sessionFactory;
	
	
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	
	@Override
	public void createAnnouncement(Announcement announcement) {
		 sessionFactory.getCurrentSession().save(announcement);  		
	}

	@Override
	public void updateAnnouncement(Announcement announcement) {
		sessionFactory.getCurrentSession().update(announcement);  		
	}

	@Override
	public void deleteAnnouncement(int AnnouncementId) {
		 Announcement a = (Announcement) this.sessionFactory.getCurrentSession().load(Announcement.class,  new Integer(AnnouncementId));
		  sessionFactory.getCurrentSession().delete(a);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Announcement> getAllAnnouncement() {
		Query allAnnouncementQuery = sessionFactory.getCurrentSession().createQuery("from Announcement");
		return (List<Announcement>) allAnnouncementQuery.list();
	}

}