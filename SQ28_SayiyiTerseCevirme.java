package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ28_SayiyiTerseCevirme {
    public static void main(String[] args) {

        /*
        Soru-28)
      Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
      Örnek:
            Sayı: 1238
            Sayının Tersi: 8321
      İpucu:  Loop kullanabilirsiniz.
         */

        int sayi = 1238;
        int tersSayi = 0;


        for (int i = 0; i <=sayi ; i++) {
            tersSayi=tersSayi*10+(sayi%10);
            sayi=sayi/10;

        }
        System.out.print(tersSayi);


        System.out.println(" ");





            while (sayi != 0) {
                tersSayi = tersSayi * 10 +( sayi % 10);
                sayi /= 10;

            }
            System.out.print(tersSayi);

        }
    }

