package com.lnt.mvc.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.model.LeaveMaster;



public interface LeaveMasterDAO {

	public void createLeaveMaster(LeaveMaster leavemaster);

    public void updateLeaveMaster(LeaveMaster leavemaster);

    public List<LeaveMaster> getAllLeaveMaster();
    @Transactional
    public LeaveMaster getbyId(int id);

}
