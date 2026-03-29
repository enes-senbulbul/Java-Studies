import java.util.Scanner;

public class Lab22{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        double x = input.nextDouble();
        System.out.print("y: ");
        double y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x-2, 2) + Math.pow(y-4, 2));
        if(distance > 6) System.out.println("outside");
        else if(distance == 6) System.out.println("on");
        else System.out.println("inside");

        input.close();
    }
}