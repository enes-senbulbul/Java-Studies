public class j204_Operators{
    @SuppressWarnings("unused")
    public static void main(String[] args){

        // Arithmetic and Logical Operations
        int sayi = 17;
        boolean ciftMi = (sayi%2 == 0);
        System.out.println("17 cift mi? " + ciftMi);

        // The Short-Circuit 
        int a = 5;
        int b = 10;
        boolean sonuc = (a > 10) && (b++ > 5); // Ilk exp yanlis oldugundan ikincisi asla
        // ... calistirilmiyacak ve b++ islemi gerceklesmeyecektir. 
        System.out.println("Kisa devre sonucu b'nin degeri: " + b);

        // Bitwise Level Multiplication/Division
        int deger = 8;
        int carpim_w2 = deger << 1; // sola 1 bit kaydir
        int bolum_w2 = deger >> 1; // saga 1 bit kaydir
        System.out.println("8<<1 (Carpim): " + carpim_w2);
        System.out.println("8>>1 (Bolum): " + bolum_w2);
    }
}