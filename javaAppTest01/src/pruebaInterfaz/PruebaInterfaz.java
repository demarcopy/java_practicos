package pruebaInterfaz;

import javax.swing.JOptionPane;

public class PruebaInterfaz {
    public static void main(String[] args){
        int valor = 0;
        
        try{
            String dato = JOptionPane.showInputDialog("Ingrese un dato");
            valor = Integer.parseInt(dato);
            JOptionPane.showMessageDialog(null, "Todo bien", "Titulo", JOptionPane.PLAIN_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Datos mal", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
}
