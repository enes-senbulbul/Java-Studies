// Bu arguman ile calistir: java --add-opens java.base/java.util=ALL-UNNAMED j310_ArrayList 

import java.util.ArrayList;
import java.lang.reflect.Field;

public class j310_ArrayList {
    public static void main(String[] args) throws Exception {
        
        // Kapasitesi sadece 3 olan boş bir liste yaratıyoruz.
        ArrayList<Integer> numbers = new ArrayList<>(3); 
        // İçinde 3 elemanlık gizli bir array oluştu (Capacity: 3, Size: 0)

        System.out.println("Baslangic Size'i: " + numbers.size());
        System.out.println("Baslangic Capacity'si: " + getCapacity(numbers));
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("3 eleman ekledikten sonra Size: " + numbers.size());
        System.out.println("3 eleman ekledikten sonra Capacity: " + getCapacity(numbers));
        numbers.add(40);
        System.out.println("4. eleman (Buyume) sonrasi Size: " + numbers.size());
        System.out.println("4. eleman (Buyume) sonrasi Capacity: " + getCapacity(numbers));
    } 


    // JVM içindeki gizli "elementData" dizisinin length değerine erişiyoruz.
    public static int getCapacity(ArrayList<?> l) throws Exception{
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}
