package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SQ32_ArrayReverse {
    public static void main(String[] args) {

     /*

  Soru 32-)
  Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini,
   Reverse olarak (tersten) yazdırınız.
  İpucu:  int arrReverse[] diye bir array oluşturun ve
  kullancıya oluşturdugunuz arrayi buna tersten assign edin...
-------------------------------
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array uzunlugu giriniz : ");
        int dizi = scan.nextInt();

        Integer [] arrReverse = new Integer[dizi];

        for (int i = arrReverse.length -1 ; i >= 0 ; i--) {
            System.out.println("Lutfen bir array listesi giriniz : ");
            arrReverse[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arrReverse));




    }
}
