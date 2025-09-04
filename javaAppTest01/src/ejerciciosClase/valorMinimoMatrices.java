
package ejerciciosClase;

public class valorMinimoMatrices {
    public static void main(String[] args){
    
    }
    
    public static boolean minimosEnPosiciones(int[][]mat1, int[][]mat2){
    
    int min1 = 3;
    int min2 = 4;
    boolean coincide = true;
  
        for(int i = 0; i < mat1.length && coincide; i++){
            for(int j=0; j < mat1[0].length && coincide; j++){
                if( (mat1[i][j] == min1) != (mat2[i][j] == min2) ){
                    coincide = false;
                }
            }
        }
    return coincide;
    }
}
