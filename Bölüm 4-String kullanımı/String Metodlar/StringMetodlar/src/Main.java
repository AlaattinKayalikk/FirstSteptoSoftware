// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String metin1 = "Merhaba Dünya";
        System.out.println(metin1.charAt(2)); //Ekran çıktısı : r
        System.out.println(metin1.length()); //Ekran çıktısı : 13
        System.out.println(metin1.replace('a','ö')); //Ekran çıktısı : Merhöbö Dünyö
        System.out.println(metin1.substring(5)); //Ekran çıktısı : ba Dünya
        System.out.println(metin1.toLowerCase()); //Ekran çıktısı : merhaba dünya
        System.out.println(metin1.toUpperCase()); //Ekran çıktısı : MERHABA DÜNYA
        System.out.println(metin1.trim()); //Ekran çıktısı : Merhaba Dünya - Fazladan eklenen boşlukları siler.
        String[] dizi = metin1.split("a");
        for (String i : dizi){
            System.out.println(i); /*Ekran çıktısı : Merh
            b
                    Düny*/
        }


    }
}