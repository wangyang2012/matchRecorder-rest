package com.yang.matchRecorder.service;

import com.yang.matchRecorder.model.Player;

public interface PlayerService {
    Iterable<Player> findAll();
    Player addPlayer(Player player);
}
