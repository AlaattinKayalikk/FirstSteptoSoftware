// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        OtobusOzellik kaleTurizm = new OtobusOzellik();
        kaleTurizm.firma = "Kale";
        kaleTurizm.kapasite = 50;
        kaleTurizm.mevcutYolcu = 30;
        kaleTurizm.nereden = "İstanbul";
        kaleTurizm.nereye = "Zonguldak-Bartın";

        OtobusOzellik metroTurizm = new OtobusOzellik();
        metroTurizm.firma = "Metro";
        metroTurizm.kapasite = 45;
        metroTurizm.mevcutYolcu = 45;
        metroTurizm.nereden = "Bursa";
        metroTurizm.nereye = "Giresun";

        kaleTurizm.bilgiAl();
        metroTurizm.bilgiAl();

        kaleTurizm.yolcuArttir(25);
        kaleTurizm.bilgiAl();
    }
}