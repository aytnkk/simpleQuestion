package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ12_sayilarintoplami{
    public static void main(String[] args) {

        /*
        Soru 12-)
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir-
         hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
        Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme


         */

        int sayi1 = 253246543;
        int sayi2 = 456798639;

        int sayilarinToplami =(sayi1 + sayi2);


        //Toplamın kaç basamaklı olduğunu kontrol edin



        // Eğer toplam 10 basamaklıdan fazla ise, "Fazla Yüklenme" yazdırın
        if ((sayilarinToplami)  >= 1000000000 ) {

            System.out.println("fazla yuklenme");

        } else{  //Aksi takdirde, toplamı yazdırın

            System.out.println(sayilarinToplami);

        }
        }
    }
