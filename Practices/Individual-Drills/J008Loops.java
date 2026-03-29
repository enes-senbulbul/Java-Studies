import java.util.Scanner;

public class J008Loops{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int pinCode = 1234;
        double bakiye = 1000.0;
        int denemeHakki = 3;

        do{
            System.out.print("PIN kodunu giriniz: ");
            int pinDenenen = input.nextInt();
            if(pinDenenen == pinCode){
                System.out.println("PIN kodunu dogru girdiniz. Giris Yapiliyor.");
                break;
            }else{
                denemeHakki--;
                System.out.printf("Yanlis PIN girdiniz. Kalan Hakkiniz: %d%n", denemeHakki);
                if(denemeHakki==0){
                    System.out.println("Hesabiniz Bloke Oldu.");
                    for(int i=0;i<5;i++){
                        System.out.printf("Bloke Kalkmasina %d saniye...%n", 5-i);
                    }
                    System.exit(0);
                }
            }
        }while(denemeHakki>0);

        System.out.printf("Yapmak istediginiz islemi seciniz: %n1: Bakiye goruntule%n2: Para Cek%n3: Cikis yap.");
        int islem = input.nextInt();
        while(islem != 3){
            if(islem==1){
                System.out.println("Bakiye: "+bakiye);
            }else if(islem==2){
                System.out.print("Cekmek istediginiz miktari giriniz: ");
                int miktar = input.nextInt();
                if(miktar > bakiye){
                    System.out.print("Yetersiz bakiye");
                }else{
                    bakiye = bakiye - miktar;
                    System.out.println("Hesabinizdan "+miktar+" TL cekildi. Kalan bakiye: "+bakiye);
                } 
            }else{
                System.out.println("Gecerli bir islem giriniz.");
            }
            System.out.printf("Yapmak istediginiz islemi seciniz: %n1: Bakiye goruntule%n2: Para Cek%n3: Cikis yap.");
            islem = input.nextInt();
        }

        System.out.println("Cikis Yapildi. İyi Gunler.");


        input.close();
    }
}