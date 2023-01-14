package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ22_obebOkek {
    public static void main(String[] args) {
        /*
          Soru 22-)
  Kullanıcıdan 2 tamsayı girmesini isteyin,
   ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
  Giriş :
  30 ve 40

  Beklenen Çıktı:
  30 ve 40 için EBOB= 10
  30 ve 40 için EKOK= 120
  ipucu:
  Loopları kullanarak çözebiliriz.
  İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
         */

        int sayi1 = 30;
        int sayi2 = 40;
        int ebob = 1;


        for (int i = 1; i <= sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;


            }
        }
        System.out.println(sayi1 + " ve " + sayi2 + " icin ebob " + ebob);
        System.out.println(sayi1 + " ve " + sayi2 + " icin ekok " + (sayi1*sayi2)/ebob);
    }
}