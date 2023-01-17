package day00_ahmetHocaDersleri.simpleQuestions;

public class forloopMath {
    public static void main(String[] args) {

        // forloop kullanarak verilen sayii´nin karakokunu consola yazdirin

        int sayi=36;
      //  System.out.println(Math.pow(7,2)); 49.0  bu yontem matematiksel islemleri yapiyor
        // System.out.println(Math.sqrt(7));// 49.0  bu da karekok aliyor

        double karekok=1;

        for (double i =1.000 ; i*i <=sayi ; i+=0.001) {
            karekok=i;

        }
        String format=String.format("%5f" ,karekok);
        System.out.println(format);
        }

    }
