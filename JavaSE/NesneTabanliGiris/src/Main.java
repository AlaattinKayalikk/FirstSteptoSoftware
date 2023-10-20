// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Araba bmw = new Araba();
        bmw.durum = true;
        bmw.fiyat = 200000;
        bmw.km  = 15000;
        bmw.renk = "beyaz";

        Araba tofas = new Araba();
        tofas.durum = false;
        tofas.fiyat = 25000;
        tofas.km = 150000;
        tofas.renk = "siyah";

        System.out.println("Bmw Çalışıyor mu? : "+bmw.durum);
        System.out.println("Tofaş Çalışıyor mu? : "+tofas.durum);
    }
}