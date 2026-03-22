class OdemeYontemi{
    public String sistemMesaji = "Genel Odeme Sistemi Baslatildi"; // Kötü pratik aa test için "public" yapıyoruz.
    public void logYazdir(){
        System.out.println("Metot Logu: Genel bir odeme islemi kaydedildi.");
    }
}
class KrediKartiOdeme extends OdemeYontemi{
    public String sistemMesaji = "Kredi Karti Guvenlik Protokolu Aktif."; // Değişkenler Override edilemez. Sadece Gölgelenir.
    @Override
    public void logYazdir(){    //  Methodlar Override edilir. v-table günvellenir.
        System.out.println("Metot Logu: 3D Secure odeme yontemi kaydedildi.");
    }
}

public class j703_polymorphism{
    public static void main(String[] args){

        System.out.println("\n--- 1. NORMAL KULLANIM (Somut Referans) ---");
        KrediKartiOdeme kart = new KrediKartiOdeme();
        System.out.println("Degisken: "+kart.sistemMesaji); // Kendi Değişkeni
        kart.logYazdir();   // Kendi Metodu

        System.out.println("\n--- 2. POLIMORFIK KULLANIM (Upcasting) ---");
        OdemeYontemi polimorfikOdeme = new KrediKartiOdeme();   // Bu sefer referansımızın tipi ebeveyn sınıftan
        System.out.println("Degisken: "+polimorfikOdeme.sistemMesaji); // Ebeveynin değişkeni gelir.
        polimorfikOdeme.logYazdir();    // Kendi Metodu
        // İşte bu yüzden encapsulation dahilinde değikenleri her zaman private yapmak hayat kurtarir.
    }
}