package com.team.dream.teams.models;

import com.team.dream.members.models.Member;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Member> members;

    public Team() {
        members = new ArrayList<>();

    }

    public Team(List<Member> members) {
       this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
