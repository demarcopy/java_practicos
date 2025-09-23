
package practicaParciales;

import java.util.Arrays;

public class p22504pm {
   public static void main(String[]args){
        int[][] mat = {
            {  2,  13,  10,  80 },
            { -8,  15,   6,   2 },
            { 23,  -3,   5, 100 },
            {  1,  30,   1,  14 }
        };
   
   System.out.println(maximaDiferencia(mat,1,3));
  
   
   }
 
   
   public static void imprimirMatriz(double[][] unaMatriz){
      for(int i = 0 ; i < unaMatriz.length; i++){
          System.out.println(Arrays.toString(unaMatriz[i]));
      }      
    } 
   
   public static double valorDecimal(int[] datos){
       double resultado = 0;
       double aux = 0;
       for(int i = datos.length-1; i >= 0; i--){
           resultado = resultado + datos[i]*Math.pow(10, aux);
           aux ++;    
       }
       return resultado;
   }
   
   public static double [][] proceso(double[][] mat){
       double[][]resultado = new double[mat.length][2];    
       
       for(int i = 0; i < mat.length; i++){
           double resultado1 = 0;
           double resultado2 = 0;
           int[] arrayAux = new int[mat[0].length];         
           for(int j = 0; j < mat[0].length; j++){
               resultado1 = resultado1 + mat[i][j];
               arrayAux[j] = (int)mat[i][j];
           }
           System.out.println("Iteracion" + i+ "   "+ Arrays.toString(arrayAux));
           resultado2 = valorDecimal(arrayAux);
                  
           
           resultado[i][0] = resultado1;
           resultado[i][1] = resultado2;
       }   
    return resultado;
   }
  
   public static String maximaDiferencia (int[][] mat, int p, int q){
       int maximo = -1;
       for(int i = 0; i < mat.length; i++){
     
           for(int h = 0; h < mat.length; h++){
               if(i != h){
                  if(Math.abs(mat[i][p] - mat[h][q]) > maximo){
                      maximo = Math.abs(mat[i][p] - mat[h][q]);
                  }
               }
           }
       
       }
    return "El resultado es " + maximo;
   }
}
