package practicaParciales;


public class p22505pn {
    public static void main(String[]args){
          
        String[][] matriz = {
            {"Alma", "casa", "Sol", "AZUCAR", "Celeste", "azul", "Verde"},
            {"taller", "ANA", "abrir", "ayer", "Sol", "negro", "Amarillo"},
            {"Rojo", "Beatriz", "barco", "bueno", "AUTO", "malo", "violeta"},
            {"buscar", "BIPOLAR", "atar", "12344", "SUPER", "bimensual", "bienes"}
        };
        
        System.out.println(cantidades(matriz));
    }
    

public static boolean inRange(int[] datos, int num){
    return num >= 0 && num < datos.length;
}    
    
public static boolean esCrecienteEspecial(int[] datos){
    boolean esCreciente = true;
    boolean elemRepetido = false;
    //Estrictamente creciente
    //No mas de un repetido
    //La suma debe ser par
    int suma = 0;
    for(int i = 0 ; i < datos.length; i++){
        if(inRange(datos,i-1)){
            if(datos[i-1] > datos[i]){
                esCreciente = false;
            }else{
                if(datos[i-1] == datos[i]){
                    if(inRange(datos,i-2)){
                        if(datos[i-2] == datos[i-1] || elemRepetido == true){
                            esCreciente = false;
                        }
                    }
                elemRepetido = true;
                }       
            }
        }       
        suma = suma + datos[i];                  
    }
    if(suma % 2 != 0){
        esCreciente = false;
    }
    

    return esCreciente;
}



public static int cantidadEspeciales (int[][] mat){
    int cantEspeciales = 0;

    for(int i = 0; i < mat.length; i++){
        int[] fila = new int[mat.length];
        
        for(int j = 0; j < mat[0].length; j++){
            fila[i] = mat[i][j];
        
        }
        if(esCrecienteEspecial(fila)){
            cantEspeciales = cantEspeciales + 1;
        }   
    }
     
    for(int j = 0; j < mat[0].length; j++){
        int[] columna = new int[mat[0].length];
        
        for(int i = 0; i < mat.length; i++){
            columna[j] = mat[i][j];
        
        }
        if(esCrecienteEspecial(columna)){
            cantEspeciales = cantEspeciales + 1;
        }
    
    }
    
    return cantEspeciales;
}

public static boolean cantidades(String[][] mat){

    int filaLimite = mat.length/2;
    int palabrasA = 0;
    int palabrasB = 0;
    
    
    for(int i = 0; i < mat.length; i++){
        for(int j = 0; j < mat[0].length; j++){
            String letra = mat[i][j].substring(0);
            
            if(i <= filaLimite && letra.equalsIgnoreCase("a")){
                palabrasA = palabrasA +1;
            }
             if(i > filaLimite && letra.equalsIgnoreCase("b")){
                palabrasA = palabrasB +1;
            }       
        }
    
    }
    return palabrasA == palabrasB;
}










}
