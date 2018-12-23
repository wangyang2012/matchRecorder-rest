package com.yang.matchRecorder.dao;

import com.yang.matchRecorder.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Integer> {
}
