package dao;
import entity.User;
import storage.Collection;

import java.util.ArrayList;

public class DaoUser {

    /*МЕТОД ДОБАВЛЯЮЩИЙ ОБЪЕКТ В ХРАНИЛИЩЕ*/
    public static void addNewUserCollection(User newUser){

        Collection.people.add(newUser);
    }

    /*МЕТОД УДАЛЯЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА ПО ИНДЕНТИФИКАТОРУ*/
    public static void deleteUserCollection(String id) {
        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).id.equals(id)) {
                Collection.people.remove(i);
            }
        }
    }

    /*МЕТОД УДАЛЯЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА*/
    public static void deleteUserCollection(User object) {

        Collection.people.remove(object);
    }

    /*МЕТОД ДОСТАЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА ПО ИНДЕНТИФИКАТОРУ*/
    public static User takeUserCollection(String id) {

        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).id.equals(id)) {
                return Collection.people.get(i);
            }
        }
        return null;
    }

    /*МЕТОД КОТОРЫЙ ЗАМЕНЯЕТ ОДИН ОБЪЕКТ В КОЛЛЕКЦИИ ДРУГИМ ПО ИНДЕНТИФИКАТОРУ*/
    public static void replaceUser(User object) {
        for (int i = 0; i < Collection.people.size(); i++) {
            if (object.id.equals(Collection.people.get(i).id)) {
                Collection.people.get(i).name = object.name;
                Collection.people.get(i).age = object.age;
                Collection.people.get(i).department = object.department;
                Collection.people.get(i).money = object.money;
                Collection.people.get(i).yearsWorking = object.yearsWorking;
                Collection.people.get(i).card = object.card;
            }
        }
    }

    /*МЕТОД КОТОРЫЙ ВОЗВРАЩАЕТ СПИСОК ВСЕХ РАБОЧИХ У КОТОРЫХ НЕТ КАРТЫ №10*/
    public static ArrayList<User> returnListUserWithNullCard() {
        ArrayList<User> newUser = new ArrayList<>();

        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).card == null) {
                newUser.add(Collection.people.get(i));
            }
        }
        return newUser;
    }

    /*МЕТОД КОТОРЫЙ ВОЗВРАЩАЕТ СПИСОК ВСЕХ РАБОЧИХ У КОТОРЫХ КАРТЫ С НУЛЕВЫМ БАЛАНСОМ №10*/
    public static ArrayList<User> returnListUserWithNullBallanceCard() {
        ArrayList<User> newUser = new ArrayList<>();

        for (int i = 0; i < Collection.people.size(); i++) {
            if(Collection.people.get(i).card != null && Collection.people.get(i).card.balance == 0){
                newUser.add(Collection.people.get(i));
            }
        }
        return newUser;
    }

    /*МЕТОД КОТОРЫЙ ВОЗВРАЩАЕТ СПИСОК ВСЕХ РАБОЧИХ У КОТОРЫХ СУММА НА БАЛАНСЕ БОЛЬШЕ ЧЕМ ЧИСЛО ПЕРЕДАННОЕ В МЕТОД №10*/
    public static ArrayList<User> returnListUser(double number) {
        ArrayList<User> newUser = new ArrayList<>();

        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).card != null && Collection.people.get(i).card.balance > number) {
                newUser.add(Collection.people.get(i));
            }
        }
        return newUser;
    }
}