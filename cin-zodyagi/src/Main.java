/*

*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yearOfBirth, index;
        String[] zodiacs = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        System.out.print("Doğum Yılınızı Giriniz : ");
        Scanner inp = new Scanner(System.in);
        yearOfBirth = inp.nextInt();
        index = yearOfBirth % 12;
        System.out.printf("Çin Zodyağı Burcunuz : %s", zodiacs[index]);
    }
}