/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sucursales;


public class pruebaSucursales {
    
    public static void main(String[]args){
    ArchivoLectura arch = new ArchivoLectura("texto");
    
    while(arch.hayMasLineas()){
        int sucursal = Integer.parseInt(arch.linea().split("#")[0]);
        String[] frase2 = arch.linea().split("#");
        int[][] matrizResultado = new int[16][251];
    
    
        int codigoJuguete = Integer.parseInt(frase2[0].split("?")[0]);
    
    
        if(codigoJuguete >= 0 && codigoJuguete <= 250){
            matrizResultado[sucursal][codigoJuguete] ++;
            matrizResultado[sucursal][0] ++; //Usamos la columna 0 para la cantidad total.           
        }
        
        
        for(int i = 0; i < matrizResultado.length; i++){
            
            for(int j = 0; j < matrizResultado[0].length; j++){
                boolean tieneValor = false;
                if(matrizResultado[i][j] != 0){
                    tieneValor = true;
                }           
            }
        
            
            
        }
        
        
        
        

    }    
    }
    

}
