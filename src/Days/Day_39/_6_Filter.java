package Days.Day_39;

public class _6_Filter {
    public static void main(String[] args) {
        // Verilen String icerisindeki harfleri ayiklayarak anlamli bir metin olusturan method yaziniz
        // "(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$%a>>>$s@777.||}{";


  /*      String str = "(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$ %a>>>$s@777.||}{";

        for (int i =0; i<str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
        }

        */


        // Verilen String icerisindeki harfleri ayiklayarak anlamli bir metin olusturan method yaziniz
        // "(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$%a>>>$s@777.||}{";

        String str = "(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$%a>>>$s@777.||}{";
        System.out.println(filterString(str));

    }
    public static String filterString(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i)==' '){
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}
