package day00_ahmetHocaDersleri.simpleQuestions;

public class whileRakamlarToplami {
    public static void main(String[] args) {

        /*
        355 sayisinin rakamlar toplamini while loop kullanarak consola yazdirin

         */


       /*
       manuel yapim:
        int sayi=355;
        int birlerBasamagi=sayi%10;//5
        sayi=sayi/10;//35
        int onlarBasamagi=sayi%10;//5
          sayi=sayi/10;//3
        int yuzlerBasaamgi=sayi%10;//3
        sayi=sayi/10;//0

        */
         int sayi=3555;
        int basamakDegeri=0;
        int toplam=0;

        while (sayi>0){
       basamakDegeri=sayi%10;
       toplam+=basamakDegeri;
       sayi/=10;
        }
        System.out.println("toplam:" + toplam);
    }
}
