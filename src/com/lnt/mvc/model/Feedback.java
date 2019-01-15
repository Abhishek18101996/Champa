package com.lnt.mvc.model;


import java.sql.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int feedId;

	@Column
	private String feedback;

	@Column(name = "Date_Of_Feedback")
	/*@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "Y")*/
	private Date year;

	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeDetails employee;
	
	private int employee_id;	
	
	
	public int getFeedId() {
		return feedId;
	}


	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	public Date getYear() {
		return year;
	}


	public void setYear(Date year) {
		this.year = year;
	}


	public EmployeeDetails getEmployee() {
		return employee;
	}


	public void setEmployee(EmployeeDetails employee) {
		this.employee = employee;
	}


	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	

	
	@Override
	public String toString() {
		return "Feedback [feedId=" + feedId + ", feedback=" + feedback + ", year=" + year + ", employee=" + employee
				+ ", employee_id=" + employee_id + "]";
	}


	

	public Feedback(int feedId, String feedback, Date year, EmployeeDetails employee, int employee_id) {
		super();
		this.feedId = feedId;
		this.feedback = feedback;
		this.year = year;
		this.employee = employee;
		this.employee_id = employee_id;
	}


	public Feedback() {
		super();
	}
	
	
}