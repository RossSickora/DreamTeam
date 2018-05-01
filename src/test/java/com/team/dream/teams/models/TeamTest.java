package com.team.dream.teams.models;

import com.team.dream.members.models.Member;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TeamTest {
    Team classUnderTest;
    private String memberName = "Ross";
    private String memberLastName = "Sickora";
    private BigInteger teamIdentifier = BigInteger.valueOf(11111111);
    private Member testMember = new Member(memberName, memberLastName);
    @Before
    public void setUp() throws Exception {
        ArrayList<Member> members = new ArrayList<>();
        members.add(testMember);
        classUnderTest = new Team(teamIdentifier, members);
    }

    @Test
    public void getMembers() {

        assertEquals(1, classUnderTest.getMembers().size());
        assertTrue(classUnderTest.getMembers().contains(testMember));
    }

    @Test
    public void setMembers() {
        ArrayList<Member> members = new ArrayList<>();
        Member expectedMember = new Member(memberName, memberLastName);
        members.add(expectedMember);
        classUnderTest.setMembers(members);

        assertEquals(1, classUnderTest.getMembers().size());
        assertTrue(classUnderTest.getMembers().contains(expectedMember));
    }

    @Test
    public void getTeamIdentifierTest(){
        assertEquals(teamIdentifier, classUnderTest.getTeamIdentifier());
    }

    @Test
    public void setTeamIdentifierTest(){
        BigInteger expectedIdentifier = BigInteger.valueOf(22222222);
        classUnderTest.setTeamIdentifier(expectedIdentifier);
        assertEquals(expectedIdentifier, classUnderTest.getTeamIdentifier());
    }
}