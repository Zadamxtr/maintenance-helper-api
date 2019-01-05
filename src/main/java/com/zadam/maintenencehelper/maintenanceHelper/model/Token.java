package com.zadam.maintenencehelper.maintenanceHelper.model;

public class Token {

    private String accessToken;
    private String refreshToken;
    private Athlete athlete;

    public Token(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
    }

    public Athlete getAthlete() {
      return this.athlete;
    }

    public void setAthlete(Athlete athlete) {
      this.athlete = athlete;
    }
}
