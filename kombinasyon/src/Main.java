import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n,r,sonuc,nFaktoriyel=1,rFaktoriyel=1,farkFaktoriyel=1,fark;
        System.out.print("N sayısını giriniz: ");
        n = reader.nextInt();
        System.out.print("R sayısını giriniz: ");
        r = reader.nextInt();


        while (n < r) {
            System.out.printf("N değeri R'dan küçük olamaz! %nLütfen R için farklı bir değer giriniz : ");
            r = reader.nextInt();
        }

        fark = n - r;

        for(int i=1;i<=n;i++){
            nFaktoriyel *= i;
        }

        for(int i=1;i<=r;i++){
            rFaktoriyel*= i;
        }

        for(int i=1;i<=fark;i++){
            farkFaktoriyel*= i;
        }

        sonuc = nFaktoriyel / (rFaktoriyel*farkFaktoriyel);
        System.out.println(sonuc);
    }
}