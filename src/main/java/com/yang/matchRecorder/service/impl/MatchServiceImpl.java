package com.yang.matchRecorder.service.impl;

import com.yang.matchRecorder.dao.MatchRepository;
import com.yang.matchRecorder.model.Match;
import com.yang.matchRecorder.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Service("matchService")
@Transactional
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Override
    public Iterable<Match> findAll() {
        return matchRepository.findAll();
    }

    @Override
    public void createMatchScore(Match match) {
        match.setMatchDateTime(LocalDate.now());
        matchRepository.save(match);
    }

    @Override
    public Match getMatch(Integer idMatch) {
        return matchRepository.findById(idMatch).get();
    }

    @Override
    public Iterable<Match> findByPlayer(Integer playerId) {
        return matchRepository.findByPlayer1IdOrPlayer2Id(playerId, playerId);
    }
}
