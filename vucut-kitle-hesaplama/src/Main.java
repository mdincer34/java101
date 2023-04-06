import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        Scanner inp = new Scanner(System.in);
        double boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kg = inp.nextDouble();
        double vki = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}