
package Practico4;

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
    
    public static void ej3(String palabra, char letra){
    
    for(int i = 0 ; i < palabra.length(); i++){
        
        
        if(palabra[i] == letra)
    
    }
        
        
    }
    
    
    
    
    
    
}
