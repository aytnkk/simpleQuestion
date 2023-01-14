package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ26_MukemmelSayi {
    public static void main(String[] args) {


		 /*
		 soru:26
   Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
   NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
   Örnek:
   Giriş :6
   Çıkış: 6 Mükemmel Sayıdır
   Giriş :7
   Çıkış:7 Mükemmel Sayı Değildir
   ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz :wink:
         */

        int sayi = 9;
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;


            }
        }
        if (sayi == toplam)
            System.out.println(sayi + "sayi mukemmel sayidir");
            else System.out.println(sayi + " mukemmel degildir");

            }

            }
