class OdemeYontemi{ // Üst Sınıf
    public void odemeYap(double miktar){    // Evrensel Davranış: Her ödeme yönteminin bir tahsilat mekanizması olmalıdır.
        System.out.println("Sistem: "+miktar+" TL tahsil ediliyor.(Yontem Belirsiz)");
    }
}

class KrediKartiOdeme extends OdemeYontemi{ // Alt Sınıf 1 
    private String kartSahibi;
    public KrediKartiOdeme(String kartSahibi){
        this.kartSahibi = kartSahibi;
    }

    @Override
    public void odemeYap(double miktar){    // Ebeveynin mantıksız davranışını ezip banka pos cihazı mantığını yazıyoruz.
        System.out.println("Kredi Karti("+kartSahibi+"): "+miktar+" TL banka posundan cekildi.");
    }
}

class KriptoOdeme extends OdemeYontemi{     // Alt Sınıf 2
    private String cuzdanAdresi;
    public KriptoOdeme(String cuzdanAdresi){
        this.cuzdanAdresi = cuzdanAdresi;
    }

    @Override
    public void odemeYap(double miktar){    // Yine aynı methoda farklı bir biçim kazandırıyoruz.
        System.out.println("Kripto Agi: "+miktar+" TL degerinde token "+cuzdanAdresi+" adresinden transfer edildi.");
    }
}


public class j701_polymorphism{
    public static void main(String[] args){

        OdemeYontemi genelOdeme = new OdemeYontemi();
        KrediKartiOdeme kart = new KrediKartiOdeme("Herhangi Biri");
        KriptoOdeme kripto = new KriptoOdeme("0x1A2B3C...");

        System.out.println("\n--- Odeme Islemleri Aliniyor ---");
        genelOdeme.odemeYap(100.0);     // Hepsi birebir aynı komutu alıyor -> odemeYap()
        kart.odemeYap(250.50);          // ...ama hepsi kendi biçimine göre farklı tepki veriyor.
        kripto.odemeYap(5000.0);
    }
}