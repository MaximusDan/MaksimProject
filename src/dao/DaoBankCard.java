package dao;

import entity.BankCard;
import storage.Collection;

public class DaoBankCard {

    /*МЕТОД ДОБАВЛЯЮЩИЙ ОБЪЕКТ В ХРАНИЛИЩЕ*/
    public static void addNewBankCardCollection(BankCard newBankCard) {
        Collection.peopleBankCard.add(newBankCard);
    }


    /*МЕТОД УДАЛЯЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА ПО ИНДЕНТИФИКАТОРУ*/
    public static void deleteBankCardCollection(String id) {
        for (int i = 0; i < Collection.peopleBankCard.size(); i++) {
            if (Collection.peopleBankCard.get(i).id.equals(id)) {
                Collection.peopleBankCard.remove(i);
            }
        }
    }

    /*МЕТОД ДОСТАЮЩИЙ ОБЪЕКТ ИЗ ХРАНИЛИЩА ПО ИНДЕНТИФИКАТОРУ*/
    public static BankCard takeWorkingCollection(String id) {
        for (int i = 0; i < Collection.peopleBankCard.size(); i++) {
            if (Collection.peopleBankCard.get(i).id.equals(id)) {
                return Collection.peopleBankCard.get(i);
            }
        }
        return null;
    }
}
