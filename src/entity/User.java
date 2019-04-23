package entity;

public class User {

    public String name;
    public int age;
    public String work;
    public String department;
    public int money;
    public int yearsWorking;
    public BankCard card;
    public String id;
    public String login;
    public String pass;

    public User(String name, int age, String work, String department, int money, int yearsWorking, String login, String pass) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.department = department;
        this.money = money;
        this.yearsWorking = yearsWorking;
        this.login = login;
        this.pass = pass;
    }


}
