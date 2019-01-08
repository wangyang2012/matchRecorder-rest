package com.yang.matchRecorder.service.impl;

import com.yang.matchRecorder.dao.MatchRepository;
import com.yang.matchRecorder.dao.PlayerRepository;
import com.yang.matchRecorder.model.Player;
import com.yang.matchRecorder.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service("playerService")
@Transactional
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private MatchRepository matchRepository;

    @Override
    public Iterable<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public List<Player> findAllAndSortByScore() {
        Iterable<Player> result = playerRepository.findAll();
        List<Player> list = new ArrayList<>();
        Iterator<Player> iter = result.iterator();
        while(iter.hasNext()){
            Player player = iter.next();
            this.calculScore(player);
            list.add(player);
        }
        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getScore().compareTo(o1.getScore());
            }
        });

        return list;
    }

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayer(Integer idPlayer) {
        return playerRepository.findById(idPlayer).get();
    }

    @Override
    public Iterable<Player> getListToFight(Integer idPlayer) {
        return playerRepository.findPlayersToFight(idPlayer, idPlayer, idPlayer);
    }

    /**
     * if win => 3, if loose => 1, if abandon => 0
     * @param player
     * @return
     */
    private void calculScore(Player player) {
        // if win => 3, if loose => 1, if abandon => 0

        // number of win
        Integer nbWin = matchRepository.countWinAsPlayer1(player.getId()) + matchRepository.countWinAsPlayer2(player.getId());

        // number of lose
        Integer nbLose = matchRepository.countLoseAsPlayer1(player.getId()) + matchRepository.countLoseAsPlayer2(player.getId());

        player.setNbWin(nbWin);
        player.setNbLose(nbLose);
        player.setScore(nbWin * 3 + nbLose * 1);
    }
}
