public class j103_GarbageCollectionDemo{
    public static void main(String[] args){

        Object kumanda1 = new Object();
        // Heap'te Object() ile yeni bir object(Televizyon) olusturuluyor ve kumanda1 referansı da 
        // bu olusturulan object'i isaret ediyor.

        Object kumanda2 = kumanda1;
        // Ikinci bir referans olusturup aynı nesneyi isaret etmesini sagliyoruz.
        // Artık Heap'teki tek nesnemize(dot) giden 2 farklı yol(edge) var.

        kumanda1 = null;
        // Ilk baglantiyi kopariyoruz.
        // null atamak, referansin icini bosaltir.

        kumanda2 = null;
        // Ikinci ve son baglantiyi da kopariyoruz.
        // Artik nesnemiz unreachable durumdadir ve GC bir sonraki "Mark and Sweep" taramasinda bellekten 
        // ... tamamen silecektir.

        System.gc(); // GC'ye temizlik yapmasini rica ediyoruz.

        System.out.println("Bellek baglantilari koparildi. GC'ye sinyal gonderildi.");
    }
}