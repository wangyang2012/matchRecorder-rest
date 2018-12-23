package com.yang.matchRecorder.resource;

import com.yang.matchRecorder.model.Match;
import com.yang.matchRecorder.model.Player;
import com.yang.matchRecorder.service.MatchService;
import com.yang.matchRecorder.service.PlayerService;
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

    @PutMapping(value="/")
    public void createMatchScore(Match match) {
        matchService.createMatchScore(match);

    }
}
