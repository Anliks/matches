package com.maches.service;

import com.maches.entity.Player;

public interface InformationOutput {

     void informationBegin();

     void informationAboutMatches(int numberOfMatches);

     void informationChoosePlayer(Player player);

     void informationMatchesMinus(int numberOfMinus,Player player);

     void incorrectlyEnteredInformation();

     void informationLooser();

     void informationWinner(Player win);



}
