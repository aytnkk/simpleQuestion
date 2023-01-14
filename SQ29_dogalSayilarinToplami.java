package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ29_dogalSayilarinToplami {
    public static void main(String[] args) {
        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
      İpucu: Loop kulanabilirsiniz
         */

        int toplam=0;

        for (int i =1; i <=100; i++) {
            toplam +=i;


        }
        System.out.println("dogal sayilarin toplami : "  + toplam);
    }

}
