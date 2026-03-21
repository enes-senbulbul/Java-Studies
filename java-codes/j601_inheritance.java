class GeometrikSekil{   // Üst Sınıf - Superclass
    public double xEkseni;  // Şimdilik Test Kolaylığı için public yapıyormuşuz
    public double yEkseni;
    public void konumuYazdir(){     // Tüm şekillerin yapabileceği ortak bir davranış 
        System.out.println("Konum: ("+xEkseni+", "+yEkseni+")");
    }
}

class Daire extends GeometrikSekil{     // Alt Sınıf - Subclass, extends ile GeometrikSekil DNA'sını tamamen kopyaladık
    public double yariCap;  // Dairenin kendine has özelliği (state/field)
    public double alanHesapla(){    // Dairenin kendine has davranışı (behavior/method)
        return Math.PI*yariCap*yariCap; 
    }
}

public class j601_inheritance{
    @SuppressWarnings("unused")
    public static void main(String[] args){

        Daire d1 = new Daire();
        d1.xEkseni = 5.0;   // Dairenin miras ile gelen xEkseni ve yEkseni özellikleri de var.
        d1.yEkseni = -3.0;
        d1.yariCap = 4.0;

        System.out.println("Daire sinifinin Ozel Metodu (alanHesapla): " + d1.alanHesapla());
        System.out.print("Ust siniftan gelen method da calisir (konumuYazdir): ");
        d1.konumuYazdir();
    }
}