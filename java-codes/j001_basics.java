import java.util.ArrayList;

public class j001_basics{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.print("Good, Morning!");
        String text = "How are you?";
        System.out.println(" " + text);

        System.out.println(10+20); // + for math operation
        System.out.println("10"+20); 
        System.out.print(text + 20); 
        System.out.print("String" + " Concatenation"); // + operator for concatenation

        // Single-line comment
        /* Multi-line
        Comments will be
        ignored by Java */

        final float PI_VALUE = 3.14195f; // constants

        var someValue = 15; // Auto detection type (Java 10 - 2018)
        // someValue = 9.99; // Once type is chosen, it stays the same
        // When to use var?
        // Without var -declaring complex types like ArrayList/HashMap-
        ArrayList<String> cars = new ArrayList<String>();
        // With var -> it makes code easier and easier to read
        var cars_alt = new ArrayList<String>();

        int x, y=20, z, a=1, b; // declare multiple variables
        x = z = b = 20; // one value to multiple variables

        boolean isJavaHard = true;
        System.out.println("Is Java Hard?: " + isJavaHard);

        // Type-Casting / Integer division 
        int maxScore = 500;
        int userScore = 423;
        double percentage = (double)userScore / maxScore * 100;
        System.out.println("User's percentage is " + percentage);

    }
}