public class j307_Arrays {
    public static void main(String[] args) {
        // Stack'te data adında bir referans değişkeni oluşturulur.
        // Heap'te 3 adet int boyutunda ardışık alan açılır.
        // İlkel tiper için bu alanlar default olarak 0 ile doldurulur.
        int[] data = new int[3];
        data[0] = 10; // Veri Ataması 
        data[1] = 20;
        data[2] = 30;
        // Referans Kopyalama: Yeni bir dizi yaratılmaz. Aynı diziyi işaret eden yeni bir ref. oluşturulur.
        int[] aliasData = data;
        aliasData[0] = 999; // İkinci referans üzerinden veriyi değiştiriyoruz.
        System.out.println("Orijinal dizinin ilk elemani: "+data[0]); // İlk ref üzerinden veriyi okuyoruz.

        // Dizinin bellekteki kimliğini (tipi + Hash kodu) yazdırma:
        System.out.println("data referansinin adresi: "+data);
        System.out.println("aliasData referansinin adresi "+aliasData);
        // Çıktı "[I" -integer array- ile başlar, devamı hexadecimal Hash kodudur.
    }
}
