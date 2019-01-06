package com.zadam.maintenencehelper.maintenanceHelper.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;

import com.zadam.maintenencehelper.maintenanceHelper.model.Token;
import com.zadam.maintenencehelper.maintenanceHelper.model.Detail;
import com.zadam.maintenencehelper.maintenanceHelper.model.strava.StravaToken;
import com.zadam.maintenencehelper.maintenanceHelper.model.strava.StravaDetail;
import com.zadam.maintenencehelper.maintenanceHelper.mapper.StravaTokenToTokenMapper;
import com.zadam.maintenencehelper.maintenanceHelper.mapper.StravaDetailToDetailMapper;

@Service
public class StravaService {

  private String generateStravaTokenUrl(String clientId, String code) {
    // TODO: Move URL and client secret into properties
    UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
      .fromUriString("https://www.strava.com/oauth/token")
      .queryParam("client_id", clientId)
      .queryParam("client_secret", "6215afa5e95845877cfb946a3ef020974d45a4cb")
      .queryParam("code", code)
      .queryParam("grant_type","authorization_code");

      return uriComponentsBuilder.toUriString();
  }

    public Token getToken(String clientId, String code) {
      RestTemplate restTemplate = new RestTemplate();

      String stravaTokenResourceUrl = generateStravaTokenUrl(clientId, code);

      StravaToken stravaToken = restTemplate.postForObject(stravaTokenResourceUrl, null, StravaToken.class);
      // TODO: null/error checking
      return StravaTokenToTokenMapper.stravaTokenToToken(stravaToken);
    }

    private HttpHeaders createHttpHeaders(String token)
    {
        String authHeader = "Bearer " + token;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", authHeader);
        return headers;
    }

    public Detail getDetail(String accessToken, String athleteId) {
      RestTemplate restTemplate = new RestTemplate();

      // TODO: Move URL etc into properties
      String stravaGetAuthenticateAthleteResourceUrl = "https://www.strava.com/api/v3/athlete";

      HttpHeaders headers = createHttpHeaders(accessToken);
      HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
      ResponseEntity<StravaDetail> response = restTemplate.exchange(
        stravaGetAuthenticateAthleteResourceUrl,
        HttpMethod.GET,
        entity,
        StravaDetail.class);

      StravaDetail stravaDetail = response.getBody();

      Detail detail = StravaDetailToDetailMapper.stravaDetailToDetail(stravaDetail);

      return detail;
    }
}
