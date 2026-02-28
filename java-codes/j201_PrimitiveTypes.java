public class j201_PrimitiveTypes{
    public static void main(String[] args){

        // Temel tanimlamalar: stack belleginde aninda yer alirlar.
        int tamSayi = 42;
        double piSayisi = 3.14159265359;
        boolean isMatematikZor = true;
        char harf = 'A';
        float eSayisi = 2.71F;
        long galaksiSayisi = 2000000000L;

        // Integer Overflow (Tasma) Simulasyonu
        // Bir int'in alabilecegi max pozitif deger: 2147483647
        int maxInt = Integer.MAX_VALUE;
        int tasanDeger = maxInt + 1;

        System.out.println("Maksimum int degeri: " + maxInt);
        System.out.println("Tasan deger (max+1): " + tasanDeger);
        // Moduler aritmetik (saat aritmetigi) gibi davranarak 32-bit'in
        // ... en kucuk negatif sayisina doner. 
    } 
}