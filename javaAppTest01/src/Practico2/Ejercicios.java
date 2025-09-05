package Practico2;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicios {

    public static void main(String[] args){
    
        int[]array1 = new int[10];
        
        ej6(array1);
    }

    public static void ej1(){
        /*
        1) Ingresar un array de valores positivos. Mostrar como histograma los datos del array. Ej: (5,4,1,2)
        desplegaría:
        5 *****
        4 ****
        1 *
        2 **
        */
        
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
    
    


    public static void ej7(){
    /*
     7) “En la casa de Pinocho...todos cuentan hasta ocho:...pinuno, pindos, pintres, pincuatro, pincinco, 
    pinseis, pinsiete, pinocho!.” Este tradicional cantito es el que usan los niños para elegir al azar uno de 
    ellos en un grupo. Los niños se disponen en círculo y el responsable del canto, ubicado en el centro 
    del círculo, va señalando consecutivamente a cada uno diciendo en voz alta una palabra del canto. 
    Al que le toca la última palabra de la canción es el elegido. Se ingresará desde teclado una lista de 
    nombres (entre 5 y 30), luego que se termina la lista se indica cuál va a cantar al centro y desde cuál 
    se comienza. El programa debe informar a quién se elegirá. 
    Ejemplo: 
    Se ingresan: Nicolás Andrés Mariana Inés Marcelo Matías Mauricio Daniel. Mariana cantará y se 
    comienza con Matías. El programa debe indicar que el elegido será Daniel. 
        */
    Scanner input = new Scanner(System.in);
    
    System.out.println("Ingrese la cantidad de nombres que juegan (Entre 5 y 30):");
    int cantidadNombres = input.nextInt();
    String [] nombresIngresados = new String[cantidadNombres];
    
    for(int i = 0; i < nombresIngresados.length; i ++){
        System.out.println("Ingrese el nombre numero:"+ i);
        input.next();
        nombresIngresados[i] = input.nextLine();
    }
    
    System.out.println("Ingrese el cantante");
    String cantante = input.nextLine();
    
    System.out.println("Ingrese el nombre del inicio");

    String inicio = input.nextLine();
    
    
    int iterador = 0;
    
    /*
    for(int i = 0; i < nombresIngresados.length; i ++){
        System.out.println(nombresIngresados[i] + " ");
    }
    */
    
    
    String [] listaNombres = {"Nicolas" ,"Andrés", "Mariana", "Inés", "Marcelo", "Matías", "Mauricio", "Daniel", "Mariana", "Matías"};
    /*
    for(int i = 5; i < listaNombres.length; i++){
        if(i+1 == listaNombres.length){
            i = 0;
        }
        
        for(int j = 0; j < 8; j++){
        
        }
        
    }
    */
    
    
    }

}


