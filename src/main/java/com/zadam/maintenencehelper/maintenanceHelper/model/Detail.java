package com.zadam.maintenencehelper.maintenanceHelper.model;

import java.util.List;

public class Detail {

  private Long id;
  private String userName;
  private String firstName;
  private String lastName;
  private List<Bike> bikes;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

  public List<Bike> getBikes() {
    return this.bikes;
  }

  public void setBikes(List<Bike> bikes) {
    this.bikes = bikes;
  }
}
