import java.util.ArrayList;

public class j311_ArrayList {
    public static void main(String[] args) {

        // Tip güvenliği ile sadece String kabul eden dinamik yapı
        ArrayList<String> engines = new ArrayList<>();
        
        // Sona Ekleme - O(1)
        engines.add("V8");
        engines.add("V12");
        engines.add("Electric");
        
        // Araya Ekleme - O(n)
        engines.add(1, "V10");
        
        // Okuma - O(1)
        System.out.println("2. indeksteki motor: " + engines.get(2));

        // Boyut Okuma - Capacity değil size'i döndüdürür.
        System.out.println("Silme oncesi boyut(Size): " + engines.size());

        // Silme - O(n)
        engines.remove(0);

        // Çıktı ve Doğrulama 
        System.out.println("Silme sonrasi guncel liste: " + engines);
        System.out.println("Yeni ilk eleman: " + engines.get(0));
    }    
}