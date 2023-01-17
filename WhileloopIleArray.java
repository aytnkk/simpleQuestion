package day00_ahmetHocaDersleri.simpleQuestions;

public class WhileloopIleArray {
    public static void main(String[] args) {
        //verilen stringi yazdirin

        String[] isimler = {"Hamza", "yahya", "ayse", "fatma"};
        int index = 0;

        while (index < isimler.length) {
            if (isimler[index].equalsIgnoreCase("ayse")) {
                System.out.println("ayse ismi array icinde var");

            }

            index++;
        }
    }
}
