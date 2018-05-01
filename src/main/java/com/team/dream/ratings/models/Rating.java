package com.team.dream.ratings.models;

public class Rating {
    private ResponseValue responseValue;

    public Rating(ResponseValue responseValue) {
        this.responseValue = responseValue;
    }

    public ResponseValue getResponse() {
        return responseValue;
    }

    public void setResponse(ResponseValue responseValue) {
        this.responseValue = responseValue;
    }
}
