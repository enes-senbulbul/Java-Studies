// Onceki kodun uzerinde calisiyoruz yine - Kurucu (Constructor) Methodlar, Overloading
class Vektor2D{

    // Instance Variables
    double x;
    double y;

    // 1) Parametresiz Kurucu
    public Vektor2D(){
        // Nesne dogdugunda calisacak ilk kodlar
        this.x = 0.0;
        this.y = 0.0;
        System.out.println("Orijinde yeni bir vektor olusturuldu: (0.0, 0.0)");
    }

    // 2) Parametreli Kurucu (Kartezyen Initializing)
    public Vektor2D(double baslangicX, double baslangicY){
        this.x = baslangicX;
        this.y = baslangicY;
        System.out.println("Belirtilen koordinatlarda vektor olusturuldu: ("+x+" , "+y+")");
    }

    // Onceki Instance Methodlarimiz
    public double buyuklukHesapla(){
        return Math.sqrt(x*x+y*y);
    }

    public void skalerCarp(double c){
        x = x*c;
        y = y*c;
    }
}

public class j403_OOP1{
    @SuppressWarnings("unused")
    public static void main(String[] args){

        // Parametresiz kurucuyu cagirma
        Vektor2D v1 = new Vektor2D();

        // Parametreli olan kurucuyu cagirma
        Vektor2D v2 = new Vektor2D(3.0, 4.0); 
        // Vektor daha Heap'te var edildigi ilk anda (3.0, 4.0) durumuna gecer.
        // Bu, matematiksel kesinlik ve kod güvenligi acisinden mukemmeldir.

        System.out.print("v2 Buyuklugu: " + v2.buyuklukHesapla());
    }
}
