package services;

import entity.BankCard;
import entity.Working;

public class Services {

    public static void createWorking(Working working) {

        working.name = "Максим";
        working.age = 20;
        working.work = "Прогер";
        working.department = "Java";
        working.money = 1000;
        working.yearsWorking = 5;
    }
    public static void createCard(BankCard workingCard){

        workingCard.balance = 1000.0;
        workingCard.numberCard = "1";
        workingCard.nameCard = "Альфа-банк";
        workingCard.opportunities = true;
        workingCard.pin = "1234";
    }

   /* public static BankCard test(BankCard card1){
        if(card1 == null){
        card1.balance = 500.0;
        card1.numberCard = "2";
        card1.nameCard = "БелИнвестБанк";
        card1.opportunities = false;
        card1.pin = "12345";
    }
        return card1;
}*/
}
