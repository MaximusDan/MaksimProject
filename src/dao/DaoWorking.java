package dao;
import entity.BankCard;
import entity.Working;
import storage.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class DaoWorking {

    /*МЕТОД ДОБАВЛЯЮЩИЙ ОБЪЕКТ В ХРАНИЛИЩЕ*/
    public static void addNewWorkingCollection(Working newWorking){

        Collection.people.add(newWorking);
    }

    /*МЕТОД УДАЛЯЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА ПО ИНДЕНТИФИКАТОРУ*/
    public static void deleteWorkingCollection(String id) {
        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).id.equals(id)) {
                Collection.people.remove(i);
            }
        }
    }

    /*МЕТОД УДАЛЯЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА*/
    public static void deleteWorkingCollection(Working object) {

        Collection.people.remove(object);
    }

    /*МЕТОД ДОСТАЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА ПО ИНДЕНТИФИКАТОРУ*/
    public static Working takeWorkingCollection(String id) {

        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).id.equals(id)) {
                return Collection.people.get(i);
            }
        }
        return null;
    }

    /*МЕТОД КОТОРЫЙ ЗАМЕНЯЕТ ОДИН ОБЪЕКТ В КОЛЛЕКЦИИ ДРУГИМ ПО ИНДЕНТИФИКАТОРУ*/
    public static void replaceWorking(Working object) {
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
    public static ArrayList<Working> returnListWorkingWithNullCard() {
        ArrayList<Working> newWorking = new ArrayList<>();

        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).card == null) {
                newWorking.add(Collection.people.get(i));
            }
        }
        return newWorking;
    }

    /*МЕТОД КОТОРЫЙ ВОЗВРАЩАЕТ СПИСОК ВСЕХ РАБОЧИХ У КОТОРЫХ КАРТЫ С НУЛЕВЫМ БАЛАНСОМ №10*/
    public static ArrayList<Working> returnListWorkingWithNullBallanceCard() {
        ArrayList<Working> newWorking = new ArrayList<>();

        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).card.balance == 0) {
                newWorking.add(Collection.people.get(i));
            }
        }
        return newWorking;
    }

    /*МЕТОД КОТОРЫЙ ВОЗВРАЩАЕТ СПИСОК ВСЕХ РАБОЧИХ У КОТОРЫХ СУММА НА БАЛАНСЕ БОЛЬШЕ ЧЕМ ЧИСЛО ПЕРЕДАННОЕ В МЕТОД №10*/
    public static ArrayList<Working> returnListWorking(double number) {
        ArrayList<Working> newWorking = new ArrayList<>();

        for (int i = 0; i < Collection.people.size(); i++) {
            if (Collection.people.get(i).card.balance > number) {
                newWorking.add(Collection.people.get(i));
            }
        }
        return newWorking;
    }
}