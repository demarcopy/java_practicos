
package Strings;

public class Ejercicios {

    public static void main(String[] args){
    
    ej2();
    
        
    
    }
    
    public static void ej1(){
    String palabra = "hello";
    
    for(int i = 0; i < palabra.length(); i++){
        String inicio = palabra.substring(i);
        String fina = palabra.substring(0,i);

        System.out.println(inicio+fina);
    }

    }
    
    public static void ej2(){
    String palabra1 = "Hola";
    String palabra2 = "Mundo";


    
    for(int i = 0; i < palabra2.length(); i++){
        if(i == palabra1.length()){
            System.out.println(" " + palabra2.charAt(i));
        }else{
            System.out.println(palabra1.charAt(i) + "" + palabra2.charAt(i));

        }
    
    }
    
   
    
    
    }
    
    public static void ej3(){
        
    boolean palindroma = true;
    String palabra = "Anilina";
    
for (int i = 0; i < palabra.length() && palindroma; i++) {
    if(palabra.charAt(i) != palabra.charAt(palabra.length()-i)){
        palindroma = false;
    }
    }
        
    }
    
    
}


