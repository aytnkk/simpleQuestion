package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ8_BasamaklarToplami {
    public static void main(String[] args) {

        /*
        Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
         Bölme islemi kullanarak sayinin basamaklarini alalim
         ve toplam adli bir konteynira (Variable) atalim. (edited)
         */

        int sayi =123;
        int toplam=0;

        toplam+=sayi%10;
        sayi=sayi/10;

        toplam+=sayi%10;
        sayi=sayi/10;

        toplam+=sayi%10;
        sayi=sayi/10;
        toplam+=sayi;
        System.out.println("Verilen sayinin rakamlari toplami "		+ toplam + "'dur.");
    }
}
