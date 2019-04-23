package storage;
import java.util.ArrayList;

import entity.User;
import entity.BankCard;

public class Collection {

    public static ArrayList<User> people = new ArrayList<User>() {{
        add(new User("Вася",23,"прогер","Java",1000,3,"Lomak123","Zrhenzrhen145"));
        add(new User("Петя",22,"тестер","Javascript",500,5,"Llomallomak123","Zrhen145"));
        add(new User("Гриша",21,"прогер","Javascript",1000,2,"Klon1234","Zrhen145156"));
        add(new User("Миша",20,"прогер","Java",500,3,"Klonklon1234","Zrhen1"));
        add(new User("Даша",23,"тестер","Javascript",1000,1,"Zaken1234","Zrhenzrhen1"));
        add(new User("Маша",22,"тестер","Java",500,7,"Zakenzaken1234","Zrhenzrhenzrhen1"));
        add(new User("Максим",21,"прогер","Javascript",1000,3,"Qwerty123","Zrhenzrhenzrhen1"));
        add(new User("Юра",26,"прогер","Javascript",1000,5,"Qwertyqwerty123","Zrhenzrhenzrhen12"));
        add(new User("Серый",23,"прогер","Java",500,3,"Troxtrox123","Zrhenzrhenzrhen145"));
        add(new User("Вася",25,"тестер","Java",1000,4,"Trox123","Zrhenzrhenzrhen145156"));
    }};


    public static ArrayList<BankCard> peopleBankCard = new ArrayList<BankCard>() {{
        add(new BankCard(234.4,"11223344","зарплатная",true,"09875324"));
        add(new BankCard(999.4,"11223345","зарплатная",false,"09876345"));
        add(new BankCard(888.4,"11223346","зарплатная",true,"098765"));
        add(new BankCard(347548.5,"11223347","зарплатная",false,"0987654"));
        add(new BankCard(575.4,"11223348","зарплатная",true,"09876543"));
        add(new BankCard(212434.4,"11223354","зарплатная",true,"09873"));
        add(new BankCard(4566.557,"11223558","зарплатная",false,"098734"));
        add(new BankCard(2456.2,"11223359","зарплатная",true,"0987345"));
        add(new BankCard(258634.45,"11223357","зарплатная",true,"09873455"));
        add(new BankCard(29784.4,"11223355","зарплатная",false,"0987234"));

    }};



    /* Старые задания
    public static ArrayList<User> people1 = new ArrayList<User>();
    public static void test(){

    User working1 = new User("Вася",23,"прогер","Java",1000,3);
    User working2 = new User("Петя",22,"тестер","Javascript",500,5);
    User working3 = new User("Гриша",21,"прогер","Javascript",1000,2);
    User working4 = new User("Миша",20,"прогер","Java",500,3);
    User working5 = new User("Даша",23,"тестер","Javascript",1000,1);
    User working6 = new User("Маша",22,"тестер","Java",500,7);
    User working7 = new User("Максим",21,"прогер","Javascript",1000,3);
    User working8 = new User("Юра",26,"прогер","Javascript",1000,5);
    User working9 = new User("Серый",23,"прогер","Java",500,3);
    User working10 = new User("Вася",25,"тестер","Java",1000,4);

        people1.add(working1);
        people1.add(working2);
        people1.add(working3);
        people1.add(working4);
        people1.add(working5);
        people1.add(working6);
        people1.add(working7);
        people1.add(working8);
        people1.add(working9);
        people1.add(working10);
    }*/



}
