package com.lnt.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.dao.LeaveMasterDAO;
import com.lnt.mvc.model.LeaveMaster;
import com.lnt.mvc.service.LeaveMasterService;
@Service
public class LeaveMasterServiceImpl implements LeaveMasterService {

	private LeaveMasterDAO leaveMasterDAO;
	
	@Autowired
	public void setLeaveMasterDAO(LeaveMasterDAO leaveMasterDAO) {
		this.leaveMasterDAO = leaveMasterDAO;
	}

	@Override
	@Transactional
	public void createLeaveMaster(LeaveMaster leavemaster) {
		this.leaveMasterDAO.createLeaveMaster(leavemaster);
	}

	@Override
	@Transactional
	public void updateLeaveMaster(LeaveMaster leavemaster) {
		this.leaveMasterDAO.updateLeaveMaster(leavemaster);		
	}

	@Override
	@Transactional
	public List<LeaveMaster> getAllLeaveMaster() {
		return this.leaveMasterDAO.getAllLeaveMaster();
	}

	@Override
	public LeaveMaster getbyId(int id) {
		// TODO Auto-generated method stub
		return this.leaveMasterDAO.getbyId(id);
	}
	

}
