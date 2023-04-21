import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sınırı giriniz : ");
        number = input.nextInt();
        System.out.printf("4'ün girdiğiniz sayıya kadar olan kuvvetleri : %n-------------------%n");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }
        System.out.println();
        System.out.printf("5'in girdiğiniz sayıya kadar olan kuvvetleri : %n-------------------%n");
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}