package com.team.dream.teams.repositories;

import com.team.dream.members.models.Member;
import com.team.dream.teams.models.Team;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TeamRepositoryTest {

    TeamRepository classUnderTest;
    private BigInteger teamIdentifier = BigInteger.valueOf(1111111);

    @Before
    public void setUp() throws Exception {
        classUnderTest = new TeamRepository(teamIdentifier);
    }

    @Test
    public void retrieveProvidesTeamWithTwoFullyFormedMembers() {
        Team team = classUnderTest.retrieve();
        assertEquals(2, team.getMembers().size());
        for(Member member : team.getMembers()){
            assertNotNull(member.getFirstName());
            assertNotNull(member.getLastName());
        }
    }
}