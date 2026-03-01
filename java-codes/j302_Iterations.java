public class j302_Iterations{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        
        // For Loop (Sigma Notation: Tum sum of numbers to N)
        int n = 5;
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sigma summation of numbers 1 to 5: " + sum);

        // While Loop (Logarithmic Scaling Down)
        int number = 32;
        int iterationCount = 0;
        while(number > 1){
            number = number / 2;
            iterationCount++;
        }
        System.out.println("To scale down 32 to 1, Iterations we need (log2(32)): " + iterationCount);

        // Do-While Loop (1 Iteration is guarantied)
        int testValue = 100;
        do { 
            System.out.println("Despite statement is wrong, it is written once!");
        }while(testValue < 50);
    }
}