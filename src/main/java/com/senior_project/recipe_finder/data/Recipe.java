package com.senior_project.recipe_finder.data;

import lombok.Data;

import java.util.List;

@Data
public class Recipe {
    private String url;
    private String image;
    private String label;
    private List<String> ingredientLines;
    private String totalTime;
}
