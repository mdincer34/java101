import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adı : ");
        userName = inp.nextLine();
        System.out.print("Şifre : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış.\nŞifrenizi sıfırlamak için 1 giriniz.");
            if (inp.nextInt() == 1) {
                System.out.print("Yeni şifrenizi giriniz : ");
                String newPassword;
                newPassword = inp.nextLine();
                if (!Objects.equals(newPassword, password)) {
                    System.out.println("Yeni şifreniz oluşturuldu");
                } else {
                    System.out.println("Şifreniz eski şifrenizle aynı olamaz");
                }
            }
        }
    }
}