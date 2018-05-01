package com.team.dream.teams.models;

import com.team.dream.members.models.Member;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private BigInteger teamIdentifier;
    private List<Member> members;

    public Team() {
        members = new ArrayList<>();

    }

    public Team(BigInteger teamIdentifier, List<Member> members) {
        this.teamIdentifier = teamIdentifier;
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public BigInteger getTeamIdentifier() {
        return teamIdentifier;
    }

    public void setTeamIdentifier(BigInteger teamIdentifier) {
        this.teamIdentifier = teamIdentifier;
    }
}
