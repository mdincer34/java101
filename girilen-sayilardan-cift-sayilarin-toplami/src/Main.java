import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0, num;
        boolean isEven = true;

        Scanner inp = new Scanner(System.in);
        while (isEven) {
            System.out.print("Sayı giriniz : ");
            num = inp.nextInt();
            if (num % 2 != 0) {
                isEven = false;
            }
            else if (num % 4 == 0) {
                total += num;
            }
        }
        if (total != 0) {
            System.out.println("Girdiğiniz sayılardan 4'ün katı olan sayıların toplamı : " + total);
        } else {
            System.out.println("Girdiğiniz sayı veya sayılar içerisinde 4'ün katı sayı bulunamadı.");
        }
    }
}