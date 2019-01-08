package com.yang.matchRecorder.dao;

import com.yang.matchRecorder.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    @Query(value = "select * from player where id != :idPlayer and id not in (select player_1 from matches where player_2 = :idPlayer) and id not in (select player_1 from matches where player_2 = :idPlayer)", nativeQuery = true)
    Iterable<Player> findPlayersToFight(@Param("idPlayer") Integer idPlayer1, @Param("idPlayer") Integer idPlayer2, @Param("idPlayer") Integer idPlayer3);
}
