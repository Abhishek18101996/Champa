package com.lnt.mvc.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
	@Entity
	public class Location {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column
	    private int locationId;

	    @OneToMany(cascade = CascadeType.ALL)
	    private List<Department> departments;

	    @Column
	    private String streetAddress;

	    @Column
	    private String postalCode;

	    @Column
	    private String city;

	    @Column
	    private String stateProvince;
	    
	    @Column
	    private String country;

		public int getLocationId() {
			return locationId;
		}

		public void setLocationId(int locationId) {
			this.locationId = locationId;
		}

		public List<Department> getDepartments() {
			return departments;
		}

		public void setDepartments(List<Department> department) {
			this.departments = department;
		}

		public String getStreetAddress() {
			return streetAddress;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStateProvince() {
			return stateProvince;
		}

		public void setStateProvince(String stateProvince) {
			this.stateProvince = stateProvince;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "Location [locationId=" + locationId + ", departments=" + departments + ", streetAddress="
					+ streetAddress + ", postalCode=" + postalCode + ", city=" + city + ", stateProvince="
					+ stateProvince + ", country=" + country + "]";
		}

		public Location(int locationId, List<Department> departments, String streetAddress, String postalCode,
				String city, String stateProvince, String country) {
			super();
			this.locationId = locationId;
			this.departments = departments;
			this.streetAddress = streetAddress;
			this.postalCode = postalCode;
			this.city = city;
			this.stateProvince = stateProvince;
			this.country = country;
		}

		public Location() {
			super();
		}

	    

}
