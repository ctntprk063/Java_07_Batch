package Days.Day_33.tasks;

import java.util.Scanner;

public class _6_OturumAcma {
  /*  Create a Login Functionality according to following Logic
• UserName,Password
• --- > Program will ask to enter username and password
• --- > If both username and password are blank
• "UserName and Password Fields cannot be empty”
        • --- > If userName is blank and password is not blank
• "UserName cannot be empty”
        • --- > If userName is not blank and password is blank
• "Password cannot be empty”
        • --- > If the username or password is not valid
• "UserName or password is not valid. Please verify”
        • --- > If the username and password are both valid
• “User Logged in successfully"
    */

   /* Aşağıdaki Mantığa göre bir Oturum Açma İşlevselliği oluşturun
• Kullanıcı adı Şifre
• --- > Program kullanıcı adı ve şifre girmenizi isteyecektir.
• --- > Hem kullanıcı adı hem de parola boşsa
• "Kullanıcı Adı ve Şifre Alanları Boş Geçilemez"
        • --- > KullanıcıAdı boşsa ve şifre boş değilse
• "KullanıcıAdı boş olamaz"
        • --- > KullanıcıAdı boş değilse ve şifre boşsa
• "Şifre boş olamaz"
        • --- > Kullanıcı adı veya şifre geçerli değilse
• "Kullanıcı Adı veya şifre geçerli değil. Lütfen doğrulayın"
        • --- > Kullanıcı adı ve parolanın her ikisi de geçerliyse
• "Kullanıcı başarıyla oturum açtı"*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a username : ");
        String username = sc.nextLine();
        System.out.print("Enter a password : ");
        String pass = sc.nextLine();

        String kullanici = "Fenerbahce";
        String sifre = "Fener1907";

        if (username.isEmpty() && pass.isEmpty()) {
            System.out.println("UserName and Password Fields cannot be empty");
        } else if (username.isEmpty() && pass.equals(sifre)) {
            System.out.println("UserName cannot be empty");
        } else if (username.equals(kullanici) && pass.isEmpty()) {
            System.out.println("Password cannot be empty");
        } else if (!username.equals(kullanici) || !pass.equals(sifre)) {
            System.out.println("UserName or password is not valid. Please verify");
        } else
            if (username.equals(kullanici)&& pass.equals(sifre)) {
            System.out.println("User Logged in successfully");
        }
    }
}
