package com.team.dream.ratings.builders;

import com.team.dream.members.models.Member;
import com.team.dream.ratings.models.MemberRating;
import com.team.dream.ratings.models.Rating;
import com.team.dream.ratings.models.TeamRating;
import com.team.dream.teams.models.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamRatingBuilder {

    public TeamRating build(Team sourceTeam){
        List<MemberRating> memberRatingList = new ArrayList<>();
        for(Member member : sourceTeam.getMembers()){
            memberRatingList.add(new MemberRating(member));
        }
        TeamRating teamRating = new TeamRating();
        teamRating.setMemberRatings(memberRatingList);
        teamRating.setTeamRating(new Rating());
        return teamRating;
    }
}
