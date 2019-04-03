package services;

public class GenerationId {

    public String createId() {
        int rand;
        int result;

        char[] massChar = new char[40];
        for (int i = 0; i < massChar.length; i++) {
            rand = (int) (Math.random() * 2) + 1;
            if (rand == 1) {
                result = (int) (Math.random() * 10) + 48;
                massChar[i] = (char) result;
            }
            if (rand == 2) {
                result = (int) (Math.random() * 26) + 97;
                massChar[i] = (char) result;
            }
        }
        String id = String.valueOf(massChar); //преобраз массив чаров в строку
        System.out.println(id);

        return id;
    }
}
