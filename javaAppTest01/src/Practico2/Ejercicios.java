package Practico2;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicios {

    public static void main(String[] args){
    
     int[] arrayEj = {6, 1, 5, 4, 3, 2, 9, 8, 7};
     System.out.print(ej10(arrayEj));

     
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
            if(ite1 < lista1.length && ite2 < lista2.length){
                if(lista1[ite1] < lista2[ite2]){
                    listaResultado[i] = lista1[ite1];
                    ite1++;
                }else{
                    listaResultado[i] = lista2[ite2];
                    ite2++;
                }
            }else{
                if(ite1 < lista1.length){
                    listaResultado[i] = lista1[ite1];
                }
                if(ite2 < lista2.length){
                    listaResultado[i] = lista2[ite2];
                }
            
            }       
        }
        System.out.println("Array cargado");
        
        for(int j = 0; j < listaResultado.length; j++){
            System.out.print(listaResultado[j] + " ");
        }
    }
    
    public static boolean numEnArray(int num, int[]arrayNum){
    boolean existe = false;
    for(int i = 0; i < arrayNum.length && !existe; i++){
        if( arrayNum[i] == num ){
            existe = true;
        }

    }
    return existe;
    }
     
    public static void ej6(int[]arrayParaCargar){
        for(int i = 0; i < 10 ; i ++){
            int numero = (int)(Math.random()*20+1);
            if(!numEnArray(numero,arrayParaCargar)){
                arrayParaCargar[i] = numero;
            }
        }
        System.out.print(Arrays.toString(arrayParaCargar));
    
    }
    
    public static int posPalabraArray(String palabra, String[]arrayPalabras){
        int posicion = -1;
        for(int i = 0; i < arrayPalabras.length; i++){
            if(arrayPalabras[i].equals(palabra)){
                posicion = i;
            }
        }
    return posicion;
    }

    public static String ej7(){
    Scanner input = new Scanner(System.in);
    
    //Pido al usuario que agregue la cantidad
    System.out.println("Ingrese la cantidad de nombres que juegan (Entre 5 y 30):");
    int cantidadNombres = input.nextInt();
    input.nextLine(); // consume el salto de línea que quedó
    String [] nombresIngresados = new String[cantidadNombres];
    
    // Usuario agrega los nombres necesarios
    for(int i = 0; i < nombresIngresados.length; i ++){
        System.out.println("Ingrese el nombre numero:"+ (i+1));
        nombresIngresados[i] = input.nextLine();
    }
    
    System.out.println("Ingrese el cantante");
    String nombreCantante = input.nextLine();
    
    System.out.println("Ingrese el nombre del inicio");

    String nombreInicio = input.nextLine();
    
    int inicio = posPalabraArray(nombreInicio , nombresIngresados);
    
    int iterador = 0;
    
    for(int i = 0 ; i < 17; i++){
        if(iterador == nombresIngresados.length){
            iterador = 0;
        }else {
            if(!nombresIngresados[iterador].equals(nombreCantante)){
            iterador++;
            }    
        }
    }
  
    System.out.println("El inicio es: " + inicio);    
    System.out.println("El elemento iterador es: " + iterador);
    String resultado = "El resultado es:" + nombresIngresados[iterador-1];
    return resultado;
    }

    public static int[] ej8(int[]cubo1){
    
    int[] arrayResultado = new int[cubo1.length];
                     
    for(int i = 0; i < cubo1.length; i++){
        int min = Integer.MAX_VALUE;
        int posMinimo = 0;
        for(int j = 0; j < arrayResultado.length; j++){
            if(cubo1[j] < min){
                min = cubo1[j];   
                posMinimo = j;
            }     
        }
        arrayResultado[i] = min;
        cubo1[posMinimo] = Integer.MAX_VALUE;
    }
    System.out.println(Arrays.toString(arrayResultado));
    
    return arrayResultado;
    }
    

    public static boolean ej9Sort(int[] tarjetas){
    Arrays.sort(tarjetas);
    boolean puede = false;
    for(int i = 0; i < tarjetas.length-2 && !puede; i++){    
        if(tarjetas[i] == tarjetas[i + 1] - 1 && tarjetas[i] == tarjetas[i + 2] - 2){      
            puede = true;
        }       
    }
    return puede;
    } 
    
    public static boolean amigasSinSort(int[] tarjetas) {
    boolean puede = false;
    for (int i = 0; i < tarjetas.length - 2 && !puede; i++) {
        for (int j = i + 1; j < tarjetas.length - 1 && !puede; j++) {
            for (int k = j + 1; k < tarjetas.length && !puede; k++) {
                if (tarjetas[i] != tarjetas[j] && tarjetas[i] != tarjetas[k] && tarjetas[j] != tarjetas[k]) {
                    if ((Math.abs(tarjetas[i]-tarjetas[j]) == 1 || Math.abs(tarjetas[i]-tarjetas[k]) == 1)
                            && (Math.abs(tarjetas[j]-tarjetas[i]) == 1 || Math.abs(tarjetas[j]-tarjetas[k]) == 1)
                            && (Math.abs(tarjetas[k]-tarjetas[i]) == 1 || Math.abs(tarjetas[k]-tarjetas[j]) == 1)) {
                    puede = true;
                    }
                }
            }
        }
    }
    return puede;
    }

    public static int ej10(int[] peces){
    int cantidad = 0;
    int maximo = 0;
    for (int i = 0; i < peces.length-1; i++) {
        if (peces[i] > peces[i+1]){
            cantidad++;
            maximo = Math.max(maximo, cantidad);
        }else {
        cantidad=0;
        }
    }
        return maximo;
    }
         
}


