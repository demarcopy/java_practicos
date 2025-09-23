
package claseJuegos;


class Juego {
    private String nombre;
    private int edadMax;
    private int edadMin;
    private Fabricante fabricante;
    
    //Constructor
    public Juego(){
        this.nombre = "Sin nombre";
        this.edadMin = 1;
        this.edadMax = 5;
    }
    
    public Juego(String unNombre, int edad1, int edad2){
        this.nombre = unNombre;
        this.edadMin = Math.min(edad1, edad2);
        this.edadMax = Math.max(edad1,edad2);
        
    }
   
    //Metodo Static
    public boolean esAplicableEdad(int edad){
        boolean flag = false;
        if(edad >= this.getEdadMinima() && edad<=this.getEdadMinima()){
            flag=true;
        }
        return flag;
    }
    
    
    
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getEdadMaxima(){
        return this.edadMax;
    }
    public int getEdadMinima(){
        return this.edadMin;
    }
    
    
    //Setters
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }  
    public void setEdadMax(int unaEdadMaxima){
        this.edadMax = unaEdadMaxima;
    }  
    public void setEdadMin(int unaEdadMinima){
        this.edadMin = unaEdadMinima;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "Edad" + this.getEdadMinima() + this.getEdadMaxima();
    }
    
}
