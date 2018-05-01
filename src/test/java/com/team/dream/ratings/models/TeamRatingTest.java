package com.team.dream.ratings.models;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TeamRatingTest {

    TeamRating classUnderTest;
    @Mock
    MemberRating memberRatingMock;
    @Mock
    Rating ratingMock;

    ArrayList<MemberRating> memberRatings;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        classUnderTest = new TeamRating();
        memberRatings = new ArrayList<>();
        memberRatings.add(memberRatingMock);

    }

    @Test
    public void getMemberRatingsReturnsFullListOfMemberRatings(){
        classUnderTest.setMemberRatings(memberRatings);
        assertEquals(memberRatings.size(), classUnderTest.getMemberRatings().size());
       assertEquals(memberRatings, classUnderTest.getMemberRatings());
    }

    @Test
    public void getTeamRatingTest(){
        classUnderTest.setTeamRating(ratingMock);
        assertEquals(ratingMock, classUnderTest.getRating());
    }
}