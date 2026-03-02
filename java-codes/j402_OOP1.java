// Onceki kodun uzerinde calisiyoruz yine
class Vektor2D{

    // Instance Variables - Heap'te Yasarlar
    double x;
    double y;

    // Instance Methods - Nesnenin durumuyla islem yaparlar. 
    public double buyuklukHesapla(){
        return Math.sqrt(x*x+y*y);
    }

    // Yeni Method: Vektoru bir skaler(c) ile carpma
    // 'c' burada local variable'dır. Sadece method calistigi surece Stack'ye yasar.
    public void skalerCarp(double c){
        // 'x' ve 'y' ise instance variable'dır. Heap'teki nesnenin icinde kalici olarak yasarlar.
        x = x*c;
        y = y*c;
    }
}

public class j402_OOP1{
    public static void main(String[] args){

        // Yeni bir vektor nesnesi yaratalim
        Vektor2D v3 = new Vektor2D();
        v3.x = 2.0;
        v3.y = 3.0;
        System.out.println("Skaler carpim oncesi v3: ("+v3.x+" , "+v3.y+")");
        v3.skalerCarp(4.0);
        System.out.println("Skaler carpim sonrasi v3: ("+v3.x+" , "+v3.y+")");
    }
}
