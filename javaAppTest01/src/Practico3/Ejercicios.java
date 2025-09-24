package Practico3;

import java.util.Arrays;

public class Ejercicios {
    public static void main(String[] args){
        
        //int[][] nuevaMatriz = cargarMatriz(5,6);
        //int[][] nuevaMatriz2 = {{1,1,5,1,1}, {1,1,1,1,1}, {5,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}, {1,1,5,1,1}};
        int[][] matrizPrueba = {{1,0,0,1},{0,0,1,12}, {0,1,0,-3}};
        
        imprimirMatriz(matrizPrueba);
        
        
        System.out.println("El resultado es:" +  ej8(matrizPrueba));
    
    
    }
    
    public static int[][] cargarMatriz(int filas, int columnas){
        int[][] nuevaMatriz = new int[filas][columnas];    
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                nuevaMatriz[i][j] = (int)(Math.random() * 10 + 1);
            }
        }
        return nuevaMatriz;
    }
    
    public static void imprimirMatriz(int[][] unaMatriz){
        for(int i = 0 ; i < unaMatriz.length; i++){
            System.out.println(Arrays.toString(unaMatriz[i]));
        }
        
    }
    
    public static int ej1(int[][]matriz){
    int suma = 0;
    /*Test
        int[][] resultadosMaterias = new int[5][6];    

             for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resultadosMaterias[i][j] = (int)(Math.random() * 10 + 1);
                }
            }    
            for (int i = 0; i < resultadosMaterias.length; i++) {
            System.out.println(Arrays.toString(resultadosMaterias[i]));
        }
    */    

    
    for(int i = 0; i < matriz.length; i ++){ 
        for(int j = 0; j < matriz[0].length; j++){
            suma = suma + matriz[i][j];
        }   
    }
    
    return suma / (matriz.length * matriz[0].length);
    }
    
    public static int[] ej2(int[][]matrizCuadrada){
        
        int[] resultado = new int[matrizCuadrada[0].length];
            
        for(int j = 0; j < matrizCuadrada[0].length; j++){ //Columnas
            int suma = 0;
            for(int i = 0; i < matrizCuadrada.length; i++){  //Filas
                suma = suma + matrizCuadrada[i][j];
            }
            resultado[j] = suma;
        }
        return resultado;
        }

    public static boolean ej3(int[][] matrizCuadrada){
        int sumaFilaRes = 0;
        int sumaColumnaRes = 0;
        int sumaDiagonal = 0;
        boolean perfecta = true;

        //Validar Filas
        for(int i = 0; i < matrizCuadrada.length && perfecta; i++){
            int sumaFila = 0;
            for(int j = 0; j < matrizCuadrada[0].length; j++){
                sumaFila +=  matrizCuadrada[i][j];
                if(i-j == 0){
                    sumaDiagonal += matrizCuadrada[i][j];
                }                             
            }    
            
            if(i == 0){
                sumaFilaRes = sumaFila;
            }else{
                if(sumaFila != sumaFilaRes){
                    perfecta = false;
                }
            }
        }
    
        //Validar columnas
        for(int j = 0; j < matrizCuadrada[0].length && perfecta; j++){
            int sumaColumna = 0;
            for(int i = 0; i < matrizCuadrada.length; i++){
                sumaColumna += matrizCuadrada[i][j];
            }
            
            
            if(j == 0){
                sumaColumnaRes = sumaColumna;
            }else{
                if(sumaColumna != sumaColumnaRes){
                    perfecta = false;
                }
            }
        }
        
        //Validar diagonal
        if(sumaDiagonal != sumaColumnaRes || sumaDiagonal != sumaFilaRes){
            perfecta = false;
        }
        
        return perfecta;
    }
     
    public static boolean ej4(int[][] matrizCuadrada, int fila, int columna){
    
    int valor = matrizCuadrada[fila][columna];
    boolean repetido = false;
    
    //Arriba Izquierda
    int i = fila-1;
    int j = columna-1;
    while(i >= 0 && j >= 0 && !repetido){
        if(matrizCuadrada[i][j] == valor){
            repetido = true;
        }
        i--;
        j--;
    }
    
    //Arriba Derecha
    i = fila -1;
    j = columna+1;
    while(i >= 0 && j < matrizCuadrada[0].length && !repetido){
        if(matrizCuadrada[i][j] == valor){
            repetido = true;
        }
        i--;
        j++;   
    }
    
    // Abajo Izquierda
    i = fila + 1;
    j = columna -1;
    while(i < matrizCuadrada.length && j >= 0 && !repetido){
        if(matrizCuadrada[i][j] == valor){
            repetido = true;
        }
        i ++;
        j --;
    }
    
    // Abajo derecha
    i = fila + 1;
    j = columna +1;
    while(i < matrizCuadrada.length && j < matrizCuadrada[0].length && !repetido){
        if(matrizCuadrada[i][j] == valor){
            repetido = true;
        }
        i++;
        j++;
    }
    
        
    return repetido;   
        
    
    }
   
    public static boolean inRange(int i, int j, int[][]matriz){
        return i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length;
    }
    
    public static int ej5(int[][] mat){
    
    int resultado = 0;
    
    for(int i = 0; i < mat.length; i ++){
        for(int j = 0; j < mat[0].length; j++){    
            
            if(!inRange(i,j,mat)){
                resultado += 1;
            }else{
                //Arriba
                if(mat[i][j] == 1 && mat[i][j-1]==0){
                    resultado += 1;
                }
                //Abajo
                if(mat[i][j] == 1 && mat[i+1][j]==0){
                    resultado += 1;
                }
                if(mat[i][j] == 1 && mat[i][j+1]==0){
                    resultado += 1;
                }
                if(mat[i][j] == 1 && mat[i-1][j]==0){
                    resultado += 1;
                }        
            }

        }
    }
    System.out.println("La fila 1 es:" + resultado);       
    
    return resultado;
    }

    public static boolean ej6(int[][] mat){
        int num1 = 2;
        int num2 = 1;
        int numero = mat[num1][num2];
        
        boolean repetido = false;
        boolean valido;
        
        //Arriba izquierda
        int it1 = num1 - 1;
        int it2 = num2 - 1;
        
        valido = inRange(it1,it2,mat);
        
        while(valido && !repetido){
            if(!inRange(it1,it2,mat)){
                valido = false;
            }else{
                if(numero == mat[it1][it2]){
                repetido = true;
            }
            it1--;
            it2--;              
            }
        }        
        
        //Arriba Derecha
        it1 = num1 - 1;
        it2 = num2 + 1;
        
        valido = inRange(it1,it2,mat);
        
        while(valido && !repetido){
            if(!inRange(it1,it2,mat)){
                valido = false;
            }else{
                if(numero == mat[it1][it2]){
                repetido = true;
            }
            it1--;
            it2++;              
            }
        }          
            
        //Abajo izq
        it1 = num1 + 1;
        it2 = num2 - 1;
        
        while(valido && !repetido){
            if(!inRange(it1,it2,mat)){
                valido = false;
            }else{
                if(numero == mat[it1][it2]){
                repetido = true;
            }
            it1++;
            it2--;               
            }
        }

        //Abajo Derecha
        it1 = num1 - 1;
        it2 = num2 + 1;
        
        valido = inRange(it1,it2,mat);
        
        while(valido && !repetido){
            if(!inRange(it1,it2,mat)){
                valido = false;
            }else{
                if(numero == mat[it1][it2]){
                repetido = true;
            }
            it1--;
            it2++;              
            }
        }   
        
        
    
    
    
        return repetido;
    }

    public static int ej7(int[][] mat){
        int puntos = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    int unosPuntos = puntajePosicion(mat,i,j);
                    puntos += unosPuntos;
                }
            }           
        }
        return puntos;
        }
        
    public static int puntajePosicion(int[][]mat, int fila, int col){
        int res;
        int filaDistancia = Math.min(fila, mat.length-1 - fila);
        int colDistancia = Math.min(col, mat[0].length-1 - col);
        int distMenor = Math.min(filaDistancia, colDistancia);
        res = distMenor+1;
        return res;
    }
  
    public static boolean ej8(int[][] mat){
    boolean reducida = true;
        for(int i = 0; i < mat.length && reducida; i++){
            boolean encontro = false;
            for(int j = 0; j < mat[0].length && !encontro; j++){  
                if(mat[i][j] != 0){
                    if(!columnaEnCero(mat,i,j)){
                        reducida = false;
                    }
                encontro = true;
                }  
            }     
        }
    return reducida;    
    }
    
    public static boolean columnaEnCero(int[][]mat, int fila, int col){
        boolean resultado = true;
        for(int i = 0 ; i < mat.length; i++ ){
            if(mat[i][col] != 0 && i !=fila){
                resultado = false;
            }
        }
        return resultado;
    }
}
