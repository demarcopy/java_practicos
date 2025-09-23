/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaParciales;

/**
 *
 * @author Rodrigo
 */
public class parcialUno {
    public static void main(String[]args){
    
    
    }
    
    public static boolean matrizPerfecta(int[][] mat){
    
        boolean resultado = true;
        boolean repetido = false;
        for(int col = 0; col < mat[0].length && !repetido; col++){
            int elem = mat[0][col];
            
            for(int j = col+1; j < mat[0].length; j++){
                if (mat[0][col] == mat[0][j]) {
                    repetido = true;
                }         
            }  
            
            boolean esta = false;
            for(int i = 1 ; i <mat.length && !esta; i++){
                for(int j = 0; j< mat[0].length; j++){
                    if(elem == mat[i][j]){
                        esta = true;
                    }
                }
            }               
        }
        return resultado; 
    }

    public static void famoso(){
    
    }

}

