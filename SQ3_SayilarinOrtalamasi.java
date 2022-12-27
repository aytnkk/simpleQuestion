package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ3_SayilarinOrtalamasi {
    public static void main(String[] args) {


        /*
        Soru 3-)   SCANNER
          Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
          Ipuclari:
          * Sayilarin ortalamasi: toplam/5
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 tane sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        int sayi4 = scan.nextInt();
        int sayi5 = scan.nextInt();

        int toplam=(sayi1+sayi2+sayi3+sayi4+sayi5);

        int ortalama=toplam/5;
        System.out.println(ortalama);

    }
}
