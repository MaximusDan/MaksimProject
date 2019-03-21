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

    public static void createCard(BankCard workingCard) {

        workingCard.balance = 1000.0;
        workingCard.numberCard = "1sdheshdzacsr2346asdcsrv";
        workingCard.nameCard = "Альфа-банк";
        workingCard.opportunities = true;
        workingCard.pin = "1234";
    }

    public static void createCard2(Working working2) {
        if (working2.card == null) {//если карты нет
            working2.card = new BankCard();

            working2.card.balance = 500.0;
            working2.card.numberCard = "2";
            working2.card.nameCard = "БелИнвестБанк";
            working2.card.opportunities = false;
            working2.card.pin = "12345";
        }
    }

    public static BankCard remakeNumberCard(BankCard newNumber) {

        char[] mass = newNumber.numberCard.toCharArray();
        for (int i = 6; i < mass.length - 4; i++) {
            mass[i] = 42;
        }
        newNumber.numberCard = newNumber.numberCard.valueOf(mass);
        return newNumber;
    }
}
