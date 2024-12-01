package com.gdsc.game.controller;

import com.gdsc.game.dto.CharacterStatusResponse;
import com.gdsc.game.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/character/{name}")
    public CharacterStatusResponse getStatus(@PathVariable String name){
        return gameService.getStatus(name);
    }
}
