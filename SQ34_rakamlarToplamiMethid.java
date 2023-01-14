package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.ArrayList;
import java.util.List;

public class SQ34_rakamlarToplamiMethid {
    public static void main(String[] args) {

        /*
         Soru 34-)
         Bir String'i parametre olarak kabul eden ve
         verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

         Örnek
         String str : ade1r4d3
         Int toplam : 8
         İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
         Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
*/

        String str ="ade1r4d3";

       rakamlarToplami(str);



    }

    private static void rakamlarToplami(String str) {

        int toplam=0;
        List<Integer> digits=new ArrayList<Integer>();


        for (int i = 0; i < str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                toplam += Integer.valueOf(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(toplam);
        }

            
        }




