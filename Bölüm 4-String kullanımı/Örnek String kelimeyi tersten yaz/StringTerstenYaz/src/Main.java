import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin gir..: ");
        String gelenDeger = scanner.next();

        int boyut = gelenDeger.length();
        char[] dizi = new char[boyut];

        for (int i=0; i<boyut; i++){
            dizi[i] = gelenDeger.charAt(i);
        }

        for (int i = (boyut-1); i>=0;i--){
            System.out.print(dizi[i]);
        }

    }
}