package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ23_faktoriyel{
    public static void main(String[] args) {

        /*
        Soru 23-)
    Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
    Method bize çıktıyı döndürsün.
    Örnek:
    Girdi: 6
    Çıktı: 6!=654321=720
    ipucu: Aldıgınız sayıyı methoda gönderin.
    Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */

        int sayi=7;

        System.out.print(sayi + "!=");
        System.out.println("1=" +faktoriyelHesaplama(sayi));

    }
    private static int faktoriyelHesaplama(int sayi) {
        int carpim=1;

        for (int i = sayi; i >=2 ; i--) {
                carpim *=(i);
            System.out.print(i + "*");
            }
        return carpim;

            }

    }

