package com.yang.matchRecorder.dao;

import com.yang.matchRecorder.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MatchRepository extends JpaRepository<Match, Integer> {

    @Query(value = "select count(*) from matches where player_1 = :idPlayer and score_1 > score_2 and (player_1_abandon = 0 or player_1_abandon is null)", nativeQuery = true)
    Integer countWinAsPlayer1(@Param("idPlayer") Integer idPlayer);

    @Query(value = "select count(*) from matches where player_2 = :idPlayer and score_2 > score_1 and (player_2_abandon = 0 or player_2_abandon is null)", nativeQuery = true)
    Integer countWinAsPlayer2(@Param("idPlayer") Integer idPlayer);

    @Query(value = "select count(*) from matches where player_1 = :idPlayer and score_1 < score_2 and (player_1_abandon = 0 or player_1_abandon is null)", nativeQuery = true)
    Integer countLoseAsPlayer1(@Param("idPlayer") Integer idPlayer);

    @Query(value = "select count(*) from matches where player_2 = :idPlayer and score_2 < score_1 and (player_2_abandon = 0 or player_2_abandon is null)", nativeQuery = true)
    Integer countLoseAsPlayer2(@Param("idPlayer") Integer idPlayer);

    Iterable<Match> findByPlayer1IdOrPlayer2Id(Integer player1, Integer player2);
}
