package Days.Day_33.tasks;

public class _10_UniqueKarakter {
//    Write a return  method that can find the unique characters from the String
//    Ex:  uniqueChar("DDEECGDDEEEEFGGDCDDM")  ==>  "FM";

    public static void main(String[] args) {

        String str = "DDEECGDDEEEEFGGDCDDM";

        for (int i = 0; i < str.length(); i++)
        {
            int karakterSayisi = 0;
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j) && i != j)
                {
                    karakterSayisi = 1;
                    break;
                }
            }
            if (karakterSayisi == 0)
                System.out.print(str.charAt(i));
        }





    }


}
