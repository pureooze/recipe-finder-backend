package com.senior_project.recipe_finder.data;

import lombok.Data;

import java.util.List;

@Data
public class SearchResults {

    private List<Hit> hits;


}
