import java.util.Scanner; 

public class j005_scanner_input{
    public static void main(){

        Scanner input = new Scanner(System.in); // 1) Scanner nesnesi oluştur.

        System.out.print("Lutfen vize notunuzu giriniz: "); // 2) Kullanıcıyı yönlendir (Prompt)

        int vizeNotu = input.nextInt(); // 3) Veriyi bekle ve oku
        // Not: Kullanıcı enter'a basana kadar program burada duraklayacaktır.
        
        double etki = vizeNotu * 0.40;  // 4) Veriyi İşle

        System.out.println("Vize notunuzun ortalamaya etkisi: " + etki); // 5) Çıktı ver

        input.close(); // 6) İyi bir pratik olarak Scanner nesnesini kapatmak bellek sızıntılarını önler. 
    }
}