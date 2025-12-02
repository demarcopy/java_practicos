/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p22207;

/**
 *
 * @author Administrador
 */
public class P22207 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
    }
    
    public static int masRicos(int[][]mat){
        int maximo = 0;
        int cantMax = 0;
        
        for(int i = 0; i < mat.length; i ++){
            int sumaCliente = 0;
            int veces = 0;
                          
            for(int j = 0 ; j < mat[0].length; j++){
                sumaCliente = sumaCliente + mat[i][j];
            
                if(mat[i][j] > 0){
                    veces ++;
                }                


                
            }
            if(veces == mat[0].length){
                if(sumaCliente > maximo){
                    maximo = sumaCli;
                    cantMax ++;
                }
            }            



        
        }


       
    
}
