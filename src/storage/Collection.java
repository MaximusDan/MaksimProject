package storage;
import java.util.ArrayList;
import entity.Working;

public class Collection {
    public static ArrayList<Working> people1 = new ArrayList<Working>();

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
    }


    /*public static void test1() {
        ArrayList<Double> List = new ArrayList<Double>();

        List.add(3.14);
        List.add(2.14);
        List.add(5.8);

        List.remove((Double) 5.8);

        System.out.println(List);
    }*/
}
