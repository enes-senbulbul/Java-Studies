import java.util.Scanner;

public class j306_sentinel_controlled_loops{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int total = 0; 
        int gradeCounter = 0;

        // PRIMING READ (Ön Okuma) - Döngüye girmeden önce ilk veriyi al.
        System.out.print("Notu girin (Cikmak icin -1 girin): ");
        int grade = input.nextInt();

        while(grade != -1){
            total += grade;
            gradeCounter++;

            // UPDATE READ - Bir sonraki döngü için bir sonraki veriyi oku.
            System.out.println("Notu girin (Cikmak icin -1 girin): ");
            grade = input.nextInt();
        }

        // "Division by zero" Kontrolü  
        if(gradeCounter != 0){
            double avarage = (double)total/gradeCounter;
            System.out.printf("%nToplam %d adet not girildi.%n", gradeCounter);
            System.out.printf("Sinif ortalamasi: %.2f%n", avarage);
        }else{
            System.out.println("Hic not girilmedi.");
        }

        input.close();
    }
}