
package matrices;

public class multiplicarMatrices {
    public static void main(String[] args){
    }

    public static int[][] multiplicarMatrices(int[][]matA, int[][]matB){
        //Misma cantidad de filas que A - Mismas columnas que B
        int[][] matC = new int[matA.length][matB[0].length];
        for(int i = 0; i < matA.length; i++){
            for(int j = 0; j < matB[0].length; j++){
            int suma = 0;
                for(int k = 0; k < matA[0].length; k++){
                    suma += matA[i][k] * matB[k][j];
                }
            matC[i][j] = suma;
            }
        }
    return matC;
    }
}
