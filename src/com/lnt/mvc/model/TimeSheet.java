package com.lnt.mvc.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
@Entity
public class TimeSheet {

	/**
	 * USING LONG TIME FORMAT SPECIFIER
	 */


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TimeId")
	private int timeId;

	@Column(name = "IN_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "T")
	private Date intime ;
	
	
	@Column(name = "OUT_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "T")
	private Date outtime;
/*	long hrsworked =  intime.compareTo(outtime);
*/	

	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeDetails employee;
	

	@Column(name = "TotalHours")
	private long totalhours;/*=hrsworked/3600;*/
	
	@Column(name = "Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;

	public Date getIntime() {
		return intime;
	}

	public void setIntime(Date intime) {
		this.intime = intime;
	}

	public Date getOuttime() {
		return outtime;
	}

	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}

	public long getTotalhours() {
		return totalhours;
	}

	public void setTotalhours(long totalhours) {
		this.totalhours = totalhours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTimeId() {
		return timeId;
	}

	public void setTimeId(int timeId) {
		this.timeId = timeId;
	}

	public EmployeeDetails getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDetails employee) {
		this.employee = employee;
	}

	

	

	@Override
	public String toString() {
		return "TimeSheet [timeId=" + timeId + ", intime=" + intime + ", outtime=" + outtime + ", employee=" + employee
				+ ", totalhours=" + totalhours + ", date=" + date + "]";
	}

	

	public TimeSheet(int timeId, Date intime, Date outtime, EmployeeDetails employee, long totalhours, Date date) {
		super();
		this.timeId = timeId;
		this.intime = intime;
		this.outtime = outtime;
		this.employee = employee;
		this.totalhours = totalhours;
		this.date = date;
	}

	public TimeSheet() {
		super();
	}
	
	
	
}
	
