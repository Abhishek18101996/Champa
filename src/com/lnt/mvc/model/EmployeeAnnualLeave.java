package com.lnt.mvc.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Component
@Entity
public class EmployeeAnnualLeave {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int leaveId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeeDetails employee;

	@Column(name = "Leave_Days_Remaining")
	private int ldr;
	
	@OneToOne
	private LeaveMaster leavemaster;

	@Column(name = "LeaveStatus")
	private String leavestatus;
	
	@Column
	private int employee_id;
	
	@Column
	private int master_id;
	
	@Column(name = "start_date")
	/*@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")*/
	private Date startdate;

	@Column(name = "end_date")
	/*@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")*/
	private Date enddate;

	public EmployeeDetails getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDetails emp) {
		this.employee = emp;
	}

	public int getLdr() {
		return ldr;
	}

	public void setLdr(int ldr) {
		this.ldr = ldr;
	}


	public String getLeavestatus() {
		return leavestatus;
	}

	public void setLeavestatus(String leavestatus) {
		this.leavestatus = leavestatus;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	
	
	@Override
	public String toString() {
		return "EmployeeAnnualLeave [leaveId=" + leaveId + ", employee=" + employee + ", ldr=" + ldr + ", leavemaster="
				+ leavemaster + ", leavestatus=" + leavestatus + ", employee_id=" + employee_id + ", master_id="
				+ master_id + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}

	public LeaveMaster getLeavemaster() {
		return leavemaster;
	}

	public void setLeavemaster(LeaveMaster leavemaster) {
		this.leavemaster = leavemaster;
	}

	public EmployeeAnnualLeave(int leaveId, EmployeeDetails employee, int ldr, LeaveMaster leavemaster,
			String leavestatus, int employee_id, int master_id, Date startdate, Date enddate) {
		super();
		this.leaveId = leaveId;
		this.employee = employee;
		this.ldr = ldr;
		this.leavemaster = leavemaster;
		this.leavestatus = leavestatus;
		this.employee_id = employee_id;
		this.master_id = master_id;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getMaster_id() {
		return master_id;
	}

	public void setMaster_id(int master_id) {
		this.master_id = master_id;
	}

	public EmployeeAnnualLeave() {
		super();
	}
	
	

}
