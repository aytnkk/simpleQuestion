package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ42_Array {
    public static void main(String[] args) {
        /*
        Soru 42-)
    Parametre olarak birden fazla tamsayı (integer) kabul eden
    ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
    Method name=sum
    eğer metodu bu şekilde çağırırsanız

         toplam(1,2,3) çıktı =6
    	 toplam(1,2,3,4,5) çıktı =15
    	 sum(1,2) output=3
    Ipucu:  varargs sorusu, varargs olusturalım
             */


        toplamaİşlemi(1,2,3,4,5);


    }

    public static void toplamaİşlemi(int... sayılar)
    {
        int topla=0;

        for (int i = 0; i <sayılar.length+1 ; i++)
        {

            topla =topla+i;



        }System.out.println(topla);

    }
}
