package com.team.dream.ratings.repositories;

import com.team.dream.common.dao.IRepository;
import com.team.dream.ratings.builders.TeamRatingBuilder;
import com.team.dream.ratings.models.TeamRating;
import com.team.dream.teams.models.Team;
import com.team.dream.teams.repositories.TeamRepository;

import java.math.BigInteger;

public class TeamRatingRepository implements IRepository<TeamRating> {

    BigInteger teamId;
    TeamRepository teamRepo;

    public TeamRatingRepository(BigInteger teamId) {
        this.teamId = teamId;
        teamRepo = new TeamRepository(teamId);
    }

    @Override
    public TeamRating retrieve() {
        Team teamToRate = teamRepo.retrieve();
        TeamRating teamRating = new TeamRatingBuilder().build(teamToRate);
        return teamRating;
    }
}
