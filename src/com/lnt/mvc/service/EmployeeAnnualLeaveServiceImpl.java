package com.lnt.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.dao.EmployeeAnnualLeaveDAO;
import com.lnt.mvc.model.EmployeeAnnualLeave;
import com.lnt.mvc.service.EmployeeAnnualLeaveService;


public class EmployeeAnnualLeaveServiceImpl implements EmployeeAnnualLeaveService{

	private EmployeeAnnualLeaveDAO employeeAnnualLeaveDAO;
	
	@Autowired
	public void setEmployeeAnnualLeaveDAO(EmployeeAnnualLeaveDAO employeeAnnualLeaveDAO) {
		this.employeeAnnualLeaveDAO = employeeAnnualLeaveDAO;
	}
	
	@Override
	@Transactional
	public void createEmployeeAnnualLeave(EmployeeAnnualLeave empleave) {
		this.employeeAnnualLeaveDAO.createEmployeeAnnualLeaveDAO(empleave);
	}

	@Override
	@Transactional
	public void updateEmployeeAnnualLeave(EmployeeAnnualLeave empleave) {
		this.employeeAnnualLeaveDAO.updateEmployeeAnnualLeaveDAO(empleave);
	}

	@Override
	@Transactional
	public List<EmployeeAnnualLeave> getAllEmployeeAnnualLeave() {
		return this.employeeAnnualLeaveDAO.getAllEmployeeAnnualLeave();
	}

}
