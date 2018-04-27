package com.team.dream.teams.dao;

import com.team.dream.common.dao.IRepository;
import com.team.dream.members.models.Member;
import com.team.dream.teams.models.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamRepository implements IRepository<Team> {
    private String teamIdentifier;

    public TeamRepository(String teamIdentifier) {
        this.teamIdentifier = teamIdentifier;
    }

    @Override
    public Team retrieve() {
        List<Member> members;
        members = new ArrayList<>();
        members.add(new Member("Ross", "Sickora"));
        members.add(new Member("Team Identifier", teamIdentifier));
        return new Team(members);
    }
}
