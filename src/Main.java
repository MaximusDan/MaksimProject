import authorization.Authorization;

public class Main {
    public static void main (String[]args){

        Authorization.pusk();
        /*User w = DaoUser.takeWorkingCollection("54645");

        if(w == null){
            System.out.println("ok");
        }else{
            System.out.println("ne ok");
        }

        DaoUser.deleteWorkingCollection(w);

        //GenerationId.createId(); //тестировал метод createId

        //User.qqq();
        //Collection.test(); // Умение гуглить #5

        //Collection.test1();

        //СТАРЫЕ ЗАДАНИЯ

        /*User workingMan = new User(); //создаем рабочего
        ServicesUser.createWorking(workingMan);   //заполняем его данные

        workingMan.card = new BankCard(); //№2 создаем карточку рабочего (предварительно карту сделали параметром класса User)
        ServisesBankCard.createCard(workingMan.card);  //заполняем карту

        User workingMan2 = new User(); //создаем 2 рабочего
        ServicesUser.createWorking(workingMan2);
        ServisesBankCard.createCard2(workingMan2); //№3.1 метод принимает рабочего и заполняет его карту если ее нет

        ServisesBankCard.remakeNumberCard(workingMan.card); //№3.2 метод, который принимает карту и возвращает её номер в маскированном виде*/

        //System.out.println(Collection.people);
        //System.out.println(Collection.people1);

    }
}
