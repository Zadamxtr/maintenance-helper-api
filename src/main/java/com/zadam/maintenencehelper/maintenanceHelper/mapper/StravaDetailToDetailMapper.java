package com.zadam.maintenencehelper.maintenanceHelper.mapper;

import java.util.List;
import java.util.ArrayList;

import com.zadam.maintenencehelper.maintenanceHelper.model.Detail;
import com.zadam.maintenencehelper.maintenanceHelper.model.Bike;
import com.zadam.maintenencehelper.maintenanceHelper.model.strava.StravaDetail;
import com.zadam.maintenencehelper.maintenanceHelper.model.strava.StravaBikeSummary;

public class StravaDetailToDetailMapper {
  public static Detail stravaDetailToDetail(StravaDetail stravaDetail) {
    Detail detail = new Detail();

    detail.setId(stravaDetail.getId());
    detail.setUserName(stravaDetail.getUsername());
    detail.setFirstName(stravaDetail.getFirstname());
    detail.setLastName(stravaDetail.getLastname());

    detail.setBikes(stravaBikesToBikes(stravaDetail.getBikes()));

    return detail;
  }

  private static List<Bike> stravaBikesToBikes(List<StravaBikeSummary> stravaBikes) {
    List<Bike> bikes = new ArrayList<Bike>();

    for(StravaBikeSummary stravaBike : stravaBikes) {
      Bike bike = new Bike();

      bike.setId(stravaBike.getId());
      bike.setPrimary(stravaBike.getPrimary());
      bike.setName(stravaBike.getName());
      bike.setResourceState(stravaBike.getResource_state());
      bike.setDistance(stravaBike.getDistance());

      bikes.add(bike);
    }

    return bikes;
  }
}
