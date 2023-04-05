import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce;

        System.out.print("Mat notunuzu girin : ");
        Scanner input = new Scanner(System.in);
        mat = input.nextInt();

        System.out.print("Fizik notunuzu girin : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu girin : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu girin : ");
        turkce = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce);
        double ort = (toplam / 4);
        System.out.println("Not ortalamanız : " + ort);
        System.out.println(ort >= 60? "Geçtiniz.." : "Kaldınız.");
    }
}