package essence;

public class Main {
    public static void main (String[]args){


        Working workingMan = new Working(); //создаем рабочего
        workingMan.createWorking();   //заполняем его данные (имя возраст работа департамент зп сколько лет работает)

        workingMan.card = new BankCard(); //создаем карточку рабочего (предварительно карту сделали параметром класса Working)
        workingMan.card.createCard();  //добавляем рабочему карту №2


        //System.out.println(workingMan.name);

       // work1.card = new essence.BankCard();

       // essence.BankCard.test(work1);
        //essence.BankCard.test3(work1.card);

        //work1.card.test2();


        /*essence.Working.createWorking(); //"Рабочий" #59
        essence.BankCard.createCard();
        essence.BankCard.createCollection();*/
    }
}
