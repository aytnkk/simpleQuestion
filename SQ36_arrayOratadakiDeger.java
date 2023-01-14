package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ36_arrayOratadakiDeger {
    public static void main(String[] args) {
        /*
        Soru 36-)
Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
 ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
Örnek:
inputarr[]=   {1,2,3,4,5,6,7}
output:         4
İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
 Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
  Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
-------------------------------------------------------------------------------------
         */
       int  inputarr[]={1,2,3,4,5,6,7};

       ortadakiDeger(inputarr);


    }

    private static void ortadakiDeger(int[] inputarr) {
       int ortaIndex=0;

 if (inputarr.length%2!=0){
     ortaIndex = (inputarr.length + 1) / 2;
     System.out.println(ortaIndex);
        }else{
     ortaIndex=(inputarr.length ) / 2;
 }
        System.out.println(ortaIndex);
    }
}
