
package Practico4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[]args){

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
     String retorno = "NO";

     int cont1 = 0;
     int cont2 = 0;

     for (int i = frase.indexOf(secuencia1); i != -1; i = frase.indexOf(secuencia1, i +secuencia1.length())){
        cont1++;
     }
     for (int i = frase.indexOf(secuencia2); i != -1; i = frase.indexOf(secuencia2, i + secuencia2.length())){
        cont2++;
     }
     if (cont1 == cont2){
     retorno = "SI";
     }
     return retorno;
    }
    
    public static String mismasLetras(String frase1, String frase2){
        boolean existenTodas = true;
        String retorno = "SI";
        for(int i = 0; i < frase2.length()&& existenTodas; i++){
            String letra = frase2.charAt(i) + "";
            if(!frase1.contains(letra)){
                existenTodas = false;
            }
        }
    if(!existenTodas){
        retorno = "NO";
    }
    return retorno;
    }

    public static String formatoMail(String correo){
        String[] palabras = correo.split("@");
        String primeraLetra = palabras[0].charAt(0) + "";
        String ultimaLetra = palabras[0].charAt(palabras[0].length()-1) + "";
        int cantAsteriscos = palabras[0].length()-2;
        String resultado = primeraLetra; 
        
        for(int i = 0; i < cantAsteriscos; i++){
            resultado = resultado + "*";
        }
        
        resultado = resultado + ultimaLetra +"@" + palabras[1];
            
        return resultado;
        
    }
    
    public static void Porcentajes(String codigo){
        int contadorVocales = 0;
        int contadorDigitos = 0;
        String listaVocales = "aeiou";
        String listaNumeros = "123456789";
        double porcentajeVocales;
        double porcentajeNumeros;
        
        for(int i = 0; i < codigo.length(); i++){
            String letra = codigo.charAt(i) +"";
            if(listaVocales.contains(letra.toLowerCase())){
                contadorVocales++;
            }
            if(listaNumeros.contains(letra)){
                contadorDigitos++;
            }        
        }
        porcentajeVocales = (double) contadorVocales / codigo.length() * 100;
        porcentajeNumeros = (double) contadorDigitos / codigo.length() * 100;

       
        System.out.println(porcentajeVocales + "%"+ " " + porcentajeNumeros+"%");
    
    }

    public static String caraAleatoria(){
        int sumaCara = 0;
        double porcentajeCara;
        int sumaCruz = 0;
        double porcentajeCruz;
        String resultado;
        for(int i = 0; i < 1000; i++){
            //1 es cara - 0 cruz
            int numero = (int)(Math.random()*2);
            if(numero == 1){
                sumaCara++;
            }else{
                sumaCruz++;
            }  
        }
        
        porcentajeCara = ((double)sumaCara / 1000) * 100;
        porcentajeCruz = ((double)sumaCruz / 1000) * 100;
        
        resultado = "El porcentaje de cara es:" + porcentajeCara +"  " + "El porcentaje de cruz es:" + porcentajeCruz;
        return resultado;
    }

    public static String raicesCuadratica(int a, int b, int c){
    
    String resultado;
      
    double discriminante = Math.pow(b, 2) - 4 * a * c;

    if(discriminante < 0){
        resultado = "Imaginario";
    }else{
        if(discriminante == 0){
            resultado = "Una sola raiz";
        }else{
            resultado = "Dos raices";
        }
    }

    return resultado;
            
            
    }
}
