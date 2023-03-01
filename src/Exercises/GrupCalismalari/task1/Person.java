package Exercises.GrupCalismalari.task1;

public class Person {
    private String adi;
    private String soyadi;
    private String email;
    private int kilo;
    private int dogumYili;

  public  static int kullaniciSayisi;

    public Person() {
        kullaniciSayisi++;
    }

    public Person(String adi, String soyadi, String email, int kilo, int dogumYili) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.kilo = kilo;
        this.dogumYili = dogumYili;

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if (!email.contains("@")) {
            System.out.println("gecersiz Email");
        }
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public int getYas( int yas) {

       yas = 2023 - dogumYili;

        return yas;
    }

    @Override
    public String toString() {
        return "Person{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", email='" + email + '\'' +
                ", kilo=" + kilo +
                ", dogumYili=" + dogumYili +
                '}';
    }
}
