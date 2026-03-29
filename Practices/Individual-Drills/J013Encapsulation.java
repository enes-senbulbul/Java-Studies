class BankaHesabi{
    private String hesapSahibi;
    private double bakiye;
    private String sifre;

    public BankaHesabi(String hesapSahibi, double bakiye, String sifre){
        this.hesapSahibi = hesapSahibi;
        if(bakiye > 0) this.bakiye = bakiye;
        else this.bakiye = 0;
        this.sifre = sifre;
    }

    public double getBakiye(String girilenSifre){
        if(girilenSifre.equals(sifre)) return bakiye;
        else{
            System.out.println("Yetkisiz erisim! Sifre hatali.");
            return -1.0;
        }
    }

    public void paraYatir(double miktar){
        if(miktar > 0){
            bakiye += miktar;
            System.out.println("İslem basarili. Yeni bakiye: "+bakiye);
        }else{
            System.out.println("Gecersiz miktar. Para yatirma islemi basarisiz.");
        }
    }    
}

public class J013Encapsulation{
    public static void main(String[] args) {
        BankaHesabi hesap1 = new BankaHesabi("Java OOPoglu", 400, "1234");
        hesap1.paraYatir(-100);
        hesap1.getBakiye("1233");
        System.out.println("Bakiye: "+hesap1.getBakiye("1234"));
    }
}