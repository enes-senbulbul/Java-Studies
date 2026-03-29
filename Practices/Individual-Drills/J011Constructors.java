class Silah{
    private String ad;
    private int hasar;
    private double kritikSans;

    public Silah(String ad, int hasar, double kritikSans){
        this.ad = ad;
        this.hasar = hasar;
        this.kritikSans = kritikSans;
    }
    public Silah(String ad, int hasar){
        this(ad, hasar, 0.1);
    }
    public Silah(){
        this("Eski Kilic", 5);
    }

    public void bilgileriGoster(){
        System.out.printf("Ad: %s %nHasar: %d %nKritik Sansi: %.2f%n",ad,hasar,kritikSans);
    }
}

public class J011Constructors{
    public static void main(String[] args) {
        Silah silah1, silah2, silah3;
        silah1 = new Silah("Yay", 10, 0.5);
        silah2 = new Silah("Mizrak", 30, 0.01);
        silah3 = new Silah();
    
        silah1.bilgileriGoster();
        silah2.bilgileriGoster();
        silah3.bilgileriGoster();
    }
}