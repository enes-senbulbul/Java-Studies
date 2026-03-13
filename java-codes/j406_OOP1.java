// static methods
class Vektor2D{
    double x;
    double y;
    public static int uretilenVektorSayisi = 0;

    public Vektor2D(double x, double y){
        this.x = x;
        this.y = y;
        Vektor2D.uretilenVektorSayisi++;
    }

    public double buyuklukHesapla(){    // Instance Method - Nesneye Özel
        return Math.sqrt(x*x + y*y);
    }

    public static Vektor2D topla(Vektor2D v1, Vektor2D v2){     // Static Method - Sınıfa Özel (Evrensel) 
        double yeniX = v1.x + v2.x;
        double yeniY = v1.y + v2.y;
        return new Vektor2D(yeniX, yeniY); // yeni vektor2D nesnesinin referansını döndürür.
    }

}

public class j406_OOP1{
    @SuppressWarnings("unused")
    public static void main(String[] args){

        Vektor2D v1 = new Vektor2D(2.0, 3.0);
        Vektor2D v2 = new Vektor2D(4.0, 1.0);

        Vektor2D v3 = Vektor2D.topla(v1, v2); // Sınıfın adını kullanarak evrensel bir topl metodu çağırıyoruz.

        System.out.printf("v3 vektoru: (%.1f, %.1f)", v3.x, v3.y);
    }
} 
