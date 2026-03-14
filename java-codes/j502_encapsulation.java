class BankaHesabi{

    private String hesapNumarasi;  // Data hiding - Veri Gizleme (Tüm stateler private)
    private double bakiye;          

    public BankaHesabi(String hesapNumarasi, double ilkPara){   // Kurucu Metot
        this.hesapNumarasi = hesapNumarasi;
        setBakiye(ilkPara); // Kurucu içine doğrudan this.ilkPara yazmiyoruz. Setter ile validation testine sokmamiz
        // ... lazım ki negatif değer girilmesin.
    }

    // Getter (Okuyucu) Metot   // Hesap Numarası Setter yazılmaz!
    public String getHesapNumarasi(){
        return this.hesapNumarasi;
    }

    public double getBakiye(){  // Bakiye için Getter Metot 
        return this.bakiye;
    }

    // Setter Metodu ve Validation
    public void setBakiye(double miktar){
        if(miktar < 0){ // Güvenlik Duvarı: Gelen değer negatif olamaz!
            System.out.println("HATA: Bakiye negatif ("+miktar+") olamaz! Islem reddedildi.");
            return; // Metodu anında sonlandır, aşağıdaki güncelleme koduna geçme
        }
        this.bakiye = miktar;
        System.out.println("BASARILI: Yeni bakiye: "+this.bakiye+ " olarak guncellendi.");
    } 
}

public class j502_encapsulation{
    public static void main(String[] args) {
        
        BankaHesabi hesabim = new BankaHesabi("TR-9999", 1000.0);
        System.out.println("Hesap No: "+ hesabim.getHesapNumarasi()); // Okuma İşlemi - Getter Üzerinden
        hesabim.setBakiye(2500.0);  // Güncelleme İşlemi - Setter Üzerinden
        hesabim.setBakiye(-500.0);  // Güncelleme İşlemi - Geçersiz İşlem
        System.out.println("Son Bakiye: " + hesabim.getBakiye());   // Okuma İşlemi - Getter Üzerinden 
        
        // hesabim.hesapNumarasi = "TR-HACKED"; // Derleme Hatası
        // hesabim.setHesapNumarasi("TR-HACKED"); // Derleme Hatası - Böyle bir metot yok
    }
}