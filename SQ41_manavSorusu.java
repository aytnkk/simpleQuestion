package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SQ41_manavSorusu {
    public static void main(String[] args) {

        /*   * Basit bir 5 ürünlü manav alisveris programi yaziniz
      2. Adim : Baska bir urun almak isteyip istemedigini sor.
      istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi
                bitirmek isteyene kadar tekrarla.
      3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
      4. Adim : Alisveris bitince toplam odemesi gereken tutari goster

         */

        List<String> liste=new ArrayList<>();

       String[] urunler={"cay","seker","tuz","domates","patates"};
       double[] urunFiyati={4.5,3.5,1.5,5.5,2.5};

       Scanner scan=new Scanner(System.in);
       System.out.println("baska urun almak istermisiniz? :" +"\nEvet :E" + "\nHayir: H");
        String cevap=scan.next();


         int toplam= 0;
        for (int i = 1; i < urunler.length ; i++) {
        ;
        }



    }
}
