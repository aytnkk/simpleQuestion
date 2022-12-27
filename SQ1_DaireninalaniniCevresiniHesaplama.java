package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ1_DaireninalaniniCevresiniHesaplama {
    public static void main(String[] args) {

       /*
       Soru 1-)   SOUT/SYSO
        Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
            * r=7;
            * Pi=3.14
                * Dairenin Cevresi : 2*Pi*r
                * Dairenin Alani : Pi*r*r  (edited)

        */

        double r=7;
        double pi=3.14;
        System.out.print("Dairenin cevresi :" +(2*r*pi)+" ,"
                + "Dairenin alani : " + (pi*r*r));

        System.out.println("==============2.cozum=====");


        double daireninCevresi = (2*pi*r);
        double daireninAlani = (pi*r*r);
        System.out.println(daireninCevresi);
        System.out.println(daireninAlani);

    }
}
