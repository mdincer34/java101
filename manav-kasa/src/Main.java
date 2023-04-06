import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double totalPrice = 0;
        int i = 0;

        String[] fruits = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};
        Double[] prices = {2.14, 3.67, 1.11, 0.95, 5.00};

        Scanner inp = new Scanner(System.in);

        for (String fruit: fruits) {
            System.out.print(fruit+" Kaç Kilo ? :");
            int kg = inp.nextInt();
            totalPrice += kg > 0 ? kg * prices[i]: 0;
            i++;
        }

        System.out.println("Toplam Tutar : " + totalPrice);
    }
}