package day00_ahmetHocaDersleri.simpleQuestions;

public class soru1_EnBuyukSayiBulma {
    public static void main(String[] args) {

      /*  Üç sayı kabul eden ve en büyük sayıyı bulan Java programını yazınız.
        ornek:
      • Giriş:
        İlk sayı: 4
        İkinci sayi: 8
        Üçüncü sayı: 1

     • Çıktı:
        En büyük sayı: 8

       */

        int sayi1=9;
        int sayi2=8;
        int sayi3=1;

        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println("En buyuk sayi :" +sayi1);

        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("En buyuk sayi :" + sayi2);

        } else if (sayi3>sayi1 && sayi3>sayi2) {
            System.out.println("En buyuk sayi : "+ sayi3);

        }
        System.out.println("=============ternary ile cozum==================");

        System.out.println(sayi1>sayi2 && sayi1>sayi3 ?("En buyuk sayi :" +sayi1 )
                : sayi2>sayi1 && sayi2>sayi3 ? ("En buyuk sayi :" + sayi2) :("En buyuk sayi : "+ sayi3) );

    }
}
