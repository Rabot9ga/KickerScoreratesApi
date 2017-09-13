package ru.rabot9ga.CreateGame;


import commons.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CreateGameRq {

    private UUID uuid;
    private List<Team> teams;

    private int scoreA = 0;
    private int scoreB = 0;

      public CreateGameRq() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public CreateGameRq setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public CreateGameRq setTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    public int getScoreA() {
        return scoreA;
    }

    public CreateGameRq setScoreA(int scoreA) {
        this.scoreA = scoreA;
        return this;
    }

    public int getScoreB() {
        return scoreB;
    }

    public CreateGameRq setScoreB(int scoreB) {
        this.scoreB = scoreB;
        return this;
    }

    public CreateGameRq setTeam(Team team){
        if (this.teams == null){
            this.teams = new ArrayList<>();
        }
        this.teams.add(team);
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateGameRq{");
        sb.append("uuid=").append(uuid);
        sb.append(", teams=").append(teams);
        sb.append(", scoreA=").append(scoreA);
        sb.append(", scoreB=").append(scoreB);
        sb.append('}');
        return sb.toString();
    }
}
