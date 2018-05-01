package com.team.dream.ratings.models;

import java.util.List;

public class TeamRating {
    private List<MemberRating> memberRatings;
    private Rating rating;

    public void setMemberRatings(List<MemberRating> memberRatings) {
        this.memberRatings = memberRatings;
    }

    public List<MemberRating> getMemberRatings() {
        return memberRatings;
    }

    public void setTeamRating(Rating ratingMock) {
        this.rating = ratingMock;
    }

    public Rating getRating() {
        return rating;
    }
}
