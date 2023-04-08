import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        n2 = inp.nextInt();
        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Bölme\n4 - Çarpma");
        select = inp.nextInt();
        switch (select) {
            case 1 -> System.out.println("Toplama : " + (n1 + n2));
            case 2 -> System.out.println("Çıkarma : " + (n1 - n2));
            case 3 -> {
                if (n2 != 0) {
                    System.out.println("Bölme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez !");
                }
            }
            case 4 -> System.out.println("Çarpma : " + (n1 * n2));
            default -> System.out.print("Yanlış bir işlem girdiniz.");
        }
    }
}