package services;

import entity.Working;

public class ServicesWorking {

    public static void createWorking(Working working) {

        working.name = "Максим";
        working.age = 20;
        working.work = "Прогер";
        working.department = "Java";
        working.money = 1000;
        working.yearsWorking = 5;
    }
}
