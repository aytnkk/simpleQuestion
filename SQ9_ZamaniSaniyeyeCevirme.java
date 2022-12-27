package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ9_ZamaniSaniyeyeCevirme {
    public static void main(String[] args) {
        /*
        Soru 9-)  Girilen zamanı saniyeye çeviriniz.
               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.
           Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen saati giriniz");
        int saat=scan.nextInt();

        System.out.println("Lütfen dakikayı giriniz");
        int dakika=scan.nextInt();

        System.out.println("Lütfen saniyeyi giriniz");
        int saniye=scan.nextInt();

        System.out.println("Girilen zamanın saniyesi: " +  ((saat*60*60)+(dakika*60)+saniye) + " saniye" );

    }
}
