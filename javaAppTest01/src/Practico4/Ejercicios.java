
package Practico4;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[]args){
        
        System.out.println(agregada("hola","hbola"));
    }
    
    public static void ej1(){
        String palabra1 = "Hola";
        String palabra2 = "Auto";
        String palabra3 = "Rodrigo         ";
        
        System.out.println(palabra1.equals(palabra2));
        
        System.out.println(palabra1.indexOf("O"));
        
        System.out.println(palabra1.length());
        
        System.out.println(palabra1.toUpperCase());
        
        System.out.println(palabra1.toLowerCase());
                       
        System.out.println(palabra1.equalsIgnoreCase("auto"));
        
        System.out.println(palabra3.trim());
    }
    
    public static void ej2(){
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        
        System.out.println(Math.max(numero1, numero2));
        
        System.out.println(Math.min(numero1, numero2));
        
        System.out.println(Math.abs(numero1));



    }
    
    public static void ej3(){
    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra:");
        String palabra = in.nextLine();
        System.out.println("Ingrese una letra:");
        String letra = in.nextLine();

                
        int contador = 0;
        for(int i = 0 ; i < palabra.length(); i++){
            if( (""+palabra.charAt(i)).equals(letra)   ){
                contador ++;
            }

        } 
    System.out.println("La palabra tiene "+ contador + "de veces la letra" ); 
    }
    
    public static void ej4(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra con espacios");
        String palabra = in.nextLine();
        String resultado = "";
        
        for(int i = 0; i < palabra.length(); i++){
            String letra = ""+palabra.charAt(i);
            if(!letra.equals(" ")){
                resultado = resultado + letra;
            }            
        }         
        System.out.println(resultado);
    }

    public static void ej5(String palabraLarga){
        int contadorA = 0;
        int maximoContiguo = 0;
        
        for(int i = 0; i < palabraLarga.length(); i++){
            char letra = palabraLarga.charAt(i);
        
            if(letra == 'A'){
                contadorA++;
                if(contadorA > maximoContiguo){
                    maximoContiguo = contadorA;
                }                
            }else{
                contadorA = 0;
            }
        }   
        System.out.println("El maximo es" + maximoContiguo);
    }

    public static String agregada(String primera, String segunda){
        String resultado = "";

        for(int i = 0; i < segunda.length(); i++){
            String letra = segunda.charAt(i) + "";
            if(!primera.contains(letra)){
                resultado = letra;
            }
      
        }
        return resultado;
        
    
    }

    public static String mismaCantidad(String frase, String secuencia1, String secuencia2){
    
        
    }
    
    public static boolean inRange(String palabra, int largo){
        return 
    }
    
}
