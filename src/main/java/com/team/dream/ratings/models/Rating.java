package com.team.dream.ratings.models;

import java.math.BigInteger;

public class Rating {

    private BigInteger ratingId;
    //TODO going to need the ID of who/what is being rated somehow... either here or an edge foreign key object
    private ResponseValue responseValue;

    public Rating() {
    }

    public Rating(BigInteger ratingId, ResponseValue responseValue) {
        this.ratingId = ratingId;
        this.responseValue = responseValue;
    }

    public ResponseValue getResponse() {
        return responseValue;
    }

    public void setResponse(ResponseValue responseValue) {
        this.responseValue = responseValue;
    }

    public BigInteger getRatingId() {
        return ratingId;
    }

    public void setRatingId(BigInteger ratingId) {
        this.ratingId = ratingId;
    }
}
