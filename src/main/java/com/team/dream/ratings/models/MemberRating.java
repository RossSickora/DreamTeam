package com.team.dream.ratings.models;

import com.team.dream.members.models.Member;

public class MemberRating {
    private Member member;
    private Rating rating;

    public MemberRating(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
