// Primitive, Referance Types and Wrapper Classes

public class J005HardMemory{
    public static void main(String[] args){

        Integer a = 100;
        Integer b = 100;
        boolean isEqual = a.equals(b);
        System.out.println("Are their referanced values equal?: "+isEqual);

        Integer c = 200;
        Integer d = 200;
        boolean areSameReferance = (c==d);
        System.out.println("Are they the same referance?: "+areSameReferance);       

        sayiyiArttir(a);
        System.out.println("Integer a's second value in main: " + a);
    }

    public static void sayiyiArttir(Integer sayi){
         /*
         * AÇIKLAMA: Java her zaman "Pass-by-Value" (Değere göre çağrı) ile çalışır.
         * Buraya referansın (adresin) bir kopyası gelir.
         * parametre += 50 işlemi yapıldığında orijinal nesne DEĞİŞMEZ (Immutability).
         * Arka planda Heap'te 150 değerinde YENİ bir nesne oluşturulur 
         * ve 'sayi' değişkeni artık o yeni nesneyi işaret etmeye başlar.
         * Ancak main içindeki 'a' hala eski 100 nesnesini işaret etmektedir!
         */
        sayi += 50;
        System.out.println("Integer a's second value in method: " + sayi);
    }
}