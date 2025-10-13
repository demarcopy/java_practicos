package ejemploObjetos;

public class Persona {
    private String nombre;
    private int sueldo;
        
    public Persona(){
    
    }
    
    public Persona(String unNombre, int unSueldo){
        this.nombre = unNombre;
        this.sueldo = unSueldo;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public int getSueldo(){
        return this.sueldo;
    }    
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public void setSueldo(int unSueldo){
        this.sueldo = unSueldo;
    }   
    public void incrementarSueldo(int unSueldo){
    
    
    }
    
    
}
