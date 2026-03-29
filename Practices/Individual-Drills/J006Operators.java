// Tip Sistemi ve Bellek İzdüşümleri / Operatörler

public class J006Operators{
    public static void main(String[] args){
        
        int dogruCevap = 17;
        int toplamSoru = 20;
        double basariYuzdesi = ((double)dogruCevap/toplamSoru) * 100;
        System.out.println("Basari Yuzdesi: %" + basariYuzdesi);

        int READ = 4;       // Binary 100
        int WRITE = 2;      // Binary 010
        int EXECUTE = 1;    // Binary 001

        int kullaniciYetkisi = READ | EXECUTE; // 101 olacak
        int writeYetkisi = kullaniciYetkisi & WRITE;
        boolean yetkiVarMi = (writeYetkisi==WRITE) || (writeYetkisi>0);
        System.out.println("Kullanicinin \"WRITE\" yetkisi var mi?: "+yetkiVarMi);
    }
}