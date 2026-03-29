class Dusman{
    private String isim;
    private int can;
    public static int dusmanSayisi = 0;

    public Dusman(String isim, int can){
        this.isim = isim;
        this.can = can;
        dusmanSayisi++;
    }

    // Statik metot icinde sadece statik degiskenleri (dusmanSayisi) kullanabilir. isim ve can gibi degiskenleri kullanamaz.
    public static void dusmanSayisiniGoster(){
        System.out.println("Oyundaki Toplam Dusman Sayisi: "+dusmanSayisi);
    }
}

public class J012StaticKeyword{
    public static void main(String[] args) {
        Dusman dusman1, dusman2, dusman3;
        dusman1 = new Dusman("Ork", 200);
        dusman2 = new Dusman("Goblin", 50);
        dusman3 = new Dusman("Trol", 400);

        Dusman.dusmanSayisiniGoster();
    }
}