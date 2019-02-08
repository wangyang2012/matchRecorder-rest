package com.yang.matchRecorder.resource;

import com.yang.matchRecorder.model.Match;
import com.yang.matchRecorder.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/match")
@CrossOrigin(origins = "*")
public class MatchResource {
    @Autowired
    private MatchService matchService;

    @GetMapping(value="/")
    public Iterable<Match> getList() {
        return matchService.findAll();
    }

    @GetMapping("/{idPlayer}/player")
    public Iterable<Match> getListOfPlayer(@PathVariable Integer idPlayer) {
        return matchService.findByPlayer(idPlayer);
    }

    @GetMapping("/{idMatch}")
    public Match getMatch(@PathVariable Integer idMatch) {
        return matchService.getMatch(idMatch);
    }

    @PutMapping(value="/")
    public void createMatchScore(@RequestBody Match match) {
        matchService.createMatchScore(match);

    }
}
