// JOptionPane ile GUI (Graphical User Interface) Dialog Kutuları

import javax.swing.JOptionPane;

public class J003JOptionPane{
    public static void main(String[] args){

        String urunAdi = JOptionPane.showInputDialog("Bir urun gir: ");
        String urunFiyatiString = JOptionPane.showInputDialog("Bu urunun fiyatini gir: ");
        double urunFiyati = Double.parseDouble(urunFiyatiString);
        String message = String.format("Sectiginiz urun: %s, Fiyati: %.2f TL", urunAdi, urunFiyati);
        JOptionPane.showMessageDialog(null, message);
    }
}