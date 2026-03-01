public class j301_Ifelse_switch{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        
        // Basic If-Else Block
        int sicaklik = 25;
        if(sicaklik < 0){
            System.out.println("Durum: Kati(Buz)");
        }else if(sicaklik > 0 && sicaklik < 100){
            System.out.println("Durum: Sivi(Su)");
        }else{
            System.out.println("Durum: Gaz (Buhar)");
        }

        // Modern Switch Expression (Java 14+) - Deger Donduren Switch
        int durumKodu = 2;
        double katsayi = switch(durumKodu){
            case 1 -> 1.0;
            case 2 -> 1.5;
            case 3, 4 -> 2.0; // Birden fazla durumu tek satirda birlestirme
            default -> 0.0; // Default sarttir. Exhaustive(Kapsayici) olmak zorundadir.
        };
        System.out.println("Durum kodu "+durumKodu+" icin katsayi: "+katsayi);
    }
}