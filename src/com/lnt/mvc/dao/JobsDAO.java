package com.lnt.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.Job;




public interface JobsDAO {


    public void createJob(Job job);

    public void updateJob(Job job);

    public void deleteJob(String jobId);

    public List<Job> getAllJobs();

    public Job getJob(int jobId);
}
