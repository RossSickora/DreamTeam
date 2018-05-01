package com.team.dream.ratings.models;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class RatingTest {

    Rating classUnderTest;
    BigInteger ratingId = BigInteger.valueOf(111111);

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Rating(ratingId, ResponseValue.POSITIVE);
    }

    @Test
    public void getValueReturnsExpectedValue(){
        assertEquals(ResponseValue.POSITIVE, classUnderTest.getResponse());
    }

    @Test
    public void setValueAltersValue(){
        classUnderTest.setResponse(ResponseValue.NEUTRAL);
        assertEquals(ResponseValue.NEUTRAL, classUnderTest.getResponse());
    }

    @Test
    public void getRatingIdRetrunsUnalteredValue(){
        assertEquals(ratingId, classUnderTest.getRatingId());
    }
    @Test
    public void setRatingIdModifiesValue(){
        BigInteger expectedRatingId = BigInteger.valueOf(2222222);
        classUnderTest.setRatingId(expectedRatingId);
        assertEquals(expectedRatingId, classUnderTest.getRatingId());
    }
}