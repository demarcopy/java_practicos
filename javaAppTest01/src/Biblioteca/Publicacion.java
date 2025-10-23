package Biblioteca;


public class Publicacion extends Material { 
    private int cantidadPaginas; 
    
    public Publicacion(){ 
        this.setTitulo("sin título"); 
        this.setCantidadPaginas(1);
        System.out.println("Estoy en el constructor de Publicacion");
    } 
    
    public int getCantidadPaginas() { 
     return cantidadPaginas; 
    }   

    public void setCantidadPaginas(int unaCantidadPaginas) { 
     this.cantidadPaginas = unaCantidadPaginas; 
    } 
 
    @Override 
    public String toString() { 
     return this.getClass()+this.getTitulo()   + "-"+   this.getCantidadPaginas(); 
    }      
}
