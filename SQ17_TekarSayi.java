package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ17_TekarSayi {
    public static void main(String[] args) {

        /*
        Soru 17-)
    Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
     ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
    Örnek:
    char ch1=            'a'
    String name =     "Ali bakkala geç gitti."
    Beklenen Çıktı=    a sayısı = 3
    Ipucu:
    Loop döngülerini hatırlayalım.
    While döngüsü kullanabilirsiniz!
    Sayac adlı bir int variable oluşturarak ,
    bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
         */


        String name ="Ali bakkala geç gitti.";
         char tekrarKrkt='a';
        int sayac=0;

        for (int i = 1; i <name.length() ; i++) {
           {
                if (name.charAt(i)== (char)(tekrarKrkt)){

                    sayac++;

                }


           }

            System.out.println("tekrarlanan karakter sayisi=" +sayac);

            }

            }
        }





