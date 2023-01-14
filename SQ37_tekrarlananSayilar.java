package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.ArrayList;

public class SQ37_tekrarlananSayilar {
    public static void main(String[] args) {
        /*
        Soru 37-)
  --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
  (Eliminate duplicates)
  ENG:
  Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
  Write a test program that reads in ten integers, invokes the method, and displays the result.
  (Tekrarlananları çıkar)
  TÜR:
  Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
  On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
  ---->>>
  public static int[] eliminateDuplicates(int[] list)
  ÖRNEK:
  On sayi giriniz:
  1 2 3 2 1 6 3 4 5 2
  ÇIKTI:
  Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
         */

            int[] arrA = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};

            eliminateDuplicates(arrA);

    }

    private static void eliminateDuplicates(int[] arrA) {

        ArrayList list = new ArrayList<Integer>();

        for (int i = 0; i < arrA.length; i++) {
            if (!list.contains(arrA[i])) {
                list.add(arrA[i]);
            }
        }
        System.out.println("Birbirinden farkli girilen sayilar:"+ list) ;
            }
        }

