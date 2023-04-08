import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double ort = 0;
        int current;
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        Scanner inp = new Scanner(System.in);

        for (String ders: dersler) {
            System.out.printf("%s notunuzu girin : ",ders);
            current = inp.nextInt();
            if (current <= 100 && current >= 0) {
                ort += current;
            }
        }
        System.out.printf("Not ortalamanız : %s%n",(ort / dersler.length));
    }
}