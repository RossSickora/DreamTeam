package com.team.dream.teams.service;

import com.team.dream.teams.repositories.TeamRepository;
import com.team.dream.teams.models.Team;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamsController {

    /**
     * getTeams service
     * @param teamIdentifier
     * @return
     */
    @RequestMapping(value = "/id")
    public Team getTeam(@RequestParam("id") String teamIdentifier) {
        return new TeamRepository(teamIdentifier).retrieve();
    }
}
