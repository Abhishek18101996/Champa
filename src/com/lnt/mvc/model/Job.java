package com.lnt.mvc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Job implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int jobId;

	@Column
	private String jobTitle;

	@Column
	private double minSalary;

	@Column
	private double maxSalary;

	/**
	 * One job has many employees
	 */
	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeDetails> employees;

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public List<EmployeeDetails> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeDetails> employee) {
		this.employees = employee;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + ", employees=" + employees + "]";
	}

	public Job(int jobId, String jobTitle, double minSalary, double maxSalary, List<EmployeeDetails> employees) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.employees = employees;
	}

	public Job() {
		super();
	}

}
