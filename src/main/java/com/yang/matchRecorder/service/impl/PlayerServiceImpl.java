package com.yang.matchRecorder.service.impl;

import com.yang.matchRecorder.dao.PlayerRepository;
import com.yang.matchRecorder.model.Player;
import com.yang.matchRecorder.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("playerService")
@Transactional
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Iterable<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    /**
     * if win => 3, if loose => 1, if abandon => 0
     * @param player
     * @return
     */
    private Integer calculScore(Player player) {
        // match.findByPlayer1OrPlayer2(player)
        // if win => 3, if loose => 1, if abandon => 0
        return null;
    }
}
