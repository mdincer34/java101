/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double heat;
        System.out.print("Hava sıcaklığını giriniz : ");
        Scanner inp = new Scanner(System.in);
        heat = inp.nextInt();
        if (heat < 5) {
            System.out.println("Kayak");
        } else if (heat <= 25) {
            if (heat >= 15) {
                System.out.println("Piknik");
            } else {
                System.out.println("Sinema");
            }
        } else {
            System.out.println("Yüzme");
        }
    }
}