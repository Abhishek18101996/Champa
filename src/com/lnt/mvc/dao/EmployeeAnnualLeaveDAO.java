package com.lnt.mvc.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.model.EmployeeAnnualLeave;



public interface EmployeeAnnualLeaveDAO {
	@Transactional
	public void createEmployeeAnnualLeaveDAO(EmployeeAnnualLeave empleave);

    public void updateEmployeeAnnualLeaveDAO(EmployeeAnnualLeave empleave);

    public List<EmployeeAnnualLeave> getAllEmployeeAnnualLeave();

}
