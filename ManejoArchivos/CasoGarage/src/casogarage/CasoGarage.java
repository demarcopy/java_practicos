/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casogarage;

/**
 *
 * @author Rodrigo
 */
public class CasoGarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        
    }
    
    public static void parking(String nombre, int lugares){
        ArchivoLectura arch = new ArchivoLectura(nombre);
        ArchivoLectura   err = new ArchivoLectura("Errores.txt");

        int[][] mat = new int [9][3];
        while(arch.hayMasLineas()){
            String[] partes1 = arch.linea().split("@");
            String[] partes2 = arch.linea().split("#");
            int piso = Integer.parseInt(partes2[0]);
            int lugar = Integer.parseInt(partes2[1]);
            if(piso < 1 || piso > 8 || lugar < 1 || lugar > 30){
                err.grabarLinea(arch.linea());
            }else{
                mat[piso][lugar]++;
                mat[piso][0]++;
            }
         

            
        }
        arch.cerrar();
        err.cerrar();
        
        ArchivoGrabacion info = new ArchivoGrabacion("Informacion.txt");
        for(int i = 1 ; i <= 8; i++){
            info.grabarLinea(i + "- " + 30 - mat[i][0]);
        }
        
        
        boolean hayLugar = false;
        int pisoMasAlto;
        
        for(int piso = 8; piso > 0 && !hayLugar; piso--){
            int van;
            for(int i = 1; i <= 30 && !hayLugar; i++){
                van = 0;
                for(int pos = 0; pos <= lugares; pos++){
                    int lugar = i + pos;
                    if( lugar > 30){
                        lugar = lugar - 30;
                    }
                    if(mat[piso][lugar] == 0){
                        van++;
                    }
                }
            }
            
        if(van==lugares){
            hayLugar = true;
            pisoMasAlto = 0;
        }        
        if(hayLugar){
            info.grabarLinea("Piso mas alto " + pisoMasAlto);
        }else{
            info.grabarLinea("No hay lugar");
        }
        
        info.cerrar();
        
        }
        


    }    
    
}
