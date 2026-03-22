class OdemeYontemi{
    public void odemeYap(double miktar){    // Ebeveynin Evrensel Davranışı
        System.out.println("Sistem:"+miktar+" TL genel tahlisat");        
    }
}

class KrediKartiOdeme extends OdemeYontemi{
    private String kartNo;
    public KrediKartiOdeme(String kartNo){
        this.kartNo = kartNo;
    }

    @Override
    public void odemeYap(double miktar){    // Ebeveynin Davranışı Eziliyor.
        System.out.println("Kredi Karti ("+kartNo+"): "+miktar+" TL cekildi.");
    }

    public void taksitlendir(int aySayisi){     // Sadece Kredi Kartında olan - Ebeveynde olmayan- Yetenek
        System.out.println("-> Islem "+aySayisi+" taksite bolundu.");
    }
}

class KriptoOdeme extends OdemeYontemi{
    private String cuzdan;
    public KriptoOdeme(String cuzdan){
        this.cuzdan = cuzdan;
    }

    @Override
    public void odemeYap(double miktar){    // Ebeveynin Davranışı Eziliyor.
        System.out.println("Kripto("+cuzdan+") "+miktar+" TL karsiligi token transfer edildi.");
    }

    public void agOnayiBekle(){     // Sadece Kripto Ödemede olan - Ebeveynde olmayan- Yetenek
        System.out.println("-> Blockchain ag onayi bekleniyor (3/3 confirmation)...");
    }
}

public class j702_polymorphism{
    public static void main(String[] args){

        // UPCASTING: Farklı tipteki nesneleri aynı sepete atıyoruz. Implicit upcast ediyor ebeveyne
        OdemeYontemi[] sepetOdemeleri = new OdemeYontemi[2];
        sepetOdemeleri[0] = new KrediKartiOdeme("5549-XXXX-XXXX-1234");
        sepetOdemeleri[1] = new KriptoOdeme("0xABC123...");

        System.out.println("\n--- Polimofik Tahsilat Basliyor ---");
        for(OdemeYontemi aktifOdeme : sepetOdemeleri){
            
            // Ebeveynde olduğundan downcast edilmeden de çalışır.
            aktifOdeme.odemeYap(500.0);     // Evrensel Davranışı değil Nesnenin kalbine iner ve onun davranışını çalıştırır.

            if(aktifOdeme instanceof KrediKartiOdeme){  // Downcast etmeden önce güvenlik kontrolü
                KrediKartiOdeme kart = (KrediKartiOdeme) aktifOdeme;
                kart.taksitlendir(6);   // Downcast edildikten sonra artık nesnenin kendi özel davranışına erişebiliriz.
            }else if(aktifOdeme instanceof KriptoOdeme){
                KriptoOdeme kripto = (KriptoOdeme) aktifOdeme;
                kripto.agOnayiBekle();
            }
            System.out.println("-----------------------");
        }

        OdemeYontemi hataliOdeme = new KriptoOdeme("0x999...");
        // KrediKartiOdeme hataliKart = (KrediKartiOdeme) hataliOdeme; 
        // Yorum satırı kaldırıldığında derleyici hata vermez ama RUNTIME sırasında program çöker.
    }
} 