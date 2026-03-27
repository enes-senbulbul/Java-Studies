public class j305_counter_controlled_loops{
    public static void main(String[] args){
        
        System.out.println("--- while Dongusu Stratejisi ---");
        
        int counter = 1;
        while(counter<=5){
            int kare = counter*counter;
            System.out.printf("%d sayisinin karesi: %d%n", counter, kare);
            counter++;
        }

        System.out.println("\n--- for Dongusu Stratejisi ---");
        for(int i=1; i<=5; i++){
            System.err.printf("%d sayisinin karesi: %d%n", i, i*i);
        }
    }
}