package day00_ahmetHocaDersleri.simpleQuestions;

public class H2_HesapMakainasiMain {
    public static void main(String[] args) {
        H1_HesapMakinasiClassi nesne = new H1_HesapMakinasiClassi();

        int toplam = nesne.toplama(40, 50);
        int carpma = nesne.carpma(30, 20);
        int bolme = nesne.bolme(45, 15);

        System.out.println("Toplam: " + toplam);
        System.out.println("carpma: " + carpma);
        System.out.println("bolme : " + bolme);
    }
}
