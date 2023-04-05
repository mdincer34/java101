import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ucret, km;
        System.out.print("Gidilen mesafe : ");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        ucret = (km * 2.20) + 10;
        System.out.println(ucret <= 20? "Taksimetre tutarı : 20" : "Taksimetre tutarı : " + ucret);
    }
}