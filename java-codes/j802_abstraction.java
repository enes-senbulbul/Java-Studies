interface AgBaglantili{ // 1. Arayüz (Yetenek): Ağ Bağlantısı
    // Sadece bir sözleşmedir. Nasıl bağlanılacağını söylemez. 
    // Derleyici otomatik olarak "public abstract" void baglan(String wifiAdi); yapar.
    void baglan(String wifiAgAdi);
    void baglantiyiKes();
}

interface Guncellenebilir{  // 2. Arayüz: Güncellenebilirlik 
    String DESTEKLENEN_MIN_SURUM = "v1.0.0";
    boolean yazilimGuncelle(String yeniSurum);
}

// Ebeveyn Sınıf
abstract class AkilliCihaz{
    protected String cihazId;
    public AkilliCihaz(String cihazId){ this.cihazId = cihazId; }
    public abstract double anlikGucTuketimi();
}

// Sınıf + Çoklu Arayüz: Mükemmel Birleşim
class AkilliKamera extends AkilliCihaz implements AgBaglantili, Guncellenebilir{
    private boolean kayittaMi;
    public AkilliKamera(String cihazId){
        super(cihazId);
        this.kayittaMi = false;
    }
    @Override   // Ebeveynden gelen mecburiyet
    public double anlikGucTuketimi(){
        return kayittaMi ? 15.0 : 5.0; 
    }
    @Override   // AgBaglantili Arayüzünden gelen mecburiyetler
    public void baglan(String wifiAgAdi){
        System.out.println(cihazId + " kamerasi '" + wifiAgAdi + "' agina WPA3 ile baglandi.");
    } 
    @Override
    public void baglantiyiKes(){
        System.out.println(cihazId + " ag baglantisi sonlandirildi.");
    }
    @Override   // Guncellenebilir Arayüzünden gelen mecburiyet
    public boolean yazilimGuncelle(String yeniSurum){
        System.out.println(cihazId + " yazilimini " + DESTEKLENEN_MIN_SURUM + " uzerinden " + yeniSurum + " surumune yukseltiliyor...");
        return true;
    }
}


public class j802_abstraction{
    public static void main(String[] args){

        AkilliKamera guvenlikKamerasi = new AkilliKamera("CAM-GIRIS-01");

        // Interface'ler Muthis bir referans (kumanda) tipidir.

        AgBaglantili agCihazi = guvenlikKamerasi;   // Upcasting: Kameraya sadece ağ bağlantılı bir cihaz olarak bakıyoruz.
        agCihazi.baglan("Ev-Wifi-5G");
        // agCihazi.anlikGucTuketimi(); // Hata Verir! Ağ kumandasında güç tüketimi tuşu yoktur.

        Guncellenebilir guncellenecekCihaz = guvenlikKamerasi;  // Upcasting: Aynı kameraya sadece "Güncellenebilir nesne" olarak bakıyoruz.
        guncellenecekCihaz.yazilimGuncelle("v2.1.4");     
        // Güçlü Polimorfizm: Eğer sistemde 100 farklı cihaz olsaydı, sadece 'Guncellenebilir' 
        // arayüzünü implement edenleri tek bir dizide toplayıp hepsini tek tıkla güncelleyebilirdik!   
    }
}