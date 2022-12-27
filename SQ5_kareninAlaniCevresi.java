package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ5_kareninAlaniCevresi {
    public static void main(String[] args) {


        /*
        Soru 5-)   SCANNER
     Kullanıcıdan karenin kenar uzunluğunu alın.
      Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
     Ipuclari:
     Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karenin kenar uzunlugunu   giriniz");

        double kenarUzunlugu = scan.nextInt();
        double kareninAlani = kenarUzunlugu * kenarUzunlugu;
        double kenarCevresi = kenarUzunlugu * 4;

        if (kenarUzunlugu > 0) {
            System.out.println("kareni alani:" + kareninAlani);
            System.out.println("karenin cevresi : " + kenarCevresi);

        } else {
            System.out.println("girilen uzunluklar geçersizdir");

        }

    }
}