package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Arrays;

public class SQ35_array {
    public static void main(String[] args) {
        /*
        ------------------------------------------------------------------------------------------------------------------
   Soru 35-)
   Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
   		--> toCharArray() yöntemini kullanmayın
   Örnek:
   		String isim:    Yakup
   		char arr[]:     [Y,a,k,u,p]
   İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
    Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

         */

        String isim= "Yakup";

        kelimleriBol(isim);

    }

    private static void kelimleriBol(String isim) {

        char[] chars = new char[isim.length()];

        for (int i = 0 ; i < chars.length ; i++) {
            chars[i] = isim.charAt(i);
        }
        System.out.println(Arrays.toString(chars));

    }
}
