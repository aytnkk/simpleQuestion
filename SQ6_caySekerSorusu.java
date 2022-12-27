package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ6_caySekerSorusu {
    public static void main(String[] args) {

        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
          Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
          1 şeker = 1.5 gr
           kg = 1000 gram      olarak hesaplayın

          Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
         */

       Scanner scann=new Scanner(System.in);
        System.out.println("gunde kac cay iciyorsunuz");
        int cay= scann.nextInt();
        System.out.println("gunde kac gram seker kullaniyorsunuz");
        int seker= scann.nextInt();

        double userGram = (365*cay*seker*1.5) ;
        double toplamKilo = (userGram/1000) ;

        System.out.println("Yilda " + toplamKilo + " kg seker kullaniyor.");
        System.out.println( "Yilda " + (cay*365) + " içiyorsun." + "Çok fazla ağam biraz azalt :-)");



    }

}
