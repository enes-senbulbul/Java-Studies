class BankaHesabi{
    public String hesapNumarasi; // Public değişken - Herkes görebilir ve değiştirebilir.
    private double bakiye;       // Private değişken - Sadece bu sınıfın içi görebilir ve değiştirebilir. 

    public BankaHesabi(String hesapNumarasi, double ilkPara){ // Kurucu metot - Hesap açılışı 
        this.hesapNumarasi = hesapNumarasi;
        this.bakiye = ilkPara;
    }

    public double bakiyeGoster(){   // Bakiye bilgisini okuyabilmek için bu metota ihtiyacımız var. 
        return this.bakiye;
    }
}

public class j501_encapsulation{
    public static void main(String[] args){
        
        BankaHesabi hesabim = new BankaHesabi("TR-123456", 1000.0);
        hesabim.hesapNumarasi = "TR-Hacklendi";
        System.out.println("Hesap No: " + hesabim.hesapNumarasi);

        // hesabim.bakiye = 5000000.0; Dışarıdan müdahale yasak. Derleme hatası verir.  
        System.out.println("Hesaptaki Para: " + hesabim.bakiyeGoster());    // Ancak nesnenin sunduğu 'public'
        // ... metot ile bakiye bilgisine erişebiliriz.
    }
}