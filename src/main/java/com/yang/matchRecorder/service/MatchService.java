package com.yang.matchRecorder.service;

import com.yang.matchRecorder.model.Match;

public interface MatchService {
    Iterable<Match> findAll();

    void createMatchScore(Match match);

    Match getMatch(Integer idMatch);

    Iterable<Match> findByPlayer(Integer playerId);
}
