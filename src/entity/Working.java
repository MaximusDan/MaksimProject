package entity;

public class Working {

    public String name;
    public int age;
    public String work;
    public String department;
    public int money;
    public int yearsWorking;
    public BankCard card;

    public Working(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Working(int age, String name) {
    }

    public Working(int money) {
    }

    public Working(double money) {
    }

}
