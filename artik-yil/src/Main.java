import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();
        boolean artik;
        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                artik = yil % 400 == 0;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if(artik)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");
    }
}