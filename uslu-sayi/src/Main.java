import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, amac = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        a = inp.nextInt();
        System.out.print("Üs olacak sayı : ");
        b = inp.nextInt();
        for (int i = 1; i <= b; i++) {
            amac = amac * a;
        }
        System.out.println(amac);
    }
}