
package Biblioteca;


public class Libro extends Publicacion { 
    private String isbn; 
  
    public Libro(){ 
    this.setTitulo("sin título"); 
    this.setCantidadPaginas(1); 
    this.setIsbn("Sin ISBN"); 
    } 
    public void setIsbn(String unIsbn) { 
         this.isbn = unIsbn; 
    } 
    public String getIsbn() { 
         return isbn; 
    }
    
    @Override 
        public String toString() { 
            System.out.println("Es el toString de Libro"); 
            return this.getClass()+this.getTitulo()+"-"+ this.getCantidadPaginas()+ "-"+this.getIsbn(); 
        } 
} 
