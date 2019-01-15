package com.lnt.mvc.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Complaint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int complaintId;

	@Column(name = "Description")
	private String description;
	

	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeeDetails employee;


	public int getComplaintId() {
		return complaintId;
	}


	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public EmployeeDetails getEmployee() {
		return employee;
	}


	public void setEmployee(EmployeeDetails employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", description=" + description + ", employee=" + employee
				+ "]";
	}


	public Complaint(int complaintId, String description, EmployeeDetails employee) {
		super();
		this.complaintId = complaintId;
		this.description = description;
		this.employee = employee;
	}


	public Complaint() {
		super();
	}

	
	
}
