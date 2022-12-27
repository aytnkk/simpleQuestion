package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ16 {
    public static void main(String[] args) {
        /*
        Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın.
     Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
     Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.

     Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
     Loopun içerisinde StringM methodlarından  yararlanalım!
         */


       String isim="cicek";

        String son3 = (isim.substring(isim.length() - 3)) +
                (isim.substring(isim.length() - 3));

        if (!(isim.length()>=5)) {
            System.out.println("luften 5 harfli yeni bir kelime giriniz");

        } else{
                System.out.println("türetilen yeni kelime : " + son3);
            }




            }


            }


