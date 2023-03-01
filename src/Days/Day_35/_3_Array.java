package Days.Day_35;

public class _3_Array {
    public static void main(String[] args) {

        String [] sehirler={"istanbul","Ankara","urfa","adana","antep"};

        for (String harf: sehirler){
            if (harf.toLowerCase().startsWith("a")){
                System.out.println(harf);
            }

        }


    }
}
