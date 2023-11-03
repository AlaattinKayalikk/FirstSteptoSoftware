public class Main {
    public static void main(String[] args) {

        /*
        String metin1 = "Merhaba Dünya";
        String metin2 = metin1; //Çıktı --> Merhaba Dünya
        String metin3 = "Merhaba Dünya";
        String metin4 = "Merhaba";
        String metin5 = metin4 + "Dünya"; //Ekran çıktısı Eşit değil. olacak
        if (metin1 == metin3){
            System.out.println("Eşittir.");
        }else {
            System.out.println("Eşit değil.");
        }
        */

        String metin6 = "Merhaba";
        String metin7 = "merhaba";

        if (metin6.equals(metin7)){
            System.out.println("Doğru");
        }else {
            System.out.println("Yanlış.");
        }

        if (metin6.equalsIgnoreCase(metin7)){
            System.out.println("Doğru");
        }else {
            System.out.println("Yanlış.");
        }
    }
}