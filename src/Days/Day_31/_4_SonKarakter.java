package Days.Day_31;

public class _4_SonKarakter {
    public static void main(String[] args) {
// bir stringin son karakterini dinamik olarak bulan bir metod yaziniz

        String str="hello world";
       char sonHarf=str.charAt(str.length()-1);
        System.out.println("sonHarf = " + sonHarf);

    int son=    str.lastIndexOf('d');
        System.out.println("son = " + son);


    }
}
