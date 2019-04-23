package services;
import entity.BankCard;

public class ServisesBankCard {

    public static void createCard(BankCard userCard) {

        userCard.balance = 1000.0;
        userCard.numberCard = "1sdheshdzacsr2346asdcsrv";
        userCard.nameCard = "Альфа-банк";
        userCard.opportunities = true;
        userCard.pin = "1234";
    }

   /* public static void createCard2(User user2) {
        if (user2.card == null) {//если карты нет
            user2.card = new BankCard();

            user2.card.balance = 500.0;
            user2.card.numberCard = "2";
            user2.card.nameCard = "БелИнвестБанк";
            user2.card.opportunities = false;
            user2.card.pin = "12345";
        }
    }*/

    public static BankCard remakeNumberCard(BankCard newNumber) {

        char[] mass = newNumber.numberCard.toCharArray();
        for (int i = 6; i < mass.length - 4; i++) {
            mass[i] = 42;
        }
        return newNumber;
    }
}
