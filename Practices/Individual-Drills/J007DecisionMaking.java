public class J007DecisionMaking{
    public static void main(String[] args){
        
        String uyelikTipi = "SILVER";
        double sepetTutari = 1000.0;
        boolean kuponVarMi = true;

        int indirimYuzdesi = switch(uyelikTipi){
            case "GOLD" -> 20;
            case "SILVER" -> 15;
            case "BRONZE" -> 10;
            default -> 0; 
        };

        if(kuponVarMi) indirimYuzdesi += 5;

        double indirimMiktari = sepetTutari * indirimYuzdesi / 100; 
        double nihaiTutar = sepetTutari - indirimMiktari;
        System.out.printf("Orijinal Tutar: %.2f, Indirimli Odenecek Tutar: %.2f", sepetTutari, nihaiTutar);
    }
}