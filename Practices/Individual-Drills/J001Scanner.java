// 001 - Getting inputs with Scanner Class
import java.util.Scanner;

public class J001Scanner{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Adinizi giriniz: ");
        String isim = input.nextLine();
        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();

        System.out.printf("Merhaba %s, %d yasindasin ve Java ogrenmeye hazirsin! %n", isim, yas);

        input.close();
    }
}