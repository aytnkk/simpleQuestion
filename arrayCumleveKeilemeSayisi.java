package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class arrayCumleveKeilemeSayisi {
    public static void main(String[] args) {

        // kullanicidan aldigin bir parametrede kac tane cumle,kelime ve karakter oldugunu yazininiz


        Scanner scan=new Scanner(System.in);
        System.out.println("please, you enter a text  ");
        String  text=scan.nextLine();

        String[] sentence =text.split("\\.");
        String[] kelimeler=text.split(" ");
        String[] karakterler=text.split("");

        System.out.println("cumle sayisi:" + sentence.length);
        System.out.println("kelime sayisi:" + kelimeler.length);
        System.out.println("karakter sayisi :" + karakterler.length);
    }
}
