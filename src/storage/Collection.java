package storage;
import java.util.ArrayList;
import entity.Working;
import entity.BankCard;

public class Collection {

    public static ArrayList<Working> people = new ArrayList<Working>() {{
        add(new Working("Вася",23,"прогер","Java",1000,3));
        add(new Working("Петя",22,"тестер","Javascript",500,5));
        add(new Working("Гриша",21,"прогер","Javascript",1000,2));
        add(new Working("Миша",20,"прогер","Java",500,3));
        add(new Working("Даша",23,"тестер","Javascript",1000,1));
        add(new Working("Маша",22,"тестер","Java",500,7));
        add(new Working("Максим",21,"прогер","Javascript",1000,3));
        add(new Working("Юра",26,"прогер","Javascript",1000,5));
        add(new Working("Серый",23,"прогер","Java",500,3));
        add(new Working("Вася",25,"тестер","Java",1000,4));
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
    public static ArrayList<Working> people1 = new ArrayList<Working>();
    public static void test(){

    Working working1 = new Working("Вася",23,"прогер","Java",1000,3);
    Working working2 = new Working("Петя",22,"тестер","Javascript",500,5);
    Working working3 = new Working("Гриша",21,"прогер","Javascript",1000,2);
    Working working4 = new Working("Миша",20,"прогер","Java",500,3);
    Working working5 = new Working("Даша",23,"тестер","Javascript",1000,1);
    Working working6 = new Working("Маша",22,"тестер","Java",500,7);
    Working working7 = new Working("Максим",21,"прогер","Javascript",1000,3);
    Working working8 = new Working("Юра",26,"прогер","Javascript",1000,5);
    Working working9 = new Working("Серый",23,"прогер","Java",500,3);
    Working working10 = new Working("Вася",25,"тестер","Java",1000,4);

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
