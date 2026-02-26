public class j102_stack_heap{
    public static void main(String[] args){

        // İlkel tip: doğrudan ana metodun Stack frame'inde tutulur.
        int number = 10;

        // Pointer tipi: "data" degiskeni pointer olarak stack'tedir.
        // new int[3] ile yaratılan [0, 0, 0] obbjesi ise Heap'tedir. 
        int[] data = new int[3];

        // Metot çağrısı: Stack'te calculate için yeni bir üst katman(frame) açılır.
        calculate(number); // Calculate fonksiyonu bittiğinde onun için açılan stack frame'i anında yok edilir.
    }

    public static void calculate(int val){ // val parametresi bu metodun kendi özel stack frame'inde yer kaplar.
        // val, number'in bir kopyası olur. Pass-by-value 
        int result = val * 2;
        System.out.println("Sonuç: " + result);
    }
} 