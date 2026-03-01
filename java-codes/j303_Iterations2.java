import java.util.Arrays;

public class j303_Iterations2{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        
        int[] primeNumbers = {2, 3, 5};

        // Classic For Loop (Index based)
        for(int i=0; i<primeNumbers.length; i++){
            System.out.print(primeNumbers[i] + " ");
        }System.out.println(); // Insert a line break

        // Enhanced For Loop (Declarative, Set Based)
        for(int prime : primeNumbers){
            System.out.print(prime + " ");
        }

        // For-Each loop works as READ-ONLY
        for(int prime : primeNumbers){
            prime = 99; // You only change the copy, not the exact member of the set
        }
        System.out.println("\nAfter Previous Trial: " + Arrays.toString(primeNumbers));
    }
}