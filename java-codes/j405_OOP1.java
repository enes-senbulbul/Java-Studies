// static variables
class Vektor2D{

    double x;   // Nesne değişkenleri (Nesneye özel - Heap'te yaşarlar.)
    double y;
    
    public static int uretilenVektorSayisi = 0; // Sınıf değişkeni - Sınıf yüklendiğinde 0 olarak başlar.

    public Vektor2D(double x, double y){
        this.x = x;     // Buradaki this, nesnenin kendisinin konumunu gösteren aynı nesne içindeki bir referans değişkenidir. 
        this.y = y;
        Vektor2D.uretilenVektorSayisi++; // this.uretilenVektorSayisi yazmıyoruz çünkü bu kötü bir pratiktir.
    }

    public double buyuklukHesapla(){
        return Math.sqrt(x*x + y*y);
    }
}

public class j405_OOP1{
    @SuppressWarnings("unused")
    public static void main(String[] args){

        System.out.println("Baslangicta uretilen vektor sayisi: " + Vektor2D.uretilenVektorSayisi);

        Vektor2D v1 = new Vektor2D(3.0, 4.0);
        System.out.println("v1 sonrasi uretilen: " + Vektor2D.uretilenVektorSayisi);

        Vektor2D v2 = new Vektor2D(5.0, 12.0);
        Vektor2D v3 = new Vektor2D(8.0, 15.0);
        System.out.println("Toplam uretilen vektor: " + Vektor2D.uretilenVektorSayisi);
    }
}