package com.maches.repository;

import com.maches.entity.Player;

public interface PlayerRepository {

    void nextPlayer();

    Player addGamer(Player player);

    Player getFirstPlayer();

    Player getSecondPlayer();

}
