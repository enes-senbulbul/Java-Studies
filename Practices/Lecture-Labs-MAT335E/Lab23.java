import java.util.Scanner;

public class Lab23{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Parke m2'sini giriniz: ");
        double m2 = input.nextDouble();
        input.nextLine(); // Buffer temizleme
        System.out.print("Parke turunu giriniz(A-B-C): ");
        char type = Character.toUpperCase(input.nextLine().charAt(0));
        double m2_price = 0;
        switch(type){
            case 'A': m2_price = 42.5; break;
            case 'B': m2_price = 28.5; break;   
            case 'C': m2_price = 19.0; break;
            default:  throw new AssertionError();
        }
        double price = (25.4 + m2_price)*m2;
        if (price>=1000) price = price*0.9;
        System.out.printf("Total price: %.2f TL", price);

        input.close();
    }
}