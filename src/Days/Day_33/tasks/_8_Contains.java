package Days.Day_33.tasks;

public class _8_Contains {
  /*  Write a method that accepts 2 strings(str1,str2) and checks if second string exist in first one. if
    second exists, should print the position index.
    checkWord(“Your parcel is delivered to your postcode: DA124DA”, “delivered”)*/

    public static void main(String[] args) {

        String str1="Sampiyon Fenerbahce";
        String str2="Fenerbahce";

        boolean kapsiyormu=str1.contains(str2);
        if (kapsiyormu==true){
            System.out.println("Your parcel is delivered to your postcode: DA124DA”, “delivered");
        }else
        System.out.println("Your parcel will not be delivered to your postal address: come and collect it yourself " );


    }
}
