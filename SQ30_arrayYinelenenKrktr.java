package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Arrays;



public class SQ30_arrayYinelenenKrktr {
    public static void main(String[] args) {

        /*
        Soru 30-)
   Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
   ( mülakat sorusu )
   Örnek:
   String str="Javacokkolay"
   Yinelenen karakterler : [a, o, k]
   İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
    Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıp konteynıra atacaksınız
    bu yüzden iç içe loop kullanmak mantıklı duruyor
         */


        String[] str = {"Javacokkolay"};

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {

                if (str[i].equals(str[j])) {


                }
                System.out.println("yinelenen karakterler" + str[i]);

            }

        }

    }
}

