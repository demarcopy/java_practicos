
package ejerciciosClase;

public class dobleMatrizConCero {
    public static void main(String[] args){
    
    int[][]mat1 = new int[5][5];  
    
    dobleMatriz(mat1);
        
    }
    
    public static int[][] dobleMatriz(int[][] mat1){
    
    boolean[]arrayCol = new boolean[mat1.length];
    boolean[]arrayFil = new boolean[mat1[0].length];
    
    int[][]matResultado = new int[mat1.length][mat1[0].length];
        
    for(int i = 0; i < mat1.length; i++){
        for(int j = 0; j < mat1[0].length; j++){
            if(mat1[i][j] == 0){
                arrayCol[j] = true;
                arrayFil[i] = true;
            }
        }
        
        for(int k = 0; k < mat1.length; k++){
            for(int h = 0; h < mat1.length; h++){
                if(arrayCol[k] || arrayFil[h]){
                    mat1[k][h] = 0;
                }        
            }
        }
    }
    return matResultado;
    }
    
    
    
    
}
