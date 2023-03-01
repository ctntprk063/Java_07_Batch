package Exercises.GrupCalismalari.task1;

public class PersonTest {
    //Kişinin adı, soyadı, email, dogum yılı, kilo bilgisi alınsın.Private olara tanımlansın
    //Email kontrolü yapılsın. Eğer içinde @ işareti yoksa “Geçersiz Mail” olarak kayıt yapılsın.
    //getYas() adında bir metot olsun. Kullanıcının yaş bilgisini döndürsün. (2023’den çıkartarak)
    //Kaç kullanıcı eklendiği bilgisi alınabilsin. (Static değişken)
    //Ad ile Soyad bilgisi oluşturulan bir fonksiyonla alınabilsin.(ad ve soyadı birleştiren)



    public static void main(String[] args) {
        System.out.println("Person.kullaniciSayisi = " + Person.kullaniciSayisi);
        Person person1 = new Person();
        person1.setAdi("Ahmet");
        person1.setEmail("AhmetMail");
        person1.setDogumYili(1986);
        person1.setKilo(90);
        person1.setSoyadi("Ali");
        System.out.println("person1 = " + person1);
        System.out.println("Person.kullaniciSayisi = " + person1.kullaniciSayisi);

        Person person2 = new Person();
        person2.setEmail("Ahmet");
        person2.setDogumYili(1980);
        person2.setKilo(80);
        System.out.println("person2.kullaniciSayisi = " + person2.kullaniciSayisi);
        Person person3 = new Person();
        Person person4 = new Person();


    }
}
