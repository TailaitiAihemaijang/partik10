import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/3/2023 8:26 AM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String userName, password,answer,newpassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullancı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şefreniz : ");
        password = input.nextLine();

        if (userName.equals("patika")&& password.equals("1234")){
            System.out.println("Giriş yaptınız ");
        }else {
            System.out.println("Bilgeleriniz Yanlış");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            answer = input.nextLine();
            if (answer.equals("evet")){
                System.out.print("Yeni Şefrenizi Giriniz");
                newpassword = input.nextLine();
                if (newpassword.equals(password)){
                    System.out.println("Girdiniz Şifre Eskisi ile Ayni olmamalı");
                }else {
                    password = newpassword;
                    System.out.println("Şifre Oluşturuldu");
                }
            }
        }

    }
}
