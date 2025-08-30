
package matrices;

public class Matriz {
    public static void main(String[] args){
        
    }
    public static void sumarMatriz(){
    int[][] matrizEjemplo = new int[][] {
        {1, 2, 3, 4},
        {1, 2, 3, 4},
        {1, 2, 3, 4},
        {1, 2, 3, 4}
    };
    int suma = 0;
    for(int i = 0; i < matrizEjemplo.length; i++){
        for(int j = i; i < matrizEjemplo[0].length; j++){
        suma += matrizEjemplo[i][j];
        }
    }
    System.out.println(suma);
    }
    
    public static void sumarMatrizImpar(int[][] matrizEjemplo){
    int suma = 0;
    int canIndices = 0;
    
    for(int i = 0; i < matrizEjemplo.length; i = i+2){
        for(int j = i; i < matrizEjemplo[0].length; j++){
            if(matrizEjemplo[i][j] % 2 == 2){
                suma += matrizEjemplo[i][j];
            }
        
        }
    }    
    
        
        
    
    }
    
    
}
