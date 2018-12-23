package com.yang.matchRecorder.service.impl;

import com.yang.matchRecorder.dao.MatchRepository;
import com.yang.matchRecorder.model.Match;
import com.yang.matchRecorder.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
        matchRepository.save(match);
    }
}
