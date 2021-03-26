package org.siimbu.java.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehiclename;
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private UserDetails userDetails;

	@ManyToMany(mappedBy = "Vehicle")
	private Collection<UserDetails> userDetailsList = new ArrayList<UserDetails>();

	public Collection<UserDetails> getUserDetailsList() {
		return userDetailsList;
	}

	public void setUserDetailsList(Collection<UserDetails> userDetailsList) {
		this.userDetailsList = userDetailsList;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}

}
