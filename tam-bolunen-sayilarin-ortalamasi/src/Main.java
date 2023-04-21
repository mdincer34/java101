import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toplam = 0, sayiSayisi = 0;
        double ortalama;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayiSayisi++;
            }
        }

        ortalama = (double) toplam / sayiSayisi;

        System.out.println("0'dan " + sayi + "'a kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
    }
}
