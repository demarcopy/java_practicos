
package practicaParciales;
import java.util.Arrays;


public class p22409pn {
    public static void main(String[] args){
    int[][] matriz = {
        {4, 4, 6},
        {6, 6, 6},
    };

    //cantImpar(matriz);
    System.out.println(cantImpar(matriz));
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
    
}
