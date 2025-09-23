
package practicaParciales;

import java.util.Arrays;

public class p22409pm {
    public static void main(String[]args){
    //int[] arrayRes = {1, 3, 5, 5, 5, 5, 5, 5, 456, 123};
    int[][] mapa = ej2(5,3);
    System.out.println(esVentana(mapa,2));
    
    }

    public static void imprimirMatriz(int[][] unaMatriz){
        for(int i = 0 ; i < unaMatriz.length; i++){
            System.out.println(Arrays.toString(unaMatriz[i]));
        }      
    }
    
    public static String ej1(int[] arrRes, int valor){
        String resultado;
        int[] res = new int[2];
              
        for(int i = 0; i < arrRes.length; i++){
            if(arrRes[i] == valor && res[0] == 0 ){
                res[0] = i;
            }
            if(arrRes[i] == valor){
                res[1] = i;
            }                      
        }        
        if(res[0] == 0){
           resultado = "No esta";
        }else{
            resultado = "Primera:" + (res[0] +1) +"   " +"Ultima" + (res[1]+1);

        }
  
       //System.out.println(Arrays.toString(res));   
        return resultado;  
    }
    
    public static int[][] ej2 (int cantFilas, int cantPorFila){
        int[][] mapaAsientos = new int[cantFilas][cantPorFila];
        
        boolean impar = true;
        int contador = 1;
        
        int fila = cantFilas-1;
          
        while(fila >= 0){              
            if(impar){
                for(int j = 0; j < cantPorFila; j++){
                    mapaAsientos[fila][j] = contador;
                    contador = contador +1;           
                }
                fila = fila-1;
                impar = !impar;                   
            }else{
                if(!impar){
                    for(int j = cantPorFila-1; j >= 0; j--){
                      mapaAsientos[fila][j] = contador;
                      contador = contador + 1;
                    }
                    fila = fila-1;
                    impar = !impar;                
                }                   
            }         
        }
     
        return mapaAsientos;
        }
    
    public static boolean esVentana(int[][] mapa, int numero){
        boolean esVentana = false;
        
        for(int i = 0; i < mapa.length && !esVentana; i++){
            for(int j = 0; j < mapa[0].length; j++){
                if(mapa[i][j] == numero && (j == 0 || j == mapa[0].length-1)){
                    esVentana = true;
                }
            }
        }
        return esVentana;
    }
    }
    
    
    
    
    
    
    

