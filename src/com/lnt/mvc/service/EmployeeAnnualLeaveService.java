package com.lnt.mvc.service;

import java.util.List;

import com.lnt.mvc.model.EmployeeAnnualLeave;



public interface EmployeeAnnualLeaveService {

	public void createEmployeeAnnualLeave(EmployeeAnnualLeave employeeAnnualLeave);

    public void updateEmployeeAnnualLeave(EmployeeAnnualLeave employeeAnnualLeave);

    public List<EmployeeAnnualLeave> getAllEmployeeAnnualLeave();

}
