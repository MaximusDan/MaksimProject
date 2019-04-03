import entity.BankCard;
import entity.Working;
import services.ServicesWorking;
import services.ServisesBankCard;
import services.GenerationId;

import storage.Collection;

import java.util.ArrayList;

public class Main {
    public static void main (String[]args){


        //GenerationId.createId(); //тестировал метод createId

        //Working.qqq();
        //Collection.test(); // Умение гуглить #5

        //Collection.test1();

        //СТАРЫЕ ЗАДАНИЯ

        /*Working workingMan = new Working(); //создаем рабочего
        ServicesWorking.createWorking(workingMan);   //заполняем его данные

        workingMan.card = new BankCard(); //№2 создаем карточку рабочего (предварительно карту сделали параметром класса Working)
        ServisesBankCard.createCard(workingMan.card);  //заполняем карту

        Working workingMan2 = new Working(); //создаем 2 рабочего
        ServicesWorking.createWorking(workingMan2);
        ServisesBankCard.createCard2(workingMan2); //№3.1 метод принимает рабочего и заполняет его карту если ее нет

        ServisesBankCard.remakeNumberCard(workingMan.card); //№3.2 метод, который принимает карту и возвращает её номер в маскированном виде*/

        //System.out.println(Collection.people);
        //System.out.println(Collection.people1);

    }
}
