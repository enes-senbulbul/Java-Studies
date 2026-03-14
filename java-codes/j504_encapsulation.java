public class j504_encapsulation{
    public static void main(String[] args) {
        
        String s1 = "Mühendis"; // Havuzda (Heap) String nesnesi oluşturuldu.
        String s2 = "Mühendis"; // Zaten havuzda olduğu için yeniden nesne oluşturulmadı. Referansa döndürüldü.
        String s3 = new String("Mühendis"); // "new" anahtar kelimesi havuzu bypass eder. 
        //  Havuzda olsa bilr Heap'te yepyeni bir nesne açtırır.
        
        System.out.println("s1 == s2 (Ayni adresi mi gosteriyorlar?): " + (s1 == s2));
        System.out.println("s1 == s3 (Ayni adresi mi gosteriyorlar?): " + (s1 == s3));
        System.out.println("s1.equals(s3) (Icerikleri matematiksel olarak ayni mi?): " + s1.equals(s3));

        String yavasMetin = "";
        long baslangicZamani1 = System.nanoTime();
        for(int i=0; i<10000; i++){
            yavasMetin += "*";
        }
        long sure1 = System.nanoTime() - baslangicZamani1;
        System.out.println("Immutable String birlestirme suresi: " + sure1 + " nanosaniye");

        StringBuilder hizliMetin = new StringBuilder("");
        long baslangicZamani2 = System.nanoTime();
        for(int i=0; i<10000; i++){
            hizliMetin.append("*");
        } 
        long sure2 = System.nanoTime() - baslangicZamani2;
        System.out.println("Mutable StringBuilder birlestirme suresi: " + sure2 + " nanosaniye");
    }
}