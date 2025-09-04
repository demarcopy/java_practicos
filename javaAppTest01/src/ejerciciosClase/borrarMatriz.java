package ejerciciosClase;

public class borrarMatriz {
    
    public static void main(String[] args){
    
    }
    
    public static int[][] eliminarFilaCol(int f, int c, int[][] mat){
       int[][] ret = new int[mat.length-1][mat[0].length-1];
       //Recorro las filas      
       for(int i = 0; i < mat.length; i++){
        //Recorro columnas
        for(int j = 0; j<mat[0].length; j++){
            int fila = i;
            int col = j;
            //Si la fila en la estoy evaluando, 
            //es mayor al parametro ingresado(fila que quiero borrar)
            //cambio el valor de fila y columna (le resto)
            if(i!=f && j!=c){
                if(fila>f){
                    fila--;
                }
                if(col>c){
                    col--;
                }
                ret[fila][col] = mat[i][j];
            } 
        }
       }
    return ret;
    }
}



// Cuando este iterando el elemento a borrar.
//Evaluo si el indice es mas grande, lo reduzco.