package com.lnt.mvc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Person {
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int  userid;
	
	
	/*@Size(max = 20, min = 3, 
			message = " Name entered is invalid. It must be between 3 and 20 characters.")
	private String name;*/
	
	@NotEmpty(message = "Password Name cannot be empty!")
	private String password;


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Person [userid=" + userid + ", password=" + password + "]";
	}


	public Person() {
		super();
	}

	
	

}
