package com.maches.repository;

import com.maches.entity.Player;

public class PlayerRepositoryInitial implements PlayerRepository {
     private Player[] players = new Player[2];

    @Override
    public void nextPlayer() {
         Player save = players[0];
         players[0] = players[1];
         players[1] = save;
        }

    @Override
    public Player addGamer(Player player) {
        this.nextPlayer();
        return players[0] = player;
    }


    @Override
    public Player getFirstPlayer() {
        this.nextPlayer();
       return this.players[0];

    }

    @Override
    public Player getSecondPlayer() {
        return this.players[0];
    }

}

