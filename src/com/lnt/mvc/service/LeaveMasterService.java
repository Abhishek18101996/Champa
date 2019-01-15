package com.lnt.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lnt.mvc.model.LeaveMaster;

@Service
public interface LeaveMasterService {

	
	public void createLeaveMaster(LeaveMaster leavemaster);

    public void updateLeaveMaster(LeaveMaster leavemaster);

    public List<LeaveMaster> getAllLeaveMaster();
    public LeaveMaster getbyId(int id);
}
