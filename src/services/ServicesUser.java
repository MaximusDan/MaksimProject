package services;

import entity.User;

public class ServicesUser {

    public static void createUser(User user) {

        user.name = "Максим";
        user.age = 20;
        user.work = "Прогер";
        user.department = "Java";
        user.money = 1000;
        user.yearsWorking = 5;
    }
}
