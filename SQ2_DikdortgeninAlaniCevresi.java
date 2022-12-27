package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ2_DikdortgeninAlaniCevresi {
    public static void main(String[] args) {

       /*
        Soru-2)
        Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                Ipuclari:
           * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
           * Dikdortgenin Alani : uzun kenar * kisa kenar

        */

       int uzunKenar=9;
        int kisaKenar=3;

        int dikDortgeninCevresi=2*(uzunKenar+kisaKenar);
        int dikDortgeninAlani=uzunKenar*kisaKenar;


        System.out.println(dikDortgeninCevresi);
        System.out.println(dikDortgeninAlani);

    }
}
