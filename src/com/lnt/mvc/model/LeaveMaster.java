package com.lnt.mvc.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
public class LeaveMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int master_id;
	
	@Column
	private String leavetype;
	
	@Column
	private int leavedaysallowed;

	

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public int getLeavedaysallowed() {
		return leavedaysallowed;
	}

	public void setLeavedaysallowed(int leavedaysallowed) {
		this.leavedaysallowed = leavedaysallowed;
	}

	
	
	@Override
	public String toString() {
		return "LeaveMaster [master_id=" + master_id + ", leavetype=" + leavetype + ", leavedaysallowed="
				+ leavedaysallowed + "]";
	}

	public LeaveMaster(int master_id, String leavetype, int leavedaysallowed) {
		super();
		this.master_id = master_id;
		this.leavetype = leavetype;
		this.leavedaysallowed = leavedaysallowed;
	}

	public int getMaster_id() {
		return master_id;
	}

	public void setMaster_id(int master_id) {
		this.master_id = master_id;
	}

	public LeaveMaster() {
		super();
	}



}
