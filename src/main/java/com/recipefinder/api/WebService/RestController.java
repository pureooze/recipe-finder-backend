package com.recipefinder.api.WebService;

import com.recipefinder.api.Domain.SearchQuery;
import com.recipefinder.api.Service.FinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private FinderService finderService;

    @RequestMapping("/greet")
    public String greet(){
        SearchQuery searchQuery = new SearchQuery();
        searchQuery.setQuery("chicken");
        return finderService.getQueryResults(searchQuery);
    }

}
