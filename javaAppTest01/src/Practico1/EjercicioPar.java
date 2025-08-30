
package Practico1;


public class EjercicioPar {
    public static void main(String[] args){
    

    }
    public static boolean cantidadImpar(int[] datos){
   
    boolean esImpar = false;
    int suma = 0;
    for(int i = 0; i < datos.length; i++){
        if(datos[i] == 1){
            suma ++;
        }
    }
    if(suma%2 == 1){
        esImpar = true;
    }
    return esImpar;
    }
    
}
