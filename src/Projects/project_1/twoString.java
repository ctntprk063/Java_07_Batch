package Projects.project_1;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("birinci string giriniz : ");
        String str1=sc.nextLine();

        System.out.println("ikinci string giriniz : ");
        String str2=sc.nextLine();

        if (str1.endsWith(String.valueOf(str2.charAt(0)))){
            System.out.print(str1 + str2.substring(1));

        }
        else{
            System.out.print(str1 + str2);
        }

    }
}
