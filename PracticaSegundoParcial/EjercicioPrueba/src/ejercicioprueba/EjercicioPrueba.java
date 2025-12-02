
package ejercicioprueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class EjercicioPrueba {

    public static void main(String[] args) {
        barco();
    }
    
    public static boolean[][] barco() {
        boolean[][] matResultado = new boolean[25][4];
        String[][] matAux = new String[25][4];
        
        ArchivoLectura arch = new ArchivoLectura("Embarque.txt");
        ArchivoGrabacion grab = new ArchivoGrabacion("Avisar.txt");
        ArrayList<String> nombreChoferes = new ArrayList<>();
        
        while(arch.hayMasLineas()){
            String [] partes = arch.linea().split("#"); // ['Nombre de vehiculo', 'fila', 'col', 'nombre' ]
            int fila = Integer.parseInt(partes[1]);
            int col = Integer.parseInt(partes[2]);            
            
            matResultado[fila-1][col-1] = true;
            matAux[fila-1][col-1] = partes[3];
        }
        
        mostrarMatrizBooleana(matResultado);
        
        for(int j = 0; j < matResultado[0].length; j++){
            boolean valido = true;
            
            for(int i = matResultado.length-1 ; i >= 0 ; i --){
             
                if(matResultado[i][j] == false){
                    valido = false;
                }
                if(!valido && matResultado[i][j] == true){
                    nombreChoferes.add(matAux[i][j]);
                }

            
            }
        
        }
        
        Collections.sort(nombreChoferes);

        
        //nombreChoferes.sort((c1, c2) -> c1.compareToIgnoreCase(c2) );

        for(int i = 0; i < nombreChoferes.size(); i++){
            grab.grabarLinea(nombreChoferes.get(i));
        }
        
        arch.cerrar();
        grab.cerrar();
        
        return matResultado;
    }
    
    
    
    
    
    
    
    
    
    
        public static void mostrarMatrizBooleana(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {           // recorre filas
            for (int j = 0; j < matriz[i].length; j++) {    // recorre columnas
                // Elegí qué mostrar:
                // true -> 1   /   false -> 0
                System.out.print(matriz[i][j] ? "1 " : "0 ");
            }
            System.out.println(); // salto de línea al final de cada fila
        }
    }

}
