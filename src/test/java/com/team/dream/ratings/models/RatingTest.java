package com.team.dream.ratings.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RatingTest {

    Rating classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Rating(ResponseValue.POSITIVE);
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
}