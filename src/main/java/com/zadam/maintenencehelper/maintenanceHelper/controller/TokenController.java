package com.zadam.maintenencehelper.maintenanceHelper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.zadam.maintenencehelper.maintenanceHelper.model.Token;
import com.zadam.maintenencehelper.maintenanceHelper.service.StravaService;

@RestController
public class TokenController {

    @Autowired
    StravaService stravaService;

    @RequestMapping("/token")
    public Token getToken(@RequestParam(value="clientId", defaultValue="31154") String clientId,
                          @RequestParam(value="code") String code) {
        return stravaService.getToken(clientId, code);
    }
}
