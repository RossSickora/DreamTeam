package com.team.dream.ratings.models;

import com.team.dream.members.models.Member;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class MemberRatingTest {

    MemberRating classUnderTest;
    @Mock
    Member member;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        classUnderTest = new MemberRating(member);
    }

    @Test
    public void getMemberTest(){
        assertEquals(member, classUnderTest.getMember());
    }

    @Test
    public void setMemberTest(){
        Member newMemberMock = Mockito.mock(Member.class);
        classUnderTest.setMember(newMemberMock);
    }

    @Test
    public void getRatingIsNullOnInitTest(){
        assertNull(classUnderTest.getRating());
    }

    @Test
    public void setRatingModifiesRating(){
        Rating rating = new Rating(ResponseValue.POSITIVE);
        classUnderTest.setRating(rating);
        assertEquals(rating, classUnderTest.getRating());
    }
}