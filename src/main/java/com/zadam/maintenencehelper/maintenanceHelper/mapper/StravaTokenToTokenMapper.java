package com.zadam.maintenencehelper.maintenanceHelper.mapper;

import com.zadam.maintenencehelper.maintenanceHelper.model.Token;
import com.zadam.maintenencehelper.maintenanceHelper.model.Athlete;
import com.zadam.maintenencehelper.maintenanceHelper.model.strava.StravaToken;
import com.zadam.maintenencehelper.maintenanceHelper.model.strava.StravaAthlete;

public class StravaTokenToTokenMapper {
  public static Token StravaTokenToToken(StravaToken stravaToken) {
    Token token = new Token(stravaToken.getAccess_token(), stravaToken.getRefresh_token());

    token.setAthlete(stravaAthleteToAthlete(stravaToken.getAthlete()));

    return token;
  }

  private static Athlete stravaAthleteToAthlete(StravaAthlete stravaAthlete) {
    Athlete athlete = new Athlete();

    athlete.setId(stravaAthlete.getId());
    athlete.setUserName(stravaAthlete.getUsername());
    athlete.setFirstName(stravaAthlete.getFirstname());
    athlete.setLastName(stravaAthlete.getLastname());

    return athlete;
  }
}
