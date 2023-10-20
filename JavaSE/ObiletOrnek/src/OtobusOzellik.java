public class OtobusOzellik {
    String firma;
    int kapasite;
    int mevcutYolcu;
    String nereden;
    String nereye;

    public void bilgiAl(){
        System.out.println("Firma adı               : "+firma);
        System.out.println("Mevcut kapasite         : "+kapasite);
        System.out.println("Mevcut yolcu kapasitesi : "+mevcutYolcu);
        System.out.println("Yolculuk başlangıcı     : "+nereden);
        System.out.println("Yolculuk bitişi         : "+nereye);
    }

    public void yolcuArttir(int yolcuArt){
        mevcutYolcu += yolcuArt;
        if (mevcutYolcu > kapasite){
            System.out.println("Otobüs dolu");
        }else {
            System.out.println("Mevcut yolcu sayısı : "+mevcutYolcu);
        }
    }

    public void yolcuAzalt(int yolcuAzalt){
        mevcutYolcu -= yolcuAzalt;
        if (mevcutYolcu == 0){
            System.out.println("Otobüs Boş");
        }else {
            System.out.println("Mevcut yolcu sayısı : "+mevcutYolcu);
        }
    }
}
