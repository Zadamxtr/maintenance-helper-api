package com.zadam.maintenencehelper.maintenanceHelper.model;

public class Bike {

  private String id;
  private Boolean primary;
  private String name;
  private Long resourceState;
  private Long distance;
  
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getPrimary() {
		return this.primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getResourceState() {
		return this.resourceState;
	}

	public void setResourceState(Long resourceState) {
		this.resourceState = resourceState;
	}

	public Long getDistance() {
		return this.distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}
}
