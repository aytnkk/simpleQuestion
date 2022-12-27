package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ14_yinelenenKarakter {
    public static void main(String[] args) {

        /*
        Soru 14-)
     Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
      Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
     İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
      değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
     Ipucu:
     IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 3 harfli bir isim giriniz ");
        String name=scan.nextLine().toLowerCase();

        if (name.length()>3) {
            System.out.println("gecersiz giris, lutfen tekrar deneyiniz");

        } else {

            if (name.charAt(0)==name.charAt(1)) {
                System.out.println("dize yenilenen karaktere sahip");
            } else if (name.charAt(0)==name.charAt(2) ) {
                System.out.println("dize yenilenen karaktere sahip");
            } else if (name.charAt(1)==name.charAt(2) ) {
                System.out.println("dize yenilenen karaktere sahip");
            } else {
                System.out.println("Dize benzersiz karakterlere sahip");
            }
        }

        System.out.println("==============ternary=================");

        System.out.println( name.length()>3 ? "gecersiz giris ,yeniden deneyin!"
                        : ( (name.charAt(0)==name.charAt(1)) || (name.charAt(0)==name.charAt(2))
                        || ( name.charAt(1)==name.charAt(2))
                        ? "dize yenilenen karaktere sahip"
                        : "Dize benzersiz karakterlere sahip" ) );











    }

}
