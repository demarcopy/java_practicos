package ejerciciosClase;

//Quiero agregar un numero a una matriz, el ultimo numero se puede borrar
public class agregarNumero {
    
    public static void main(String[] args){
    }
    

    public static void agregarNumero(int[][] mat, int num){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j ++){
                if(num < mat[i][j]){
                    int aux = mat[i][j];
                    mat[i][j] = num;
                    num=aux;
                }
            }
        }
        
    }
    
}
