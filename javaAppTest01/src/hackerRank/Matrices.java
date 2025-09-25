package hackerRank;

import java.util.Arrays;


public class Matrices {
    public static void main(String[]args){
    int[][] matriz = { 
        {1, 1, 1, 0}, 
        {1, 0, 1, 0}, 
        {1, 1, 1, 0}, 
        {1, 1, 1, 1}};

    imprimirMatriz(filaSolitariaMatriz(4,4,matriz));
    }
    
    public static int[][] filaSolitariaMatriz(int m , int n, int[][]matriz){
        int[][]matrizResultado = new int[matriz.length][matriz[0].length];
        
        for(int i = 0; i < matriz.length; i++){
            String caracterFila = "";
            for(int j = 0; j < matriz[0].length; j++){
                caracterFila = caracterFila + matriz[i][j] + "";   
            }  
            boolean repetida = false;
            for(int h = 0; h < matriz.length; h++){
                
                String caracterFilaProx = "";
                    for(int k = 0; k < matriz[0].length; k++){
                        caracterFilaProx = caracterFilaProx + matriz[h][k] + "";
                    }
                if(caracterFila.equals(caracterFilaProx) && h != i){
                    repetida = true;
                }        
            }
            if(!repetida){
                System.out.println("Una unica" + caracterFila);
                
                for(int g = 0 ; g < caracterFila.length(); g++){
                    String letra = caracterFila.charAt(g) + "";
                    matrizResultado[i][g] = Integer.parseInt(letra);
                
                }
            }
        }
        
        return matrizResultado;
    }
    
    
    public static void imprimirMatriz(int[][] unaMatriz){
        for(int i = 0 ; i < unaMatriz.length; i++){
            System.out.println(Arrays.toString(unaMatriz[i]));
        }
        
    }    
}
