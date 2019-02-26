package com.senior_project.recipe_finder.web;

import com.senior_project.recipe_finder.business.SearchService;
import com.senior_project.recipe_finder.data.SearchQuery;
import com.senior_project.recipe_finder.data.SearchResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(method = RequestMethod.GET, value = "/recipes")
    public SearchResults getRecipes(@RequestParam(value = "request") String request){
        SearchQuery searchQuery = new SearchQuery();
        searchQuery.setQuery(request);
        return this.searchService.getQueryResults(searchQuery);
    }
}
