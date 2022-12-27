package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class SQ10_KutleHesaplama {
    public static void main(String[] args) {
        /*
        Soru 10-)
  Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

  **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
  ullanıcıya aşağıdaki gibi mesaj verin:

  Eğer VKİ 18.5'ten az ise --> zayıfsınız
  Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
  Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
  VKİ 30'a eşit veya daha fazlaysa --> obez

                ÖRNEK :

		 Ağırlık : 71
		 Yükseklik : 1,72
		ÇIKTI : VKİ değeriniz : 23.99945916711736 Kilonuz ideal (edited)

              */

        Scanner scan=new Scanner(System.in);
        System.out.println("To see your mass index write your weight: ");
        double weight=scan.nextDouble();

        System.out.println("To see your mass index write your height: ");
        double height=scan.nextDouble();

        double vki=weight/(height*height);
        System.out.println("\nYour vki: " + vki);

        if (vki<=0) {	System.out.println("invalid login");
        }
        else if (vki<18.5) {
            System.out.println("You are weak");
        }
        else if (vki >=18.5 && vki<25 ) {
            System.out.println("your weight is ideal");
        }
        else if ( vki >=25 && vki<30  ) {
            System.out.println("you re fat");
        }
        else {  System.out.println("you re obese man!Take care ur self! :)");
        }
        }

    }

