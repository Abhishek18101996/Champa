package com.lnt.mvc.dao;

import java.util.List;

import com.lnt.mvc.model.EmployeeDetails;



public interface EmployeeDAO {


    public void createEmployeeDetails(EmployeeDetails EmployeeDetails);

    public void updateEmployeeDetails(EmployeeDetails EmployeeDetails);

    public void deleteEmployeeDetails(int EmployeeDetailsId);

    public List<EmployeeDetails> getAllEmployeeDetailss();

    public EmployeeDetails getEmployeeDetails(int EmployeeDetailsId);
    
    public List<EmployeeDetails> getByNameEmp(String name);
}
