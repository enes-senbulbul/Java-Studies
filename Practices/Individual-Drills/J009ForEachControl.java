// Loops / For-Each Control

public class J009ForEachControl{
    public static void main(String[] args) {
       
       double[] fiyatlar = {45.0, 150.0, 80.0, 600.0, 250.0, 30.0};

       for(double fiyat: fiyatlar){
        if(fiyat<100) continue;
        else if(fiyat>500){ 
            System.out.println("Guvenlik limiti asildi! Inceleme durduruluyor.");
            break;
        }else
            System.out.printf("Vergili fiyat: %.1f %n", fiyat*1.2);
       } 
    }
} 