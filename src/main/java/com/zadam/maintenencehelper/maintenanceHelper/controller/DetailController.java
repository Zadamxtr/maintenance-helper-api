package com.zadam.maintenencehelper.maintenanceHelper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.zadam.maintenencehelper.maintenanceHelper.model.Detail;
import com.zadam.maintenencehelper.maintenanceHelper.service.StravaService;

@RestController
public class DetailController {

    @Autowired
    StravaService stravaService;

    @RequestMapping("/detail")
    public Detail getDetail(@RequestParam(value="accessToken") String accessToken,
                            @RequestParam(value="athleteId") String athleteId) {
        return stravaService.getDetail(accessToken, athleteId);
    }
}
