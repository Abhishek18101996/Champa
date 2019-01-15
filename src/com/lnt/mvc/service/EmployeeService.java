package com.lnt.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lnt.mvc.model.Employee;

@Service
public interface EmployeeService {

	public void createEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int employeeId);

    public List<Employee> getAllEmployees();

    public Employee getEmployee(int employeeId);

}
