
package p22506pn;

import java.util.ArrayList;
import java.util.Collections;


public class P22506pn {

    public static void main(String[] args) {
        barco();
    }
    
    public static boolean[][] barco (){
         boolean[][] matResultado = new boolean[25][4];
         String[][] matNombresPasajeros = new String[25][4];
         
         ArchivoLectura arch = new ArchivoLectura("Embarque.txt");
            
         while(arch.hayMasLineas()){
            String[] listaElementos = arch.linea().split("#");      
            matResultado[Integer.parseInt(listaElementos[1])-1][Integer.parseInt(listaElementos[2])-1] = true;
            matNombresPasajeros[Integer.parseInt(listaElementos[1])-1][Integer.parseInt(listaElementos[2])-1] = listaElementos[3];         
         }
         
        ArrayList<String> nombrePasajerosMalUbicados = new ArrayList<String>(); 
         
        for(int j = 0; j < matResultado[0].length; j++){
            boolean elementoAlInicio = false;
            boolean vacio = false;
            
            
            for(int i = matResultado.length-1; i >= 0; i--){
                if(i == matResultado.length-1 && matResultado[i][j]==false){
                    elementoAlInicio = false;
                }
                if(i == matResultado.length-1 && matResultado[i][j]==true){
                    elementoAlInicio = true;
                }
                
                if(i != matResultado.length-1 && matResultado[i][j]==false && elementoAlInicio == true){
                    vacio = true;
                }
                if(i != matResultado.length-1 && matResultado[i][j]==true && elementoAlInicio == false){
                    nombrePasajerosMalUbicados.add(matNombresPasajeros[i][j]);
                }        
                if(vacio == true && matResultado[i][j] == true){
                    nombrePasajerosMalUbicados.add(matNombresPasajeros[i][j]);
                }             
            }
         
        }
          
        ArchivoGrabacion grab = new ArchivoGrabacion("Avisar.txt");
        

       

        Collections.sort(nombrePasajerosMalUbicados);
        
        for(int i = 0; i < nombrePasajerosMalUbicados.size(); i++){         
                grab.grabarLinea(nombrePasajerosMalUbicados.get(i));                               
        }        
                
        
         arch.cerrar();
         grab.cerrar();
         return matResultado;
     }
    
    
    
    
}
