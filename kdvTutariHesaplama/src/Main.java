/*
* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
*  KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak
* KDV tutarı hesaplayan programı yazınız.

* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat, kdv;

        // fiyat bilgisi alınır
        System.out.print("Lütfen fiyat bilgisi giriniz : ");
        Scanner input = new Scanner(System.in);
        fiyat = input.nextDouble();

        // kdv oranı belirlenir
        kdv = (fiyat <= 1000) ? 1.18 : 1.08;

        //Çıktı verilir
        System.out.println("KDV'siz Fiyat = " + fiyat);
        System.out.println("KDV'li Fiyat = " + fiyat * kdv);
        System.out.println("KDV tutarı = " + ((fiyat * kdv) - fiyat));
    }
}