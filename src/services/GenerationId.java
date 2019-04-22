package services;

public class GenerationId {

    public String createId() {
        int rand;
        int result;

        char[] massChar = new char[40];
        for (int i = 0; i < massChar.length; i++) {
            rand = (int) (Math.random() * 2) + 1;
            if (rand == 1) {            //если число равно 1 то генерируется рандомная цифра
                result = (int) (Math.random() * 10) + 48;
                massChar[i] = (char) result;
            } else {                       //если число не равно 1 то генерируется рандомная буква
                result = (int) (Math.random() * 26) + 97;
                massChar[i] = (char) result;
            }
        }
        return String.valueOf(massChar); //преобраз массив чаров в строку и возвращаем
    }
}
