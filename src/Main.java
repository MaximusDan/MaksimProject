import entity.BankCard;
import entity.Working;
import services.ServicesWorking;
import services.ServisesBankCard;
public class Main {
    public static void main (String[]args){


        Working workingMan = new Working(); //создаем рабочего
        ServicesWorking.createWorking(workingMan);   //заполняем его данные

        workingMan.card = new BankCard(); //№2 создаем карточку рабочего (предварительно карту сделали параметром класса Working)
        ServisesBankCard.createCard(workingMan.card);  //заполняем карту

        Working workingMan2 = new Working(); //создаем 2 рабочего
        ServisesBankCard.createCard2(workingMan2); //№3.1 метод принимает рабочего и заполняет его карту если ее нет

        ServisesBankCard.remakeNumberCard(workingMan.card); //№3.2 метод, который принимает карту и возвращает её номер в маскированном виде


        //System.out.println(workingMan2.card.balance);
        System.out.println(workingMan.card.numberCard);
    }
}
