import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14;

        System.out.print("Dairenin yarı çapını giriniz : ");
        Scanner inp = new Scanner(System.in);

        int r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
    }
}