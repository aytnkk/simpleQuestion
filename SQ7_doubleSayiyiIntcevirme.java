package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ7_doubleSayiyiIntcevirme {
    public static void main(String[] args) {

        /*
        Soru 7-)  Kullanicidan Double türünde bir sayi alin.
         Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
      (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
      ipuclari:
      Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim. (edited)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütffen double türünde bir sayı girin: ");
        double sayi=scan.nextDouble();

        int sayi1= (int)sayi;
        System.out.println("Girdiginiz sayının tam sayı hali : " + sayi1);

    }

}
