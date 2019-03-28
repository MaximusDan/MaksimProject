package entity;

public class BankCard {

    public double balance;
    public String numberCard;
    public String nameCard;
    public boolean opportunities;  //возможности
    public String pin;


    public BankCard(double balance, String numberCard, String nameCard, boolean opportunities, String pin){
        this.balance = balance;
        this.numberCard = numberCard;
        this.nameCard = nameCard;
        this.opportunities = opportunities;
        this.pin = pin;
    }
}

