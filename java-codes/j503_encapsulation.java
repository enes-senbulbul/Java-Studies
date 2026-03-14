class BankaHesabi{

    // Tüm nesneler tarafından paylaşılır. hepsi için ortaktır. -> STATIK
    // Asla değiştirilemez. -> FINAL
    public static final String BANKA_ADI = "ITU Merkez Bankasi";

    // Nesneye özel sabit -> FINAL. Her nesne doğarken sadece 1 kez verilebilir.
    private final String hesapNumarasi;

    private double bakiye; // Normal, değiştirilebilir(sadece setter tarafından) değişken

    private final double[] islemGecmisi = new double[5];  // Nesne ve arraylerde final kullanımı

    public BankaHesabi(String hesapNumarasi, double ilkPara){ // Constructor
        this.hesapNumarasi = hesapNumarasi;     // final değişkenlere atamayı ya oluştururken ya da constructor içinde yapmak zorundayız.
        setBakiye(ilkPara);
    }

    // Getterlar
    public String getHesapNumarasi(){
        return this.hesapNumarasi;
    }
    public double getBakiye(){
        return this.bakiye;
    }
    // Setter
    public void setBakiye(double miktar){
        if(miktar >= 0) this.bakiye = miktar;
    }

    // Final Nesnenin İçeriğini Değiştirebilme Gösterimi
    public void guvenlikTesti(){
        this.islemGecmisi[0] = 500.0; // Bu statement çalışır!!!
        // this.islemGecmisi = new double[10];  // Hata verir. Referansı başak bir Heap adresine aayarlayamayız.
        // this.hesapNumarasi = "YENI-HESAP";   // Hata verir. Her ne kadar sınıf içinde olsak da final olduğu için yine değiştiremiyoruz.
    } 
}

public class j503_encapsulation{
    public static void main(String[] args) {
        
        BankaHesabi hesap1 = new BankaHesabi("TR-001", 1000.0);
        BankaHesabi hesap2 = new BankaHesabi("TR-002", 5000.0);

        System.out.println("Banka: " + BankaHesabi.BANKA_ADI); // Sınıf Değişkenine Sınıfın referansı ile erişiyoruz.
        // BankaHesabi.BANKA_ADI = "Hacked Bank";   // Derleme Hatası

        System.out.println("Hesap 1: " + hesap1.getHesapNumarasi());
        System.out.println("Hesap 2: " + hesap2.getHesapNumarasi());
    }
}