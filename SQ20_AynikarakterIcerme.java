package day00_ahmetHocaDersleri.simpleQuestions;

public class SQ20_AynikarakterIcerme {
    public static void main(String[] args) {
        /*
        Soru 20-)
Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
 aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliriz.
         */
        String isim="mam";
        char benzerKrtr='m';

        if (isim.length()==3){
            if (isim.indexOf(benzerKrtr)!=isim.lastIndexOf(benzerKrtr)){
                System.out.println("dizede yinelenen karakterler var");

            }else System.out.println("dizede yenilenen karakterler yok");
            }else System.out.println("bu kadar uzun cumleyi yazamam agam");


        }

    }

