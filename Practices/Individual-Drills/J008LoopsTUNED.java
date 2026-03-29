import java.util.Scanner;

public class J008LoopsTUNED{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        final int DOGRU_PIN = 1234;
        double bakiye = 1000.0;
        int denemeHakki = 3;
        boolean girisBasarili = false;

        // GUVENLIK DOGRULAMASI KISMI
        do{
            System.out.print("PIN kodunu giriniz: ");
            int girilenPIN = input.nextInt();
            
            if(girilenPIN == DOGRU_PIN){
                System.out.println("Giris Basarili.");
                girisBasarili = true;
                break;
            }else{
                denemeHakki--;
                System.out.println("Hatali PIN. Kalan hakkiniz: "+denemeHakki);
            }
        }while(denemeHakki>0);

        // BLOKE DURUMUNA GECILDIGINDE
        if(!girisBasarili){
            System.out.println("Hesabiniz bloke oldu.");
            for(int i=5; i>0; i--){
                System.out.printf("Bloke kalmasina %d saniye...%n", i);
            }
            System.exit(0); // Programi tamamen kapat
        }

        // ANA ISLEM MENUSU
        while(true){
            System.out.println("\n--- ISLEM MENUSU ---");
            System.out.println("1: Bakiye Goruntule\n2: Para Cek\n3: Cikis Yap");
            System.out.printf("Seciminiz: ");
            int islem = input.nextInt();

            if(islem==1){
                System.out.printf("Guncel Bakiyeniz: %.2f TL%n", bakiye);
            }else if(islem==2){
                System.out.print("Cekmek istediginiz tutari giriniz: ");
                double miktar = input.nextDouble();

                if(miktar > bakiye){
                    System.out.println("HATA: Yetersiz Bakiye!");
                }else if(miktar<=0){
                    System.out.println("HATA: Gecerli bir tutar giriniz.");
                }else{
                    bakiye -= miktar;
                    System.out.printf("%.2f TL cekildi. Kalan Bakiye %.2f TL%n",miktar,bakiye);
                }
            }else if(islem == 3){
                System.out.println("Cikis yapiliyor. İyi Gunler dileriz.");
                break;
            }else{
                System.out.println("HATA: Gecersiz bir secim yaptiniz.");
            }
        }

        
        input.close();
    }
}