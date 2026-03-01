public class j205_TypeCasting{
    @SuppressWarnings("unused")
    public static void main(String[] args){

        // Widening Cast
        int tamSayi = 100;
        double ondalikliSayi = tamSayi; // int, double'in icine rahatlikla sigar.
        System.out.println("Otomatik Genisletme (int -> double): " + ondalikliSayi);

        // Narrowing Cast (Manual)
        double pi = 3.14159;
        int daraltilmisPi = (int)pi;
        System.out.println("Manuel Daraltma (double -> int): " + daraltilmisPi);

        // The Promotion Pitfall

        /* Type Promotion (Tip Yükseltmesi):
        Aritmetik ifadelerde (denklemlerde) Java'nın çok katı bir kuralı vardır: Eğer bir
        denklemde byte, short veya char tipleri işleme giriyorsa, Java işlemci (ALU) mimarisinin
        32-bitlik standart çalışma prensibinden dolayı bu değişkenleri denkleme sokmadan hemen
        önce geçici olarak int tipine yükseltir (promote eder).*/

        byte b1 = 10;
        byte b2 = 20;
        // byte toplam = b1 + b2;
        // Java derleyicisi b1 ve b2'yi aninda int'e cevirdiginden 10+20 denkleminin
        // ... sonucu artik 32bitlik inttir ve 8 bitlik byte'a sigmaz.
        byte toplam = (byte)(b1+b2);
        // Cozum: denklemin sonucunu byte'a daraltmak
        System.out.println("Promotion sonrasi guvenli toplam: " + toplam);
    }
}