
package Persistencia;

import java.io.Serializable;

public class Persona implements Serializable{
    private String Nombre;
    private Animal animal;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Persona(String nombre) {
        this.Nombre = nombre;
    }

    @Override
    public String toString() {
        return Nombre + "-" + animal;    
    }
    
    
    
}
