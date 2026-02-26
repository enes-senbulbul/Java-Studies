import java.util.Arrays;

public class j202_ReferenceTypes{
    public static void main(String[] args){
        
        // 1 - Primitive tip davranisi
        int a = 10;
        int b = a; // a'nin icindeki deger kopyalanip b'ye yazilir.
        b = 20; // b'yi degistirmek a'yi etkilemez.
        System.out.println("Primitive a: "+a);
        System.out.println("Primitive b: "+b);
        
        // 2 - Reference tip davranisi
        int[] dizi1 = {1, 2, 3}; // Heap'te bir dizi nesnesi yaratildi.
        int[] dizi2 = dizi1;  // Dizi kopyalanmadi. Sadece adres kopyalandi.
        // Su an dizi1 ve dizi2 ayni heap adresini isaret ediyor.

        dizi2[0] = 99;
        System.out.println("Reference dizi1: " + Arrays.toString(dizi1));    
        System.out.println("Reference dizi2: " + Arrays.toString(dizi2));

        int[] bosReferans = null;
        // System.out.println(bosReferans[0])
        // program aninda NullPointerExpection firlatip coker.
    }
} 