package dao;
import entity.Working;
import storage.Collection;
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
}
