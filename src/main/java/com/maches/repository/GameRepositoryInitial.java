package com.maches.repository;

public class GameRepositoryInitial implements GameRepository {
    private int numberOfMatches = 20;

    @Override
    public int getNumberOfMatches() {
        return this.numberOfMatches;
    }

    @Override
    public boolean isEmptyValue() {
        return this.numberOfMatches == 0;
    }

    @Override
    public boolean isLastMatch() {
        return this.numberOfMatches == 1;
    }

    @Override
    public void changingMatches(int matchesMinus) {
        this.numberOfMatches-= matchesMinus;
    }

}
