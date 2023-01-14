package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ18_hizsorusu {
    public static void main(String[] args) {
        /*
          Soru 18-)
         Girilen araç hızı ve yol kilometresinden,
         gidilen yere varış süresini hesaplayan bir method yazalım.
          Kullanıcıya hızını ve kilometreyi soralım,
          bunu methoda gönderelim ve bize varış süremizi hesaplasın
         İpucu:
         yol=Hız*zaman
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen saatteki hizinizi giriniz");
        double hiz = scan.nextDouble();

        System.out.println("Lutfen kac km yol gideceginizi giriniz");
        double yol=scan.nextDouble();

        varisSuresi(hiz,yol);


    }

    private static void varisSuresi(double hiz, double yol) {


        double sure=yol/hiz;
        int saat=(int)sure;
        double  dakika=sure*60;
        dakika=(int)dakika%60;

        System.out.println("Hedefinize " +saat+ " saat "+ dakika + " dakika sonra varirsiniz");

    }
}
