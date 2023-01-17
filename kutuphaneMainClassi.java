package day00_ahmetHocaDersleri.simpleQuestions;

public class kutuphaneMainClassi {
    public static void main(String[] args) {

        kutuphaneClassi nesne=new kutuphaneClassi();
        System.out.println(nesne.acilisSaati);
        System.out.println(nesne.kapanisSaati);
        System.out.println(nesne.kitapSayisi);


        nesne.calistir();
        nesne.durdur();
    }
}
