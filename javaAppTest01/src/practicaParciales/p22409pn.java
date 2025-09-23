
package practicaParciales;
import java.util.Arrays;


public class p22409pn {
    public static void main(String[] args){
        int[][] mat = {
            {  10,  2,  33},
            { 2,  3,   5},
            { 5,  2,   10},
            {  1,  10,   0},
            {  1,  2,   -2}
        };
        
        imprimirMatriz(generar(mat));
        
        
    }

   public static void imprimirMatriz(int[][] unaMatriz){
      for(int i = 0 ; i < unaMatriz.length; i++){
          System.out.println(Arrays.toString(unaMatriz[i]));
      }      
    } 
    
    
    public static String proceso(String[] listaTeclas, String texto){
    
        String[] textoIngresado = texto.split("");
        String[] resultado = new String[texto.length()];
        String proceso;
           
        for(int i = 0; i < textoIngresado.length; i++){
            for(int j = 2; j < listaTeclas.length; j++){
                String boton = listaTeclas[j].toLowerCase();
                String letra = textoIngresado[i].toLowerCase();
                
                if(boton.contains(letra)){
                    resultado[i] = j + "";      
                }
            }
        }
        
        proceso = String.join("", resultado);
        
        return proceso;
    
    }
   
    
    public static int cantImpar (int[][] matriz){
        int[] cantNumeros = new int[(matriz.length * matriz[0].length) +1];
        int resultado = -1;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                cantNumeros[matriz[i][j]] ++;
            }       
        }    
        for(int i = 0; i < cantNumeros.length; i++){
            if(cantNumeros[i] != 0 && cantNumeros[i] % 2 != 0){
                resultado = i;
            }
        }
        return resultado;
    }
    
    
    public static int[][] generar(int[][] mat){
        int[][]matResultado = new int[mat.length][mat[0].length];
            
        for(int j = 0; j < mat[0].length; j++){
            int sumaColumna = 0;
            for(int i = 0; i < mat.length; i++){
                if(j==0){
                    sumaColumna += mat[i][j];
                }else{
                    matResultado[i][j] = mat[i][j];
                }
            }
            if(j==0){
                for(int i = 0; i < matResultado.length; i++){
                    matResultado[i][0] = sumaColumna;           
                }
            }
        
        }
        return matResultado;
    }

    
    
    
}
