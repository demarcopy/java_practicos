
package Practico2;
import java.util.Scanner;

/*
1) Ingresar un array de valores positivos. Mostrar como histograma los datos del array. Ej: (5,4,1,2)
desplegaría:
5 *****
4 ****
1 *
2 **
*/

public class Ejercicio1 {

    public static void main(String[] args){
    ej5();
    }

    public static void ej1(){
        Scanner in = new Scanner(System.in);
           
        int[] lista1 = new int[5];
        
        for(int i = 0; i < lista1.length; i++){
           System.out.println("Ingrese el dato " + (i+1));
           lista1[i] = in.nextInt();
        }
        System.out.println("Gracias");
 
        for(int i = 0; i < lista1.length; i++){
           System.out.print(lista1[i]);
           for(int j = 0; j < lista1[i]; j++){
               System.out.print("*");
           }
        
        }
    }

    public static void ej2(){
        // Leer 10 numeros y mostrarlos en orden inverso al ingresado.
        Scanner in = new Scanner(System.in);
        int[] lista1 = new int[10];

        for(int i = 0; i < lista1.length; i++){
            System.out.println("Ingrese el dato " + (i+1));
            lista1[i] = in.nextInt();
        }
        System.out.println("Numeros ingresados");

        for(int j = lista1.length-1; j >= 0 ; j = j-1 ){
            System.out.print(lista1[j] + " ");
        }
    }
    
    public static void ej3(){
    /* 3) Leer 10 números. Al final indicar si están ordenados ascendentemente, descendentemente o no
ordenados. */
        Scanner in = new Scanner(System.in);
        int[] lista1 = new int[5];
        boolean ordenadoAsc = true;
        boolean ordenadoDesc = true;
        
        for(int i = 0; i < lista1.length; i++){
            System.out.println("Ingrese el numero: " + (i+1));
            lista1[i] = in.nextInt();
        }
        System.out.println("Numeros ingresados");
        
        for(int j = 0; j < lista1.length-1 ; j++){
           if(lista1[j] > lista1[j+1]){
               ordenadoAsc = false;
           }
           if(lista1[j+1] > lista1[j]){
               ordenadoDesc = false;
           }
        }
        
        if(ordenadoAsc){
            System.out.println("Esta ordenado de forma ascendente");
        }
        if(ordenadoDesc){
            System.out.println("Esta ordenado descendente");
        }
        if(!ordenadoDesc && !ordenadoAsc){
            System.out.println("No esta ordenado");
        }
    }
    

    public static void ej4(){
        System.out.println("hola");
    }
    

    public static void ej5(){
    /*Dados dos arrays ordenados, generar un tercer array con el resultado de la intercalación ordenada.
Ej: [10, 20, 50], [1, 2, 20, 24, 80], resultado: [1, 2, 10, 20, 20, 24, 50, 80]  */
    
        int[] lista1 = {2,4,6,8};
        int[] lista2 = {3,5,7,9};

        int largoResultado = lista1.length + lista2.length;
        int[] listaResultado = new int[largoResultado];

        int ite1 = 0;
        int ite2 = 0;
        
        for(int i = 0; i < listaResultado.length; i++){
            if(lista1[ite1] < lista2[ite2]){
                listaResultado[i] = lista1[ite1];
            }else{
                listaResultado[i] = lista2[ite2];
            }
        }
        System.out.println("Array cargado");
        
        for(int j = 0; j < listaResultado.length; j++){
            System.out.print(listaResultado[j] + " ");
        }
    }
    

    
    
    
    
    
    
    
    
    
}


