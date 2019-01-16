package com.recipefinder.api.Service;

import com.recipefinder.api.Domain.SearchQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class FinderRestClient {
    public String getQueryResult(SearchQuery searchQuery){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://api.edamam.com/search?app_id="+searchQuery.getAppId()+"&app_key="+searchQuery.getAppKey()+"&q="+searchQuery.getQuery(), String.class);

        return responseEntity.getBody();
    }
}
