package dominioModelo;


public class pruebaDiccionario {
    public static void main(String[]args){
        Diccionario modelo = new Diccionario();
        
        VentanaDiccionario ventana = new VentanaDiccionario(modelo);
        ventana.setVisible(true);

        VentanaDiccionario ventana1 = new VentanaDiccionario(modelo);
        ventana1.setVisible(true);        
    }
    
}
