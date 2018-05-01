package com.team.dream.ratings.models;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class TeamRatingTest {

    TeamRating classUnderTest;
    @Mock
    MemberRating memberRatingMock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        classUnderTest = new TeamRating();
    }
}