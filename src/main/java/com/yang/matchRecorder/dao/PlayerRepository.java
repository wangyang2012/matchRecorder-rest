package com.yang.matchRecorder.dao;

import com.yang.matchRecorder.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
