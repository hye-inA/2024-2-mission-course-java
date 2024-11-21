package com.gdsc.game;

import java.util.Scanner;

public class Game {
    private int turnCount;
    private int maxTurns;
    private Character player1;
    private Character player2;
    private Character currentPlayer;
    private Character opponent;

    // 생성자
    public Game(Character player1, Character player2, int maxTurns) {
        this.player1 = player1;
        this.player2 = player2;
        this.maxTurns = maxTurns;
        this.turnCount = 0;
        this.currentPlayer = player1;
        this.opponent = player2;
    }
}
