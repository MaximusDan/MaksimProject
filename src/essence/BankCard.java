package essence;

public class BankCard {

    public double balance;
    public String numberCard;
    public String nameCard;
    public boolean opportunities;  //возможности
    public String pin;


    public void createCard(){

        balance = 1000.0;
        numberCard = "1";
        nameCard = "Альфа-банк";
        opportunities = true;
        pin = "1234";
    }


    public static void test(Working object){
        if(object.card == null){
            object.card = new BankCard();

        }
    }

    public static void test3(BankCard card){

    }

    public void test2(){

    }
}
