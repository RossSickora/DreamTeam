package com.team.dream.ratings.service;

import com.team.dream.ratings.models.MemberRating;
import com.team.dream.ratings.models.TeamRating;
import com.team.dream.ratings.repositories.TeamRatingRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

    //TODO stand up RatingsController to return a static Team Rating from a Team Rating Repository Given a Teamidentifier
    @RequestMapping("/team")
    public TeamRating getTeamRatingContent(@RequestParam("id") String teamIdentifier){
        return new TeamRatingRepository(BigInteger.valueOf(Integer.valueOf(teamIdentifier))).retrieve();
    }

    @RequestMapping("/member")
    public MemberRating getTeamMemberContent(@RequestParam("id") String teamIdentifier){
        return null;
    }
}
