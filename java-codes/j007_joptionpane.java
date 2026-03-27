import javax.swing.JOptionPane;

public class j007_joptionpane{
    public static void main(String[] args){
        
        String isim = JOptionPane.showInputDialog("Adınızı giriniz:");

        String karsimlamaMesaji = String.format("Java dunyasina hoş geldin, %s!", isim);

        // null parametresi pencerenin ekranın tam ortasında açılmasını sağlar.
        JOptionPane.showMessageDialog(null, karsimlamaMesaji);
    }
}