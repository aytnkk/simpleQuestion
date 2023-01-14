package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SQ31_ArraySorusu {
    public static void main(String[] args) {

        /*
        Soru 31-)
       Kullanıcıdan Arrayin uzunlugunu isteyin.
       Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
       İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen array'in uzunlugunu girin");
        int arrayUzunlugu=scan.nextInt();
        int[] arr=new int[arrayUzunlugu];
        System.out.println("lutfen elemanlari giriniz");

        for (int i = 0; i <arr.length ; i++) {
            int elemanlar=scan.nextInt();
           arr[i]=elemanlar;
        }

        System.out.println(Arrays.toString(arr));


        System.out.println("*************** String Elemanlar  ***********");

        Scanner scann=new Scanner(System.in);
        System.out.println("Lütfen array'in uzunlugunu giriniz");
        int arrayUzunlugu2= scan.nextInt();

        String []arrstr=new String[arrayUzunlugu2];
        System.out.println("Lütfen array'in elemanlarini giriniz");

        for (int j = 0; j < arrayUzunlugu2; j++) {
            arrstr[j]=scan.next();
        }
        System.out.println("Olusturulan Array:  "+ Arrays.toString(arrstr));


    }




    }
