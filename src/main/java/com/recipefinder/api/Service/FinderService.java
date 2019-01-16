package com.recipefinder.api.Service;

import com.recipefinder.api.Domain.SearchQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinderService {

    @Autowired
    private FinderRestClient finderRestClient;

    public FinderService(){

    }

    public String getQueryResults(SearchQuery searchQuery){
        return finderRestClient.getQueryResult(searchQuery);
    }
}
