package com.zadam.maintenencehelper.maintenanceHelper.model.strava;

import java.io.Serializable;
import java.util.Date;

public class StravaBikeSummary implements Serializable {
  private String id;
  private Boolean primary;
  private String name;
  private Long resource_state;
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

	public Long getResource_state() {
		return this.resource_state;
	}

	public void setResource_state(Long resource_state) {
		this.resource_state = resource_state;
	}

	public Long getDistance() {
		return this.distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}
}
