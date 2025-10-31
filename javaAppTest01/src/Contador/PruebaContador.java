package Contador;


public class PruebaContador {
    public static void main(String[] args){
        ModeloContador c = new ModeloContador(0);
        
        VistaVentanaContador v = new VistaVentanaContador(c);
        v.setVisible(true);
    }
}
