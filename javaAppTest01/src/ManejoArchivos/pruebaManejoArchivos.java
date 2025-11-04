
package ManejoArchivos;

import java.io.IOException;


public class pruebaManejoArchivos {
    public static void main(String[]args) throws IOException{
        
        /*
        ArchivoLectura arch = new ArchivoLectura("Archivo_test");
        while(arch.hayMasLineas()){
            System.out.println(arch.linea());
        }
        arch.cerrar();
        */
        
        listarn("Archivo_test.txt", 2);
    }
    
    public static void listarn(String nombre, int n){
        ArchivoLectura arch = new ArchivoLectura(nombre);
        int van = 0;
        while(arch.hayMasLineas()){
            System.out.println(arch.linea());
            van++;
            if(van%n==0){
                System.out.println(" ");
            }
        }
        arch.cerrar();
    
    }

}
