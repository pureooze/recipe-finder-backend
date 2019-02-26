package com.senior_project.recipe_finder.business;

import com.senior_project.recipe_finder.data.SearchQuery;
import com.senior_project.recipe_finder.data.SearchResults;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class FinderRestClient {
    public SearchResults getQueryResult(SearchQuery searchQuery) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SearchResults> responseEntity = restTemplate.getForEntity("https://api.edamam.com/search?app_id=" + searchQuery.getAppId() + "&app_key=" + searchQuery.getAppKey() + "&q=" + searchQuery.getQuery(), SearchResults.class);

        return responseEntity.getBody();
    }
}
