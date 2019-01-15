package com.lnt.mvc.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
public class EmployeeDetails implements Serializable {

	@Id
	/*@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="emp_seq")*/
	/*@SequenceGenerator(name="emp_seq",sequenceName="EmployeeDetailsSequence")*/

	private int employee_id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private double salary;
	private String phoneNumber;
	private String password;
	private int jobId;
	private int department_id;
	/*@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "T")*/
	private Date hiredate;
	

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}



	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employee_id=" + employee_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailAddress=" + emailAddress + ", salary=" + salary + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", jobId=" + jobId + ", department_id=" + department_id + ", hiredate="
				+ hiredate + "]";
	}

	public EmployeeDetails(int employee_id, String firstName, String lastName, String emailAddress, double salary,
			String phoneNumber, String password, int jobId, int department_id, Date hiredate) {
		super();
		this.employee_id = employee_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.jobId = jobId;
		this.department_id = department_id;
		this.hiredate = hiredate;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
