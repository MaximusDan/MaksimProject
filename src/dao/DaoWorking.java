package dao;
import entity.Working;
import storage.Collection;
import static storage.Collection.people;
import java.util.Scanner;

public class DaoWorking {


    /*МЕТОД ДОБАВЛЯЮЩИЙ ОБЪЕКТ В ХРАНИЛИЩЕ*/
    public static void addNewWorkingCollection(Working newWorking){
        people.add(newWorking);
    }

    /*МЕТОД УДАЛЯЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА ПО ИНДЕНТИФИКАТОРУ*/
    public static void deleteWorkingCollection(){
        System.out.println("Введите номер ID обьктакта,который Вы хотите удалить");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        for(int i = 0; i < people.size(); i++){
            if(people.id.equals(number) = true){
                people.remove(i);
            }
        }
    }

    /*МЕТОД ДОСТАЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА ПО ИНДЕНТИФИКАТОРУ*/
    public static void takeWorkingCollection(){
        System.out.println("Введите номер ID обьктакта,который Вы хотите достать");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        for(int i = 0; i < people.size(); i++) {
            if (people.id.equals(number)) {
                return people(i);
            }
        }
    }
}
