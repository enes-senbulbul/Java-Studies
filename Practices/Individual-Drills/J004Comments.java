/**
 * Bu sinif dikdortgenin alanini hesaplar.
 * 
 *  @author Enes Şenbülbül
 *  @version 1.0
 */
public class J004Comments{


    /**
     * Bu metot dikdortgenin alanini hesaplar.
     * 
     * @param kisaKenar Dikdortgenin kisa kenar uzunlugu
     * @param uzunKenar Dikdortgenin uzun kenar uzunlugu
     * @return Dikdortgenin alanini dondurur.
     */
    public static int alanHesapla(int kisaKenar, int uzunKenar){
        return kisaKenar*uzunKenar;
    }



    public static void main(String[] args){
        /* 
        Burada değişkenleri tanımlayacagiz 
        ve metodu cagiracagiz. 
        */

        int kisaKenar = 5;
        int uzunKenar = 10;
        int alan = alanHesapla(kisaKenar, uzunKenar); // argumanlari metoda yazdik ve alani bize dondurdu.
        System.out.println("Alan: " + alan);
    }
}