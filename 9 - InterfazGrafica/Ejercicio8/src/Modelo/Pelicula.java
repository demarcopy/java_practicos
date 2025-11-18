
package Modelo;


public class Pelicula {
    private String titulo;
    private int duracion;
    
    public Pelicula(String unTitulo, int unaDuracion){
        setTitulo(unTitulo);
        setDuracion(unaDuracion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
}
