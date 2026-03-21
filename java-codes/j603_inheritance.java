import java.util.Objects;

class GeometrikSekil{
    public double xEkseni; // equality metodu tanımında ayrıca getter kullanmayla uğraşmayayım diye "public"
    public double yEkseni;
    public GeometrikSekil(double xEkseni, double yEkseni){
        this.xEkseni = xEkseni;
        this.yEkseni = yEkseni;
    }
    public void konumuYazdir(){
        System.out.println("Konum: ("+xEkseni+", "+yEkseni+")");
    }
}

class Daire extends GeometrikSekil{
    private double yariCap;
    public Daire(double x, double y, double yariCap){
        super(x, y);
        this.yariCap = yariCap;
    }
    public double alanHesapla(){    
        return Math.PI*yariCap*yariCap; 
    }

    @Override
    public boolean equals(Object kiyaslanacakNesne){
        if (this == kiyaslanacakNesne) return true; // Kendisiyla mi kıyaslanıyor?
        // Gelen nesne null mu? veya farklı Sınıfa ait bir nesne mi?
        if (kiyaslanacakNesne == null || this.getClass() != kiyaslanacakNesne.getClass()) return false;

        // Gelen nesnenin kesinlikle "Daire" olduğunu biliyoruz
        Daire digerDaire = (Daire) kiyaslanacakNesne; // Tip dönüşümü yaparak "Object"i "Daire"ye cast ediyoruz
        // Object kiyaslanacakNesne dediğimizde tipi bilinmeyen bir nesne argümanı veriyoruz ve içindekilere erişilemiyordu
        // Bunu Daire'ye çevirerek artık içindeki yarıçap ve konum durumlarına erişebiliyoruz.
        int radiusEq = Double.compare(this.yariCap, digerDaire.yariCap);
        int xEq = Double.compare(this.xEkseni, digerDaire.xEkseni);
        int yEq = Double.compare(this.yEkseni, digerDaire.yEkseni);
        return (radiusEq==0) && (xEq==0) && (yEq==0);
    }

    @Override
    public int hashCode(){  // Kural gereği aynı olan nesnelerin hashleri de aynı olmak zorunda
        return Objects.hash(yariCap, xEkseni, yEkseni); // Verdiğimiz argümanlara göre deterministik hash üretiyor.
    }
}

public class j603_inheritance{
    public static void main(String[] args){

        Daire d1 = new Daire(0.0, 0.0, 5.0);
        Daire d2 = new Daire(0.0, 0.0, 5.0);
        System.out.println("\nd1 == d2 Adresler ayni mi?: " + (d1==d2));
        System.out.println("d1.equals(d2) Daireler aslinda ayni mi?: " + d1.equals(d2));
        System.out.println("d1 HashCode: " + d1.hashCode());
        System.out.println("d2 HashCode: " + d2.hashCode());
    }
} 