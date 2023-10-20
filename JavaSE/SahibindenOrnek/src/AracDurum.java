public class AracDurum {

    String renk;
    int fiyat,km;
    boolean ilandaMi;

    public void ilanDa(){
        ilandaMi = true;
    }
    public void ilandaDegil(){
        ilandaMi = false;
    }
    public void fiyatArt(int miktar){
        fiyat += miktar;
    }
    public void fiyatDüs(int miktar){
        fiyat -= miktar;
    }
}
