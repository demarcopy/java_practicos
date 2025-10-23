
import java.util.ArrayList;

package Biblioteca;

public class Material { 
    private String titulo; 
    private ArrayList<String> clientes = new ArrayList<String>();
  
    //Constructor
    public Material(){ 
        this.setTitulo("sin titulo"); 
        
        System.out.println("Estoy en el constructor de Material");
    } 
    
    public String getTitulo() { 
     return titulo; 
    } 
    public void setTitulo(String unTitulo) { 
     this.titulo = unTitulo; 
    } 
    
    @Override 
    public String toString() { 
     return this.getClass() + this.getTitulo(); 
    }
    
}
