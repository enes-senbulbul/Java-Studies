import java.util.Scanner;

public class j006_printf_output{
    public static void main(){

        Scanner input = new Scanner(System.in);

        System.out.print("Ogrenci ismini giriniz: ");
        String ogrenciIsmi = input.nextLine();
        System.out.print("Vize notunu giriniz: ");
        int vizeNotu = input.nextInt(); 
        System.out.print("GANO'sunu giriniz: ");
        double genelOrtalama = input.nextDouble();

        System.out.println("ADI\t\tVIZE\tORTALAMA");
        System.out.println("--\t\t----\t--------");

        System.out.printf("%s\t\t%d\t%.2f%n", ogrenciIsmi, vizeNotu, genelOrtalama);
        // %n -> Platformdan bağımsız alt satıra geçme karakteri (Windows'ta \r\n, Linux'ta \n)
    
        input.close();
    } 
}