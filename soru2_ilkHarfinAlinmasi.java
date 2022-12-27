package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class soru2_ilkHarfinAlinmasi {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir harf isteyin.
        Kullanıcı birden fazla harf girerse ilk harfin alınmasını sağlayın. (Ö,İ,Ü işleme alınmasın)
        Ayrıca girilen harfte büyük küçük olmasını göz ardı edin.
                Harf sesli harf ise harf sesli bir harftir, değilse girilen harf sesli harf değildir yazdırın.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf=scan.nextLine().toUpperCase().substring(0,1);



        switch (harf){

            case "A","E","I","O","U":
                System.out.println("girilen harf sesli harftir");
                break;
            default:
                System.out.println("girilen harf sesli harf degildir");



                System.out.println("=========char ve if ile cozum====");

                Scanner sc=new Scanner(System.in);
                System.out.println("lutfen bir harf giriniz");
                char harf1 = scan.next().toUpperCase().charAt(0);

                if (harf1>='A' && harf1<= 'Z'){
                    if(harf1=='A'|| harf1=='E'|| harf1=='I'|| harf1=='O'|| harf1=='U')
                        System.out.println("sesli harf");

                    else System.out.println("sesli harf değildir");
                }
                else System.out.println("geçersiz giriş");


        }


    }
}
