package com.lnt.mvc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "Announcement")
public class Announcement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Announcement_Id")
	private int AnnouncementId;

	@Column(name = "Announcement")
	private String Announcement;


	@Column(name = "Date_Of_Announcement")
	private Date date;


	public String getAnnouncement() {
		return Announcement;
	}


	public void setAnnouncement(String announcement) {
		Announcement = announcement;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getAnnouncementId() {
		return AnnouncementId;
	}


	public void setAnnouncementId(int announcementId) {
		AnnouncementId = announcementId;
	}


	@Override
	public String toString() {
		return "Announcement [AnnouncementId=" + AnnouncementId + ", Announcement=" + Announcement + ", date=" + date
				+ "]";
	}


	public Announcement(int announcementId, String announcement, Date date) {
		super();
		AnnouncementId = announcementId;
		Announcement = announcement;
		this.date = date;
	}


	public Announcement() {
		super();
	}
	
	
}
