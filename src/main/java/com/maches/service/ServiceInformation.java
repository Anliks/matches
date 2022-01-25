package com.maches.service;

import com.maches.entity.Player;

public class ServiceInformation implements InformationOutput {

    @Override
    public void informationBegin() {
              System.out.println("Приветствуем в игру 20 спичек,именно сдесь начинает компьютер и выигрывает!");
    }

    @Override
    public void informationAboutMatches(int numberOfMatches) {
              System.out.println("На столе осталось " + numberOfMatches + " Спичек!");
    }

    @Override
    public void informationChoosePlayer(Player player) {
              System.out.println("Ходит " + player.getName());
    }

    @Override
    public void informationMatchesMinus(int numberOfMinus, Player player) {
               System.out.println("Количество убранных " + player.getName() + "ом" + " спичек = " + numberOfMinus);

    }

    @Override
    public void incorrectlyEnteredInformation() {
               System.out.println("Неверно, введите числа 1-3!");
    }

    @Override
    public void informationLooser() {
               System.out.println("Конец игры");
    }

    @Override
    public void informationWinner(Player win) {
               System.out.println("И победил как всегда " + win.getName() + "!!!!!");
    }
}
