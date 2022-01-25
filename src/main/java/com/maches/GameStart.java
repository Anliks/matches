package com.maches;

import com.maches.entity.Player;
import com.maches.repository.GameRepositoryInitial;
import com.maches.repository.PlayerRepositoryInitial;
import com.maches.service.PlayerWorkService;
import com.maches.service.ServiceInformation;

public class GameStart {

    public static void startGame() {
        int matchesMinus;
        ServiceInformation serviceInformation = new ServiceInformation();

        GameRepositoryInitial gameRepositoryInitial = new GameRepositoryInitial();

        PlayerRepositoryInitial playerRepositoryInitial = new PlayerRepositoryInitial();

        PlayerWorkService playerWorkService = new PlayerWorkService(gameRepositoryInitial);

        Player computer = new Player("Компьютер");
        Player player = new Player("Игрок");


        playerRepositoryInitial.addGamer(computer);
        playerRepositoryInitial.addGamer(player);


        serviceInformation.informationBegin();

        while (!gameRepositoryInitial.isLastMatch() && !gameRepositoryInitial.isEmptyValue()) {

           serviceInformation.informationAboutMatches(gameRepositoryInitial.getNumberOfMatches());

           Player nextPlayer = playerRepositoryInitial.getFirstPlayer();

           serviceInformation.informationChoosePlayer(nextPlayer);

           if(nextPlayer == computer) {
               matchesMinus = playerWorkService.moveComputer();
               serviceInformation.informationMatchesMinus(matchesMinus, nextPlayer);
           } else {
               matchesMinus = playerWorkService.movePlayer();

               while (!playerWorkService.isRightMove(matchesMinus)) {
                   serviceInformation.incorrectlyEnteredInformation();
                   matchesMinus = playerWorkService.movePlayer();
               }
           }
           gameRepositoryInitial.changingMatches(matchesMinus);
        }
        serviceInformation.informationAboutMatches(gameRepositoryInitial.getNumberOfMatches());
        serviceInformation.informationLooser();

        if(gameRepositoryInitial.isLastMatch()) {
            serviceInformation.informationWinner(playerRepositoryInitial.getSecondPlayer());
        } else {
            serviceInformation.informationWinner(playerRepositoryInitial.getFirstPlayer());
        }
    }
}
