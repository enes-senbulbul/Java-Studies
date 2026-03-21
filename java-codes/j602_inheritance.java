class GeometrikSekil{
    private double xEkseni; // Artık kapsülleme yapabiliriz.
    private double yEkseni;

    public GeometrikSekil(double xEkseni, double yEkseni){  // Ebeveyn Kurucu
        this.xEkseni = xEkseni;
        this.yEkseni = yEkseni;
    }

    public void konumuYazdir(){
        System.out.println("Konum: ("+xEkseni+", "+yEkseni+")");
    }
}

class Daire extends GeometrikSekil{
    private double yariCap;

    public Daire(double x, double y, double yariCap){   // Çocuk Kurucu
        super(x, y);    // x ve y'yi yukarı (ebeveyn kurucusuna) postalıyoruz.
        this.yariCap = yariCap;
    }

    public double alanHesapla(){    
        return Math.PI*yariCap*yariCap; 
    }
}

public class j602_inheritance{
    @SuppressWarnings("unused")
    public static void main(String[] args){

        Daire d1 = new Daire(10.0, 20.0, 5.0);
        System.out.println("--- Nesne Hazir ---");
        d1.konumuYazdir();
    }
}