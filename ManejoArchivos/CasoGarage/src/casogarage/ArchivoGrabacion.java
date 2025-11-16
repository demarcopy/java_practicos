
package casogarage;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;


public class ArchivoGrabacion {
    private Formatter out;
    
    
    public ArchivoGrabacion(String nombre){
        try{
            this.out = new Formatter(nombre);
        }catch(FileNotFoundException e){
            System.out.println("No se puede crear");
            System.exit(1);
        } 
    }
    
    public ArchivoGrabacion(String nombre, boolean ext){
        try{
            FileWriter f = new FileWriter(nombre,ext);
            this.out = new Formatter(f);
        }catch(IOException e){
            System.out.println("No se puede crear");
            System.exit(1);
        }
    }
    
    public void grabarLinea(String linea){
        this.out.format("%s%n", linea);
    }
    
    public void cerrar(){
        this.out.close();
    }    
}
