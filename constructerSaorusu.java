package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class constructerSaorusu {

    /*
    Constructor Sorusu-
​
   1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
   2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
        2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
        2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
   3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
     3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
     3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
     3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.
   Puanları ve kazananı ekrana yazdırın
     */
    static  Scanner scan=new Scanner(System.in);
    int oyunuc1Puan=0;
    int oyuncu2Puan=0;

    void Constructor2(){

        System.out.println("lutfen oyuna baslamak icin bir kelime girin");
        String kelime=scan.nextLine();
        Constructor2 oyuncu2=new Constructor2();
    }
    public static void main(String[] args) {
        Constructor2 oyuncu1=new Constructor2();
    }
    void Constructor2(String kelime){
  System.out.println("girilen kelimeyi kabul ediyor musun kabul ediyorsanız E etmiyorsaniz H ye basın");
        char oyuncu2cevap=scan.next().charAt(0);
        do {
            if (oyuncu2cevap=='E'||oyuncu2cevap=='e'){
                oyunuc1Puan+=kelime.length();

                if (oyunaDevam()=='D'){
                    System.out.println("oyuncu1 kelimeye eklemek icn bir harf girin");
                    String harf=scan.next();
                    System.out.println("harf nereye eklensin kelimenin basına icin B sonuna eklenmesi icin S girin");
                    String eklenecekYer=scan.next();
                    eklenecekYer=eklenecekYer.toUpperCase();
                    if (eklenecekYer.equals("B")){
                        kelime=harf+kelime;
                    } else if (eklenecekYer.equals("S")) {
                        kelime=kelime.concat(harf);
                    }else {
                        System.out.println("hatalı giris yaptınız");
                    }


                }else {
                    System.out.println("Game Finished");
                    break;
                }
            } else if (oyuncu2cevap=='H'||oyuncu2cevap=='h') {

                System.out.println("Gecersiz kelime oyuncu2 oyunu kazandi");
            }
        }while (oyunaDevam()=='D');
        if (oyunuc1Puan>oyuncu2Puan){
            System.out.println("oyunun kazanani oyuncu 1, oyuncu puani: "+oyunuc1Puan);
        }else {
            System.out.println("oyunun kazanani oyuncu 2, oyuncu puani: "+oyuncu2Puan);
        }
    }



    private char oyunaDevam() {
        System.out.println("oyuncu1 oyuna devam etmek istiyor musunuz? devam etmek icin D oyunu bitirmek icin F ye basin");
        char oyuncu1Cevap=scan.next().charAt(0);
        System.out.println("oyuncu2 oyuna devam etmek istiyor musunuz? devam etmek icin D oyunu bitirmek icin F ye basin");
        char oyuncu2Cevap=scan.next().charAt(0);
        if ((oyuncu1Cevap=='D'||oyuncu1Cevap=='d')&&(oyuncu2Cevap=='D'||oyuncu2Cevap=='d')){
            return 'D';
        }else {
            return 'F';
        }

    }
}