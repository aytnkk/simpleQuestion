package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.ArrayList;
import java.util.List;

public class SQ40_Array {
    public static void main(String[] args) {
/*
  Soru-40)
  Bir diziyi (Array) parametre olarak kabul eden ve
  dizideki tüm elemanların toplamını döndüren bir method yazın ve ardından sonucu main methodda yazdırın.
  Örn:
  girdi : {1,2,3,4,5,6,7,8}
  çıkış: 36
  ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
 */


     int[] arr= {1,2,3,4,5,6,7,8};

        System.out.println(elelmanlarToplami(arr));


    }

    private static int elelmanlarToplami(int[] arr) {

        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
      toplam+=arr[i];

        }



return toplam;
    }
}
