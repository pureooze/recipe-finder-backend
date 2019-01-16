package com.recipefinder.api.Domain;

import lombok.Data;

@Data
public class SearchQuery {
    public String query;
    protected String appId = "369df137";
    protected String appKey = "845a0bb6179cb06431b8296ee66dfa85";
}
