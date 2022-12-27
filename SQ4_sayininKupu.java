package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ4_sayininKupu {
    public static void main(String[] args) {
        /*
        Soru 4-)   SCANNER
      Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
      Ipuclari:
      * Sayinin küpü: sayi*sayi*sayi
         */

       double sayi=3;
        double sayininKupu=sayi*sayi*sayi;
        System.out.println((int)(sayininKupu/2));


        System.out.println("============2.cozum========");

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: \n");
        int sayi1=scan.nextInt();
        System.out.println
                ("Sayinin küpünün yarisi: " + (sayi1*sayi1*sayi1)/2);
    }
}
