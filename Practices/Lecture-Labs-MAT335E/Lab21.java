// import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lab21{
    public static void main(String[] args){

        /*
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("x1: "));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("y1: "));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("x2: "));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("y2: "));
        */

        Scanner input = new Scanner(System.in);
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        
        
        double distance = Math.abs(x2-x1) + Math.abs(y2-y1);
        System.out.println("Manhattan Distance -> d = "+distance);
        
        input.close();
        // String message = "Manhattan Distance -> d = " + distance;
        // JOptionPane.showMessageDialog(null, message);
    }
}