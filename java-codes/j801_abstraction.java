// Soyut Sınıf: abtract kelimesi bu sınıfın new ile yaratılmasını yasaklar.
abstract class AkilliCihaz{
    protected String cihazId;
    protected boolean acikMi;
    // Kurucuları vardır. Alt sınıflar super() ile tetikler.
    public AkilliCihaz(String cihazId){
        this.cihazId = cihazId;
        this.acikMi = false;
        System.out.printf("-> [Sablon] %s ID'li cihazin temeli atildi.%n",cihazId);
    }
    // Somut metot: Tüm cihazlarda ortak olan, davranışı belli davranış.
    public void gucDugmesineBas(){
        acikMi = !acikMi;
        System.out.println(cihazId + " gücü " + (acikMi ? "acildi." : "kapatildi."));
    }
    // Soyut metot: Nasıl yapılacağını bilmiyor ama olmak zorunda
    public abstract double anlikGucTuketimi();
}
class AkilliLamba extends AkilliCihaz{
    private double parlaklikSeviyesi;   // 0.0 ile 1.0 arası
    public AkilliLamba(String cihazId, double parlaklikSeviyesi){
        super(cihazId); 
        this.parlaklikSeviyesi = parlaklikSeviyesi;
    }
    @Override   // Ebeveynin yarım bıraktığı sözü tutmak zorundayız
    public double anlikGucTuketimi(){
        if(!acikMi) return 0.0;
        return 60.0 * parlaklikSeviyesi;    // Max 60 Watt
    }
}
class AkilliTermostat extends AkilliCihaz{
    private double hedefSicaklik;
    public AkilliTermostat(String cihazId, double hedefSicaklik){
        super(cihazId);
        this.hedefSicaklik = hedefSicaklik;
    }
    @Override   // Termostat için güç formülü farklıdır
    public double anlikGucTuketimi(){
        if(!acikMi) return 0.0;
        return 1500.0;  // Sabit 1500 Watt 
    }
}


public class j801_abstraction{
    public static void main(String[] args) {

        // --- Polimorfizm ve SOyutlama Bir Arada ---
        // Referans tipi soyut olabilir (AkilliCihaz)
        AkilliCihaz salonLambasi = new AkilliLamba("LMB-01", 0.8);
        AkilliCihaz koridorTermostat = new AkilliTermostat("TRM-01", 24.0);
        System.out.println("\n--- Sistem Baslatiliyor ---");
        salonLambasi.gucDugmesineBas(); // Somut Metot (Ebeveynden) 
        koridorTermostat.gucDugmesineBas();
        // Her biri kendi implementasyonuna (v-table) gider.
        System.out.println("Lamba Tuketimi: " + salonLambasi.anlikGucTuketimi() + "Watt"); 
        System.out.println("Termostat Tuketimi: " + koridorTermostat.anlikGucTuketimi() + "Watt");
    }
}