package authorization;

import java.util.Scanner;
import storage.Collection;
import entity.User;
public class Authorization {
    public static int www = 0;   //нужна для проверки выполнения всех условий 2 пункта в задаче.
    public static String loginAuthorization;
    public static String passAuthorization;
    public static User user1;

    public static void pusk() {
        //Authorization object = new Authorization();

        Authorization.chekLoginandPass(); //вводим пароль и логин и проверяем их на условия
        Authorization.chekLoginandPassUser();    //проверяем, что пользователь с таким логином существует
    }

    public static void chekLoginandPass() {
        boolean bol;
        while (true) {
            System.out.println("Введите логин");
            Scanner scLogin = new Scanner(System.in);
            if (scLogin.hasNextLine()) {
                loginAuthorization = scLogin.nextLine();
            }
            /*System.out.println("Введите пароль");
            Scanner scPass = new Scanner(System.in);
            if (scPass.hasNextLine()) {
                passAuthorization = scPass.nextLine();
            }*/
            bol = Authorization.chekLogin(loginAuthorization);

            if (bol) {
                break;
            }
        }
    }

    public static boolean chekLogin(String chekLogin) {
        int a;
        int b = 0;  //для проверки на заглавные буквы
        int c = 0; //для проверки на цифры
        if (chekLogin.length() < 5) {        //проверка на то, что бы логин был не менее 5 символов
            System.out.println("Логин должен быть не менее 5 символов");
            return false;
        }
        if (chekLogin.length() > 20) {        //проверка на то, что бы логин был не более 20 символов
            System.out.println("Логин должен быть не более 20 символов");
            return false;
        }
        char[] charLogin = new char[chekLogin.length()];
        for (int i = 0; i < chekLogin.length(); i++) {
            charLogin[i] = chekLogin.charAt(i);
            a = (int) charLogin[i];
            if (91 <= a && a <= 64) {       //проверка на то, что бы в логине была 1 заглавная буква.Если не попадает в этот диапазон заглавных то b++
                System.out.println("В логине должна быть 1 заглавная буква");
                return false;
            }
            if (58 <= a && a <= 47) {       //проверка на то, что бы в логине была хотябы одна цифра
                System.out.println("В логине должна быть хотябы одна цифра");
                return false;
            }
        }
        return true;
    }

    public static void chekLoginandPassUser() {
        int net = 0;
        for (int i = 0; i < Collection.people.size(); i++) {
            if (loginAuthorization == Collection.people.get(i).login) {
                user1 = Collection.people.get(i);
                break;
            }
        }
        System.out.println("Пользователя с таким логином не существует");
        return;
    }
}
