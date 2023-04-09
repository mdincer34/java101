import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz :");
        a = inp.nextInt();
        System.out.print("1. Sayıyı giriniz :");
        b = inp.nextInt();
        System.out.print("1. Sayıyı giriniz :");
        c = inp.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        }else {
            if (b > a) {
                System.out.println("c > b > a");
            } else {
                System.out.println("c > a > b");
            }
        }
    }
}