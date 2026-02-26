public class j203_WrapperLogic{
    public static void main(String[] args){

        // Autoboxing - Derleyici arka planda Integer.valueOf(10) yazar.
        // 10 sayisi stack'te doğar ama Integer referansına atandigi icin Heap'te bir nesneye donusur.
        Integer kutuluSayi = 10;
        // Unboxing - Derleyici arka planda kutuluSayi.intValue() yazar.
        // Heap'teki nesnenin icinden ham 10 degeri cikartilir ve Stack'teki a'ya atanir. 
        int a = kutuluSayi; 

        System.out.println("Kutulu: " + kutuluSayi + " | Ham: " + a);


        // Referans kiyaslama tuzagi
        Integer x = new Integer(500); // Heap'te 1. nesne
        // new Integer() kullanimdan kalkmistir ama mantigi anlamak icin yaziyormusuz
        Integer y = new Integer(500); // Heap'te 2. nesne
        boolean adresAyniMi = (x==y);
        boolean degerAyniMi = x.equals(y);
        System.out.println("x == y sonucu (Adresler): " + adresAyniMi);
        System.out.println("x.equals(y) sonucu (Degerler): " + degerAyniMi);


        // The Invisible NPE (NullPointerException)
        Integer tehlikeliKutu = null;
        // int b = tehlikeliKutu;
        // Yukaridaki satir hata verir. null tasiyan nesneyi unbozing yapamayiz.

    }
}