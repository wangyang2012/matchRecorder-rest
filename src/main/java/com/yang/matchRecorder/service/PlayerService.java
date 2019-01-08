package com.yang.matchRecorder.service;

import com.yang.matchRecorder.model.Player;

import java.util.List;

public interface PlayerService {
    Iterable<Player> findAll();

    List<Player> findAllAndSortByScore();

    Player addPlayer(Player player);

    Player getPlayer(Integer idPlayer);

    Iterable<Player> getListToFight(Integer idPlayer);
}
