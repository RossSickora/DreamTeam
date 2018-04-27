package com.team.dream.members.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    private String baseFirstName = "Ross";
    private String baseLastName = "Sickora";
    Member classUnderTest = new Member(baseFirstName, baseLastName);

    @Test
    public void getFirstName() {
        assertTrue(classUnderTest.getFirstName().equalsIgnoreCase(baseFirstName));
    }

    @Test
    public void setFirstName() {
        String expectedFirstName = "Kate";
        classUnderTest.setFirstName(expectedFirstName);
        assertTrue(classUnderTest.getFirstName().equalsIgnoreCase(expectedFirstName));
    }

    @Test
    public void getLastName() {
        assertTrue(classUnderTest.getLastName().equalsIgnoreCase(baseLastName));
    }

    @Test
    public void setLastName() {
        String expectedLastName = "Lindsay";
        classUnderTest.setLastName(expectedLastName);
        assertTrue(classUnderTest.getLastName().equalsIgnoreCase(expectedLastName));
    }
}