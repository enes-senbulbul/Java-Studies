// Sinif isimleri her zaman PascalCase
class Vektor2D{

    // 1) State/Fields (Durum) -> Matematiksel Bilesenler 
    // Bu degiskenler metotlarin disinda dogrudan sinif seviyesinde tanimlanir.
    double x;
    double y;

    // 2) Behavior/Methods (Davranis) -> Bu bilesenlerin yapabilecegi islemler
    // Fonksiyon taniminda 'static' kelimesi yok. Cunku bu method genel degil
    // ... spesifik bir nesneye aittir.
    public double buyuklukHesapla(){

        // Sinifin kendisi icindeki 'x' ve 'y' degiskenlerine dogrudan erisebiliyoruz.
        return Math.sqrt(x*x+y*y);
    }
}

public class j401_OOP1{
    public static void main(String[] args){

        Vektor2D v1;  // Sadece Stack'te referans olusturuyoruz. Heap'te henuz bir sey yok.
        v1 = new Vektor2D();    // Heap'te nesneyi olusturup referansa bagliyoruz. 
        //... Artik Heap'te 16+bytelik fiziksel bir Vektor2D nesnesi var.   
        
        v1.x = 3.0; // Nesnenin state verilerine (.) operatoru ile erisiyoruz.
        v1.y = 4.0;

        double v1Buyukluk = v1.buyuklukHesapla(); // Nesnenin behavior methodunu tetikliyoruz.
        System.out.println("v1 Vektoru: ("+v1.x+" , "+v1.y+")");
        System.out.println("v1 Buyuklugu: "+v1Buyukluk);

        // Stack'te referans olusturup ona Heap'te bir nesne de olusturup bagliyoruz.
        Vektor2D v2 = new Vektor2D();
        v2.x = 8.0;
        v2.y = 15.0;
        System.out.println("\nv2 Buyuklugu: "+v2.buyuklukHesapla());
    }
}
