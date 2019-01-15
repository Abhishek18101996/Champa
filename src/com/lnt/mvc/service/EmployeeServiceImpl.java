package com.lnt.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.dao.IPersonDao;
import com.lnt.mvc.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	private IPersonDao personDao;
	//setter method for personDao
		@Autowired
		public void setPersonDao(IPersonDao personDao) {
			this.personDao = personDao;
		}
	@Override
	@Transactional
	public void createEmployee(Employee employee) {

	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {

	}

	@Override
	@Transactional
	public void deleteEmployee(int employeeId) {

	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return null;
	}

	@Override
	@Transactional
	public Employee getEmployee(int employeeId) {
		return null;
	}

}
