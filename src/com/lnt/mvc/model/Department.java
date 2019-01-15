package com.lnt.mvc.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Department implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
/*	@SequenceGenerator(name="dept_seq",sequenceName="DepartmentDetailsSequence")
*/	@Column
	private int department_id;
	
	@Column
	private String departmentName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeDetails> employee;
	
	
	public List<EmployeeDetails> getEmployee() {
		return employee;
	}
	public void setEmployee(List<EmployeeDetails> employee) {
		this.employee = employee;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	
	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", departmentName=" + departmentName + ", employee="
				+ employee + "]";
	}
	public Department(int department_id, String departmentName, List<EmployeeDetails> employee) {
		super();
		this.department_id = department_id;
		this.departmentName = departmentName;
		this.employee = employee;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Department() {
		super();
	}
	
	
	
	
}
