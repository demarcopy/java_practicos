/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package televisoragot;

/**
 *
 * @author Rodrigo
 */
public class TelevisoraGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void promedioMedicion(){
        ArchivoLectura arch = new ArchivoLectura("Archivo.txt"); 
            int sumaEspectadores = 0;
            int contMediciones = 0; 
            int promedio;
            int[][] matrizEspectadores = new int [11][60];
            
            
        while(arch.hayMasLineas()){
            String linea = arch.linea();
            int medida = Integer.parseInt(linea.split("#")[1]);
            int consultora = Integer.parseInt(linea.split("#")[0]);
                     
            
            for(int i = 0; i < medida; i++){
                arch.hayMasLineas();
                
                String[] partesDeLinea = linea.split("#");  
                int televidentes = Integer.parseInt(partesDeLinea[1]);
                
                sumaEspectadores = sumaEspectadores + televidentes;
                contMediciones ++;
            
                int minutos = Integer.parseInt(arch.linea().split("#")[0].split(":")[1]);
                
                //String [] horasyminutos = partesDeLinea[0].split(":");
                
                //int minutos = Integer.parseInt(horasyminutos[1]);
                
                matrizEspectadores[consultora][minutos] = 1;
             
            
            }
            
               
        }
        promedio = sumaEspectadores/conteo;
        

        
        
        
    
    
    }
    
}
