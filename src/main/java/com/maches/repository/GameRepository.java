package com.maches.repository;

public interface GameRepository {

    int getNumberOfMatches();

    boolean isEmptyValue();

    boolean isLastMatch();

    void changingMatches(int matchesMinus);
}
