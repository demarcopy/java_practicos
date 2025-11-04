
package ManejoArchivos;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


public class ArchivoLectura {
    private Scanner in;
    private String linea;
    
    public ArchivoLectura(String nombre){
        try{
            this.in = new Scanner(Paths.get(nombre));
        }catch(IOException e){
            System.out.println("Error");
            System.exit(1);
        }
    }
    
    public boolean hayMasLineas(){
        boolean hay = false;
        this.linea = null;
        if(this.in.hasNext()){
            this.linea = this.in.nextLine();
            hay = true;
        }
        return hay;
        
    }
    
    public String linea(){
        return this.linea;
    }
    
    public void cerrar(){
        this.in.close();
    }
}
