package com.lnt.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.Announcement;


@Repository
public interface AnnouncementDAO {

@Transactional
    public void createAnnouncement(Announcement announcement);

    public void updateAnnouncement(Announcement announcement);

    public void deleteAnnouncement(int AnnouncementId);

    public List<Announcement> getAllAnnouncement();

}
