package com.zadam.maintenencehelper.maintenanceHelper.model.strava;

import java.io.Serializable;

public class StravaToken implements Serializable {
  
  private String token_type;
  private Long expires_at;
  private Long expires_in;
  private String refresh_token;
  private String access_token;
  private StravaAthlete athlete;

	public String getToken_type() {
		return this.token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public Long getExpires_at() {
		return this.expires_at;
	}

	public void setExpires_at(Long expires_at) {
		this.expires_at = expires_at;
	}

	public Long getExpires_in() {
		return this.expires_in;
	}

	public void setExpires_in(Long expires_in) {
		this.expires_in = expires_in;
	}

	public String getRefresh_token() {
		return this.refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getAccess_token() {
		return this.access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public StravaAthlete getAthlete() {
		return this.athlete;
	}

	public void setAthlete(StravaAthlete athlete) {
		this.athlete = athlete;
	}
}
