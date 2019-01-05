package com.zadam.maintenencehelper.maintenanceHelper.model.strava;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class StravaDetail implements Serializable {
  private Long id;
  private String username;
  private Long resource_state;
  private String firstname;
  private String lastname;
  private String city;
  private String state;
  private String country;
  private String sex;
  private Boolean premium;
  private Boolean summit;
  private Date created_at;
  private Date updated_at;
  private Long badge_type_id;
  private String profile_medium;
  private String profile;
  private String friend;
  private String follower;
  private String email;
  private List<StravaBikeSummary> bikes;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getResource_state() {
		return this.resource_state;
	}

	public void setResource_state(Long resource_state) {
		this.resource_state = resource_state;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getPremium() {
		return this.premium;
	}

	public void setPremium(Boolean premium) {
		this.premium = premium;
	}

	public Boolean getSummit() {
		return this.summit;
	}

	public void setSummit(Boolean summit) {
		this.summit = summit;
	}

	public Date getCreated_at() {
		return this.created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return this.updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Long getBadge_type_id() {
		return this.badge_type_id;
	}

	public void setBadge_type_id(Long badge_type_id) {
		this.badge_type_id = badge_type_id;
	}

	public String getProfile_medium() {
		return this.profile_medium;
	}

	public void setProfile_medium(String profile_medium) {
		this.profile_medium = profile_medium;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getFriend() {
		return this.friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	public String getFollower() {
		return this.follower;
	}

	public void setFollower(String follower) {
		this.follower = follower;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<StravaBikeSummary> getBikes() {
		return this.bikes;
	}

	public void setBikes(List<StravaBikeSummary> bikes) {
		this.bikes = bikes;
	}
}
