package com.yang.matchRecorder.resource;

import com.yang.matchRecorder.model.Player;
import com.yang.matchRecorder.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
@CrossOrigin(origins = "*")
public class PlayerResource {

    @Autowired
    private PlayerService playerService;

    @GetMapping(value="/")
    public Iterable<Player> getList() {
        return playerService.findAllAndSortByScore();
    }

    @GetMapping(value="/{idPlayer}/toFight")
    public Iterable<Player> getListToFight(@PathVariable Integer idPlayer) {
        return playerService.getListToFight(idPlayer);
    }

    @PutMapping(value="/")
    public Player createPlayer(@RequestBody String player) {
        Player playerObj = new Player();
        playerObj.setName(player);
        return playerService.addPlayer(playerObj);
    }

    @GetMapping("/{idPlayer}")
    public Player getPlayer(@PathVariable Integer idPlayer) {
        return playerService.getPlayer(idPlayer);
    }

}
