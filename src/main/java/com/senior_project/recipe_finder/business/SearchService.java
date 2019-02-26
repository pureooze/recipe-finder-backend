package com.senior_project.recipe_finder.business;

import com.senior_project.recipe_finder.data.SearchQuery;
import com.senior_project.recipe_finder.data.SearchResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    private FinderRestClient finderRestClient;

    public SearchService(){

    }

    public SearchResults getQueryResults(SearchQuery searchQuery){

        return finderRestClient.getQueryResult(searchQuery);
    }
}
