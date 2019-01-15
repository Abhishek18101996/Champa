package com.lnt.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.lnt.mvc.model.Feedback;


public interface FeedbackDAO {

	@Transactional
    public void createFeedback(Feedback feedback);

    public void deleteFeedback(int FeedbackId);

    public List<Feedback> getAllFeedback();

}
