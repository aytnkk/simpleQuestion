package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Arrays;

public class SQ41_Array {
    public static void main(String[] args) {
        /*
        Soru 41-)
          Parametre olarak 2 Int Array kabul eden ve
          2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
         */
        int[] input1 = {1, 2, 3, 4};
        int[] input2 = {5, 6};

        System.out.println(Arrays.toString( yeniArr(input1,input2)));



    }

    public static int[] yeniArr(int [] sayı1, int [] sayı2 ){

        int [] yeniArr =new int[sayı1.length+sayı2.length];

        for (int i = 0; i <sayı1.length ; i++)
        {
            yeniArr[i]=sayı1[i];
        }
        for (int i =  0; i < sayı2.length; i++)
        {
            yeniArr[sayı1.length + i]=sayı2[i];
        }
        return yeniArr;

    }
}
