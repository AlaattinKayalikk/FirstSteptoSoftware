// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AracDurum bmw = new AracDurum();
        bmw.fiyat = 200000;
        bmw.renk = "beyaz";
        bmw.km = 25000;
        bmw.ilandaMi = false;

        AracDurum tofas = new AracDurum();
        tofas.fiyat = 50000;
        tofas.renk = "siyah";
        tofas.km = 150000;
        tofas.ilandaMi = true;

        System.out.println("Tofaş ilanda mı? : "+tofas.ilandaMi);
        tofas.ilandaDegil();
        System.out.println("Tofaş ilanda mı? : "+tofas.ilandaMi);
        System.out.println("------------------------------------");
        System.out.println("Bmw eski fiyatı : "+bmw.fiyat);
        bmw.fiyatArt(5000);
        System.out.println("Bmw yeni fiyatı : "+bmw.fiyat);
    }
}