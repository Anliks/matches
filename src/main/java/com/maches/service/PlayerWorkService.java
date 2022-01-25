package com.maches.service;

import com.maches.repository.GameRepositoryInitial;

import java.util.Scanner;

public class PlayerWorkService implements PlayersWork {

    private GameRepositoryInitial gameRepositoryInitial;

    public PlayerWorkService(GameRepositoryInitial gameRepositoryInitial) {
        this.gameRepositoryInitial = gameRepositoryInitial;
    }


    @Override
    public int moveComputer() {
        return (gameRepositoryInitial.getNumberOfMatches()-1) % 4;
    }

    @Override
    public int movePlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество спичек от 1 до 3");
        return scanner.nextInt();
    }

    @Override
    public boolean isRightMove(int matchesMinus) {
        return matchesMinus < 1 || matchesMinus > 3 ? false : true;
    }
}
