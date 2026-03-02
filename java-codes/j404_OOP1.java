// Onceki kodun uzerinde calisiyoruz yine - Shadowing and 'this' usage
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

public class j404_OOP1{
    
    // Nesne Referansını parametre olarak alan harici bir method
    public static void vektorManipulasyonu(Vektor2D kopyaKumanda){

        kopyaKumanda.x = 99.0;  // Disaridaki nesnenin Heap'teki durumu degisir.
        
        kopyaKumanda = new Vektor2D(5.0, 5.0); // Referansi baska bir nesneyi gosterecek sekilde ayarlama
        kopyaKumanda.x = 1000;  // Orijinal main methodundaki referansımız ve onun gosterdigi nesne bundan etkilenmez.
        // ... Bu degisiklik tamamen yeni, kayip nesnede gerceklesir.
    }

    public static void main(String[] args){

        Vektor2D v1 = new Vektor2D(3.0, 4.0);
        System.out.println("Metoda gondermeden once v1.x: " + v1.x);

        // Cikti 99.0 olacaktir. Cunku ilk atama ayni heap adresi uzerinden, bizim nesnemize yapildi.
        vektorManipulasyonu(v1);
        System.out.println("Motottan dondukten sonra v1.x: "+ v1.x);
    }
}
