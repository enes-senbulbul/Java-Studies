import java.util.Arrays;

public class j309_Arrays {
    public static void main(String[] args) {
        int[] myData = {10, 20, 30};
        System.out.println("Metot Oncesi: " + Arrays.toString(myData));

        modifyContent(myData); // Nesnemizde değişiklik gerçekleşir.
        System.out.println("modifyContent sonrasi: " + Arrays.toString(myData));

        reassignReference(myData); // Bu değişiklik gerçekleşmez.
        System.out.println("reassingReference sonrasi" + Arrays.toString(myData));
    }

    // Bu metot kopya referans değişkeni üzerinden aynı nesneye ulaşıp veriyi değiştirir.
    public static void modifyContent(int[] arr){ arr[0] = 999; }
    // Bu metot kendi frame'indeki kopya arr referansını yepyeni bir Heap dizisine bağlar. 
    public static void reassignReference(int[] arr){
        arr = new int[]{1, 2, 3};
        arr[0] = 555; // Sadece bu yeni diziyi değiştirir.
    }
}
