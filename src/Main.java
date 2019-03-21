import entity.BankCard;
import entity.Working;
import services.Services;

public class Main {
    public static void main (String[]args){


        Working workingMan = new Working(); //создаем рабочего
        Services.createWorking(workingMan);   //заполняем его данные

        workingMan.card = new BankCard(); //№2создаем карточку рабочего (предварительно карту сделали параметром класса Working)
        Services.createCard(workingMan.card);  //заполняем карту

        //Working workingMan2 = new Working(); //создаем 2 рабочего

        //Services.test(workingMan); //метод принимает рабочего и заполняет его карту
        //BankCard.test(workingMan2.card);

        //System.out.println(workingMan.card.balance);
        //System.out.println(workingMan.card.nameCard);
    }
}
