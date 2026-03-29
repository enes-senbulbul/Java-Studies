class Karakter{
    private String isim;
    private int seviye;
    private double temelGuc;

    public Karakter(String isim, int seviye, double temelGuc){
        this.isim = isim;
        this.seviye = seviye;
        this.temelGuc = temelGuc;
    }

    public String getIsim(){
        return isim;
    }

    public double saldir(){
        return temelGuc + (seviye *1.5);
    }
}


public class J010OOPBasics{
    public static void main(String[] args){
        
        Karakter kahraman = new Karakter("JavaCoder", 10, 3.5);
        double saldiri = kahraman.saldir();
        System.out.printf("Karakter %s saldirdi! Verilen hasar: %.1f", kahraman.getIsim(), saldiri);

    }
}