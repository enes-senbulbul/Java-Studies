// printf ve kaçış dizileri +Hizalama 

public class J002EscapeSeq{
    public static void main(String[] args){

        System.out.printf("\"Mini Market Fisi\"%n");
        System.out.printf("%-15s Fiyat%n", "Urun Adi"); // "-" sola hizalama icin, 15 de string icin sabit bir alan ayirmak icin kullaniliyor
        System.out.printf("----------------------%n");
        System.out.printf("%-15s %.2f%n", "Elma", 12.5);
        System.out.printf("%-15s %.2f%n", "Sut", 35.0);
    }
} 